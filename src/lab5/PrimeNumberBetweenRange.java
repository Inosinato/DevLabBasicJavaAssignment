package lab5;

public class PrimeNumberBetweenRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumberBetweenRange example = new PrimeNumberBetweenRange();
		example.displayPrimeNumbers(10, 60);

	}
	
	public void displayPrimeNumbers(int a, int b)
	{
		boolean flag = false;
		
		while(a <= b)
		{
			for(int i=2 ; i < a/2 ; i++)
			{
				if(a%i == 0)
				{
					flag = true;
				}
			}
			if(flag == false)
			{
				System.out.println(a);
			}
			
			flag = false;
			
			a++;
		}
	}

}
