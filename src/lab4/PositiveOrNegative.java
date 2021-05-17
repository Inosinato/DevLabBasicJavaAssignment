package lab4;

public class PositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PositiveOrNegative pon = new PositiveOrNegative();
		pon.numberSign(0);
	}
	
	public void numberSign(int number) {
		if(number > 0)
		{
			System.out.println("Number is positive");
		}
		else if(number == 0)
		{
			System.out.println("Number is 0");
		}
		else
			System.out.println("Number is negative");
	}

}
