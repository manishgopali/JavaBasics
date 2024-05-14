package class3;

public class GrandParentMultilevelInheritaance {
	protected String  Name;
	protected String address;
	protected String Property;
	
	public void getDetails()
	{
		this.Name="Ram Thapa";
		this.address="Kalanki";
		this.Property="house";
	
	}
	public void displayGrandParentDetails()
	{
		System.out.println("Name"+Name);
		System.out.println("Name"+address);
		System.out.println("Name"+Property);
	}
	

}
