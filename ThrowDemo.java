package class4;

public class ThrowDemo {
	
	public void showCollegeName(String collegeName)
	{
		if(collegeName.length()==2)
		{
			throw new StringIndexOutOfBoundsException("College length is equal to 2");
		}
		System.out.println("length of chars:"+collegeName.length());
	}
	
	
	public static void main(String[] args) {
		
		ThrowDemo demo = new ThrowDemo();
		try {
		demo.showCollegeName("Te");
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("Reason:"+e.getMessage());
		}
		
		
	
	}

}
