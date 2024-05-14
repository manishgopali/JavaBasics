package class3;

public class ParentMultilevelInheritaance extends GrandParentMultilevelInheritaance {
	protected String education;
	protected String  empType;
	public void  getDetails()
	{
		super.Name="shyam";
		super.address="kalamati";
		super.Property="car";
		this.education="Bsc.Csit";
		this.empType="java Developer";
	}
	public void displayParentDetails()
	{
		System.out.println("Name:"+super.Name);
		System.out.println("Address:"+super.address);
		System.out.println("Property:"+super.Property);
		System.out.println("Education:"+education);
		System.out.println("Employment Type:"+empType);
		
	}

}
