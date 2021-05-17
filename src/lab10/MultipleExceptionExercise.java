package lab10;

public class MultipleExceptionExercise {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numbers = {1,2,3,4};
		
		try {
			int n = numbers[0] / numbers[1];
			
			int n2 = numbers[0] / 0;
			
			int n3 = numbers [4];
			
			int nu = (Integer) null;
			
			int n4 = nu * 5;
		}
		catch(ArithmeticException | IndexOutOfBoundsException | NullPointerException e)
		{
			e.printStackTrace();
		}
	}

}
