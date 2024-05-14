package class3;

public class MethodOverloadingDemo {
	
	public void add(int num1, int num2)
	{
		int result = num1 +num2;
		System.out.println("Sum of "+num1+"+"+num2+"="+result);
	}
	
	
	public void add(double num1, double num2)
	{
	   double result = num1 +num2;
		System.out.println("Sum of "+num1+"+"+num2+"="+result);
	}
	
	public void add(String num1, String  num2)
	{
		 String result = num1+" "+num2;
		System.out.println("Name:"+result);
	}
	
	public void add(String num1, String  num2,String num3)
	{
		 String result = num1+" "+num2+" "+num3;
		System.out.println("Full Name:"+result);
	}
	public void add()
	{
		int num1= 40;
		int num2=50;
		int  result = num1 +num2;
		System.out.println("Sum of "+num1+"+"+num2+"="+result);
	}
	
	public static void main(String[] args) {
		MethodOverloadingDemo obj = new MethodOverloadingDemo();
		obj.add();
		obj.add(12,13);
		obj.add(11.2,3.4);
		obj.add("Manish","Gopali");
		obj.add("Manish","Kumar","Gopali");
	}

}
