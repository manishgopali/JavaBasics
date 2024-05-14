package assing4.Q7;



import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


@SuppressWarnings("serial")
public class StudentRegistrationSystem  extends JFrame{
	
	JTextField txtName,txtAdddress,txtGender,txtEmail,txtPhoneno;
	JLabel lblName,lblAddress,lblGender,lblEmail,lblPhoneno;
	JButton btnRegister;


     
	
	public StudentRegistrationSystem() {
		
		
		  setBounds(10,10,500,600);
	      setLayout(null);
	      
	      
	     lblName = new JLabel("Name :");
	     lblName.setBounds(10, 15, 100, 50);
	     
	     txtName = new JTextField();
	     txtName.setBounds(115, 25, 200, 25);
         
	     lblAddress = new JLabel("Address :");
	     lblAddress.setBounds(10, 50, 200, 50);
	     
	     txtAdddress= new JTextField();
	     txtAdddress.setBounds(115, 55, 200, 25);
	     
	     lblGender = new JLabel("Gender :");
	     lblGender.setBounds(10, 85, 200, 50);
	     
	     txtGender= new JTextField();
	     txtGender.setBounds(115, 95, 200, 25);
	     
	     lblEmail = new JLabel("Email :");
	     lblEmail.setBounds(10, 120, 200, 50);
	     
	     txtEmail = new JTextField();
	     txtEmail.setBounds(115, 135, 200, 25);
	     
	     lblPhoneno = new JLabel("PhoneNo :");
	     lblPhoneno.setBounds(10, 155, 200, 50);
	     
	     txtPhoneno = new JTextField();
	     txtPhoneno.setBounds(115, 175, 200, 25);
	     
	     btnRegister = new JButton("Register");
	     btnRegister.setBounds(115, 215, 200, 25);
	     
	     
	     btnRegister.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                String name = txtName.getText();
	                String address = txtAdddress.getText();
	                String gender = txtGender.getText();
	                String email = txtEmail.getText();
	                String phoneno = txtPhoneno.getText();
	                

	                insertStudentIntoDatabase(name, address, gender, email,phoneno);


	            }
	        });
	    

	     
	     add(lblName);
	     add(txtName);
	     add(lblAddress);
	     add(txtAdddress);
	     add(lblGender);
	     add(txtGender);
	     add(lblEmail);
	     add(txtEmail);
	     add(lblPhoneno);
	     add(txtPhoneno);
	     add(btnRegister);
	     
	     setVisible(true);
  	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	         
	}
	
	
	
	
	 private static void insertStudentIntoDatabase(String name, String address, String gender, String email, String phoneno) {
	        try 
	        {
	        	Class.forName("com.mysql.cj.jdbc.Driver");
	       	    String url = "jdbc:mysql://localhost:3306/srs";
	            String username = "root";
	            String password = "manish123";
	        	
	        	Connection connection = DriverManager.getConnection(url,username,password);
	            String insertQuery = "INSERT INTO Student (name,address,gender,email,phoneno) VALUES (?, ?, ?, ?,?)";
	            PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
	            preparedStatement.setString(1, name);
	            preparedStatement.setString(2, address);
	            preparedStatement.setString(3, gender);
	            preparedStatement.setString(4, email);
	            preparedStatement.setString(5, phoneno);
	           
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
			new StudentRegistrationSystem();
		}
		

}
