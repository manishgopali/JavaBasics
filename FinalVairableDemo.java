package class3;

public class FinalVairableDemo {
	public static void main(String[] args) {
		final int num1= 100;
		int num2=100;
		if(num1 == 100)
		{
			num2=num1+200;
		}
		System.out.println("Num2:"+num2);
	}

}
