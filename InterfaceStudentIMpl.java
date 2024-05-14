package class3;

public class InterfaceStudentIMpl implements InterfaceStudent{

	private String fullName;
	private String address;
	public void showStudentData() {
		System.out.println("Full Name:"+fullName);
		System.out.println("Address:"+address);
		
		
	}

	@Override
	public void setStudentData(String FullName, String address) {
		this.fullName= FullName;
		this.address=address;
		
	}
	
	public static void main(String[] args) {
		InterfaceStudentIMpl impl = new InterfaceStudentIMpl();
		impl.setStudentData("Ram Thapa", "Kalanki");
		impl.showStudentData();
	}
}
