package unit3.class1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ActionEventDemo  extends JFrame{
	
	JTextField txtFirst,txtSecond;
	JButton btnAdd;
	JLabel lblResult;

	public ActionEventDemo()
	{
		setBounds(10,10,500,600);
		FlowLayout layout = new FlowLayout(FlowLayout.LEFT,20,20);
		setLayout(layout);
		
		txtFirst = new JTextField(20);
		txtSecond = new JTextField(20);
		btnAdd= new JButton("Add");
		lblResult= new JLabel("Result :");
		
		btnAdd.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				int data1= Integer.parseInt(txtFirst.getText());
				int data2= Integer.parseInt(txtSecond.getText());
				int result= data1+data2;
				lblResult.setText(""+result);
				
			}
		});
		
		
		
		
		
		add(txtFirst);
		add(txtSecond);
		add(btnAdd);
		add(lblResult);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new ActionEventDemo();
	}
}
