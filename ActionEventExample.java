package unit3.class1;

//import java.awt.FlowLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JTextField;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class ActionEventExample  extends JFrame implements ActionListener{
	
	
	JLabel lblResult;
	JTextField txtFirst,txtSecond,txtResult;
	JButton btnAdd,btnSub,btnMul,btnDiv;
	
	public ActionEventExample()
	{
		setBounds(10,10,500,600);
		FlowLayout layout = new FlowLayout(FlowLayout.LEFT,20,20);
		setLayout(layout);
	
		txtFirst = new JTextField(20);
		txtSecond = new JTextField(20);
		
		btnAdd= new JButton(" + ");
		btnAdd.addActionListener(this);
		btnAdd.setActionCommand("Add");
		
		btnSub= new JButton(" - ");
		btnSub.addActionListener(this);
		btnSub.setActionCommand("Sub");
		
		btnMul= new JButton(" * ");
		btnMul.addActionListener(this);
		btnMul.setActionCommand("Mul");
		
		btnDiv= new JButton(" / ");
		btnDiv.addActionListener(this);
		btnDiv.setActionCommand("Div");
		
		lblResult= new JLabel("Result :");
		
		
		
		
		
		

		add(txtFirst);
		add(txtSecond);
		add(btnAdd);
		add(btnSub);
		add(btnMul);
		add(btnDiv);
		add(lblResult);
		
		
		
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new ActionEventExample();
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		String btnId = e.getActionCommand();
		double num1= Double.parseDouble(txtFirst.getText());
		double num2= Double.parseDouble(txtSecond.getText());
		double result= 0.0;
		
		if(btnId.equals("Add"))
		{
			result= num1+num2;
		}
		else if(btnId.equals("Sub"))
		{
			result=num1-num2;
			
		}
		else if(btnId.equals("Mul"))
		{
			result=num1*num2;
		}
		
		else if(btnId.equals("Div"))
		{
			result=num1/num2;
		}
		lblResult.setText(""+result);
	}

}
