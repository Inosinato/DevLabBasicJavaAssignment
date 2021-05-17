package Assignment1;

import java.util.Scanner;

public class YearLeapChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter year");
		year = reader.nextInt();
		reader.close();
		 
		System.out.println("Is " + year + " a leap year? ");
		if(checker(year))
			System.out.println("Yes, the " + year + " is a leap year");
		else
			System.out.println("No, the " + year + " is not a leap year");
	}
	
	static boolean checker(int year)
	{
		boolean answer;
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0)
		          answer = true;
		        else
		        	answer = false;
		      }
		      else
		    	  answer = true;
		    }
		    else
		    	answer = false;
		
		return answer;
	}

}
