package class4;

public class CustomExceptionImpl {
	
	public void ageCheck(int age) throws CustomException
	{
		if(age<18)
		{
			throw new CustomException("You are not eliggible. Your age is under 18.");
		}
		System.out.println("You ar allowed to vote");
		System.out.println("Your age i s:"+age);
	}
	
	
	
	public static void main(String[] args) {
		CustomExceptionImpl obj = new CustomExceptionImpl();
		
		try {
			obj.ageCheck(17);
		}
		
		catch(CustomException e)
		{
			System.out.println("Reason:"+e.getMessage());
		}
		finally {
			System.out.println("Inside the final block...");
		}
		
	}

}
