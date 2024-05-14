package class4;

public class ArthimeticExceptionDemo {
	public static void main(String[] args) {
		
		int a=5;
		int div=0;
		
		try {
			div= a/0;
	
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
	    
		System.out.println("The division is:"+div);
		
		
	
	}

}
