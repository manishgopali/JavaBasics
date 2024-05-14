package class3;

public class ChildClassMethodOverriding extends ParentClassMethodOverriding {
	public void ShowCollegeDetails(String collegeName, String collegeAddress)
	{
		System.out.println("From Child Class.");
		System.out.println("College Details:"+collegeName+ "\n"+collegeAddress);
	}
	
	public static void main(String[] args) {
		ParentClassMethodOverriding parent = new ParentClassMethodOverriding();
		parent.ShowCollegeDetails("Trinity","kathmandu");
		
		ParentClassMethodOverriding parent1 = new ChildClassMethodOverriding();
		parent1.ShowCollegeDetails("Texas","Baneshwor");
	}

}
