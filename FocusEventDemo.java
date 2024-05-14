package unit3.class1;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class FocusEventDemo  extends JFrame  implements FocusListener{
	
	JTextField txtFirstName,txtLastName;
	
	
	public FocusEventDemo()
	{
		setBounds(10,10,500,600);
		FlowLayout layout = new FlowLayout(FlowLayout.LEFT,20,20);
		setLayout(layout);
		
		
		txtFirstName= new JTextField(20);
		txtFirstName.addFocusListener(this);
		
		txtLastName= new JTextField(20);	
		
		
		add(txtFirstName);
		add(txtLastName);
		
				
				
				
	
	
		
		
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new FocusEventDemo();
	}
	
	public void focusGained(FocusEvent e) {
		txtFirstName.setBackground(Color.green);
		
	}
	
	public void focusLost(FocusEvent e) {
		
		txtFirstName.setBackground(Color.blue);
	}
	
	
	
		
		
	}
	