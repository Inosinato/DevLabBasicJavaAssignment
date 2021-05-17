package Assignment1;

public class SumFirst20Naturals {
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 1; i<21; i++)
		{
			sum = i + sum;
			
			System.out.print(sum + " ");
		}
	}

}
