package class3;

public class SuperChild extends SuperParent{
	private String data;
	
	public SuperChild(int num1, int num2, String data)
	{
		super(num1,num2);
		this.data=data;
		
	}
	public void executeAdditon()
	{
		int result= super.add(num1, num2);
		System.out.println(num1+" + "+num2+"="+result);
		System.out.println("College Name:"+data );
	}
	
	public static void main(String[] args) {
		SuperChild child = new SuperChild(10,4,"Texas");
		child.executeAdditon();
	}
	

}
