package lab5;

import java.util.Scanner;

public class GradingSystem {

	private int [] grades = new int[5];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GradingSystem gs = new GradingSystem();
		gs.inputGrades();
		gs.printResults();
	}
	
	public void printResults()
	{
		System.out.println();
		System.out.println("Grade for Electronics is: " + grades[0]);
		System.out.println("Grade for Engineer Drawings is: " + grades[1]);
		System.out.println("Grade for Civil is: " + grades[2]);
		System.out.println("Grade for Mechanical is: " + grades[3]);
		System.out.println("Grade for Math is: " + grades[4]);

	}
	
	public void inputGrades()
	{
		  Scanner reader = new Scanner(System.in);
		  for(int i=0; i<5; i++)
		  {
			  System.out.println("Enter grade");
			  int grade = reader.nextInt();
			  grades[i] = grade;
		  }
	  
	        reader.close();	      	        
	}

	public String calculateGrade(int grade)
	{
		if(grade < 40)
			return "Poor";
		else if(grade < 60 && grade >= 40)
			return "Average";
		else if(grade < 75 && grade >= 60)
			return "Good";
		else if(grade < 90 && grade >= 75)
			return "Very Good";
		else
			return "Excellent";
	}
}
