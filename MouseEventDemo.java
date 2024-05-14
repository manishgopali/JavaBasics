package unit3.class1;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class MouseEventDemo  extends JFrame implements MouseListener{
	
	
	JLabel lblResult;
	JTextField txtFirst,txtSecond;
	
	
	public MouseEventDemo()
	{
		setBounds(10,10,500,600);
		FlowLayout layout = new FlowLayout(FlowLayout.LEFT,20,20);
		setLayout(layout);
	
		txtFirst = new JTextField(20);
		txtSecond = new JTextField(20);
		
		
		
		lblResult= new JLabel("Result :");
		lblResult.addMouseListener(this);
		
		
		
		
		
		

		add(txtFirst);
		add(txtSecond);
		
		add(lblResult);
		
		
		
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new MouseEventDemo();
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		double num1= Double.parseDouble(txtFirst.getText());
		double num2= Double.parseDouble(txtSecond.getText());
		double result= 0.0;
	    
		result= num1+num2;
		lblResult.setText(""+result);
		
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		double num1= Double.parseDouble(txtFirst.getText());
		double num2= Double.parseDouble(txtSecond.getText());
		double result= 0.0;
	    
		result= num1-num2;
		lblResult.setText(""+result);
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		double num1= Double.parseDouble(txtFirst.getText());
		double num2= Double.parseDouble(txtSecond.getText());
		double result= 0.0;
	    
		result= num1*num2;
		lblResult.setText(""+result);
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		double num1= Double.parseDouble(txtFirst.getText());
		double num2= Double.parseDouble(txtSecond.getText());
		double result= 0.0;
	    
		result= num1/num2;
		lblResult.setText(""+result);
		
	}
	
	

}
