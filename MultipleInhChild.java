package class3;

public class MultipleInhChild implements MultipleInhParent1,MultipleInhParent2 {


	public double div(double num1, double num2) {
		
		return num1/num2;
	}


	public double sub(double num1, double num2) {
		
		return num1-num2;
	}
	
	public static void main(String[] args) {
		MultipleInhChild child = new MultipleInhChild();
		System.out.println(child.sub(10, 5));
		System.out.println(child.div(10, 5));
	}

}
