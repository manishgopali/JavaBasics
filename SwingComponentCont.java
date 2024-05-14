package unit2.class2;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class SwingComponentCont  extends JFrame{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public  SwingComponentCont()
	{
		setTitle("Swing Component");
		setBounds(10,10,500,600);
		setLayout(null);
		
		JLabel lblDepartment = new JLabel("Department:");
		lblDepartment.setBounds(10,10,100,40);
		
		String[] departments= {"CSIT","BCA","BBA","BTECH"};
		JComboBox<String> cmDepartment = new JComboBox<>(departments);
		cmDepartment.setBounds(120,10,150,40);
		
		Object[][] rowData= {{1,"Manish Gopali","BCA"},{1,"Sita Nepal","BBA"},{1,"Maya Thapa","BTTECH"}};
		Object[] columnNames= {"Id","Name","Department"};
		JTable tblStudent = new JTable(rowData,columnNames);
		JScrollPane scrollPane= new JScrollPane(tblStudent);
		scrollPane.setBounds(10,60,400,200);
		
		JLabel lblStudents = new JLabel("Student List:");
		lblStudents.setBounds(10,270,100,40);
		
		String[] studentnames= {"Ram","Shyam","Sita"};
		JList<String> lstStudents = new JList<>(studentnames);
		lstStudents.setBounds(120,270,150,100);
		
		//confirmDailog
		JOptionPane.showConfirmDialog(this,"This is confirm dialog");
		
		//messageDialog
		//JOptionPane.showMessageDialog(this,"This is message dialog");
		
		
		add(lblDepartment);
		add(cmDepartment);
		add(scrollPane);
		add(lblStudents);
		add(lstStudents);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new SwingComponentCont();
	}
	

}
