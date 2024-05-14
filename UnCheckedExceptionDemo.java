package class4;

public class UnCheckedExceptionDemo {
	public static void main(String[] args)
	{
		String collegeName=null;
		int length=0; 
		try {
		
		length= collegeName.length();
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
			
		}
		
		System.out.println("Length of the given String is:"+length);
		
	}

}
