package class4;

public class ThrowsDemo {
	public void showCollegeName(String collegeName) throws StringIndexOutOfBoundsException,ArithmeticException
	{
		int num1=9;
		int num2=0;
		int result=num1/num2;
		
		System.out.println("Result"+result);
		System.out.println("length of chars:"+collegeName.length());
	}
	
	
	public static void main(String[] args) {
		
		ThrowDemo demo = new ThrowDemo();
		try {
		demo.showCollegeName("Tey");
		}
		catch(StringIndexOutOfBoundsException | ArithmeticException e)
		{
			System.out.println("Reason:"+e.getMessage());
		}
		
		
	
	}


}
