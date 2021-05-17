package assignment2;

public class PassArgumentWhileThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ex("something");
	}
	
	public static void ex (String a) throws NumberFormatException
	{
		int num = Integer.valueOf(a);
	}

}
