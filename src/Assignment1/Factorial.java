package Assignment1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter number to calculate factorial");
		int val = reader.nextInt();
		reader.close();
		System.out.println("Factorial of " + val + " is : " + calculateFactorial(val));
	}
	
	static public int calculateFactorial(int number)
	{
		int n = 1;
		
		for(int i=number; i > 0; i--)
		{
			n = i * n;
		}
		return n;
	}

}
