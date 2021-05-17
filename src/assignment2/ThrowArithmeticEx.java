package assignment2;

public class ThrowArithmeticEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculate(4,2);
		calculate(1,0);
	}
	
	public static void calculate (int a, int b) throws ArithmeticException
	{
		System.out.println(a/b);
	}

}
