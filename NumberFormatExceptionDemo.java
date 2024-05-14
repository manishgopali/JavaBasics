package class4;

public class NumberFormatExceptionDemo {
	public static void main(String[] args) {
		
		
		
		String gender="M";
		int flag=0; 
		
		try {
			 flag = Integer.valueOf(gender);
			 System.out.println("value of flag :"+flag);
			 
		
		}
		catch(NumberFormatException e)
		{
			System.out.println(e.getMessage());
		}
		
		
	}

}
