package unit3.class1;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class ItemEventDemo  extends JFrame  implements ItemListener {
	
	
	JComboBox<String> cmBoxDepartments;
	
	public ItemEventDemo()
	{
		setBounds(10,10,500,600);
		FlowLayout layout = new FlowLayout(FlowLayout.LEFT,20,20);
		setLayout(layout);
		
		String[] departments = {"BCA","CSIT","IT","BBA"};
		cmBoxDepartments = new JComboBox<>(departments);
		cmBoxDepartments.addItemListener(this);
		
		add(cmBoxDepartments);
				
				
				
	
	
		
		
		
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new ItemEventDemo();
	}
	
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() >0) {
		
		String selectedValue= cmBoxDepartments.getSelectedItem().toString();
		System.out.println("Selected Item is:"+selectedValue);
		}
	}
	
		
		
	}
	