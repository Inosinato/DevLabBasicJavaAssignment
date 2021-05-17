package lab9;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			int num = 20; int num2 = 0;
			int num3 = num / num2;
			System.out.println(num3);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Broke");
			ae.printStackTrace();
		}
		finally
		{
			System.out.println("Program complete");
		}
	}

}
