package Assignment1;

import java.util.Scanner;

public class Finobacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter number to calculate fibonacci sequence");
		int val = reader.nextInt();
		reader.close();
		calculateFibo(val);
		
	}
	
	static public void calculateFibo(int number)
	{
		int n1 = 0, n2 = 1, result;
		System.out.print(n1 + "-" + n2 + "-") ;
		
		for(int i=2; i < number; ++i) 
		{    
		  result=n1+n2;  
		  System.out.print(result + "-");
		  n1=n2;    
		  n2=result;    
		}    
		
	}
	

}
