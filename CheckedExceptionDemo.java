package class4;

public class CheckedExceptionDemo {
	public static void main(String[] args) {
		try {
		Class.forName("");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
