package assing3.Q8;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

@SuppressWarnings("serial")
public class MovieRentalSystemGUI  extends JFrame{
	
	JTextField txtTitle,txtGenere,txtLanguage,txtLength;
	JLabel lbltitle,lblGenere,lblLanguage,lblLength;
	JButton btnOk;


     
	
	public MovieRentalSystemGUI() {
		
		
		  setBounds(10,10,500,600);
	      setLayout(null);
	      
	      
	     lbltitle = new JLabel("Title :");
	     lbltitle.setBounds(10, 15, 100, 50);
	     
	     txtTitle = new JTextField();
	     txtTitle.setBounds(115, 25, 200, 25);
         
	     lblGenere = new JLabel("Genere :");
	     lblGenere.setBounds(10, 50, 200, 50);
	     
	     txtGenere= new JTextField();
	     txtGenere.setBounds(115, 55, 200, 25);
	     
	     lblLanguage = new JLabel("Language :");
	     lblLanguage.setBounds(10, 85, 200, 50);
	     
	     txtLanguage= new JTextField();
	     txtLanguage.setBounds(115, 95, 200, 25);
	     
	     lblLength = new JLabel("Length (minutes) :");
	     lblLength.setBounds(10, 120, 200, 50);
	     
	     txtLength = new JTextField();
	     txtLength.setBounds(115, 135, 200, 25);
	     
	     btnOk = new JButton("OK");
	     btnOk.setBounds(115, 185, 200, 25);
	     
	     
	     btnOk.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                String title = txtTitle.getText();
	                String genre = txtGenere.getText();
	                String language = txtLanguage.getText();
	                int length = Integer.parseInt(txtLength.getText());

	                insertMovieIntoDatabase(title, genre, language, length);


	            }
	        });
	    

	     
	     add(lbltitle);
	     add(txtTitle);
	     add(lblGenere);
	     add(txtGenere);
	     add(lblLanguage);
	     add(txtLanguage);
	     add(lblLength);
	     add(txtLength);
	     add(btnOk);
	     
	     setVisible(true);
  	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	         
	}
	
	
	
	
	 private static void insertMovieIntoDatabase(String title, String genre, String language, int length) {
	        try 
	        {
	        	Class.forName("com.mysql.cj.jdbc.Driver");
	       	    String url = "jdbc:mysql://localhost:3306/mrs";
	            String username = "root";
	            String password = "manish123";
	        	
	        	Connection connection = DriverManager.getConnection(url,username,password);
	            String insertQuery = "INSERT INTO Movie (Title,Genere,Language,Length) VALUES (?, ?, ?, ?)";
	            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
	            preparedStatement.setString(1, title);
	            preparedStatement.setString(2, genre);
	            preparedStatement.setString(3, language);
	            preparedStatement.setInt(4, length);
	           
	            int flag =  preparedStatement.executeUpdate(); //returns the number of rows affected by the query

	            if(flag>0)
	            {
	                System.out.println("Data inserted successfully. ");

	            }else
	            {
	                System.out.println("Failed to insert. ");
	            }


	        connection.close();

	            
	            
	            
	        } catch (Exception e) {
	        	System.out.println(e.getMessage());
	        }
	    }
	 
	 public static void main(String[] args) {
			new MovieRentalSystemGUI();
		}
		

}
