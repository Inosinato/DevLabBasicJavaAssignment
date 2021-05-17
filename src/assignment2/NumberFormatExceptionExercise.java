package assignment2;

public class NumberFormatExceptionExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		
		try {
			x = Integer.parseInt("180c");
			System.out.println(x);
		} 
		catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("Invalid number, exception will be thrown");
			e.printStackTrace();
		}
	      
	}

}
