package lab6;

import java.util.Scanner;

public class AvgValue {
	int [] values = new int[5];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AvgValue av = new AvgValue();
		av.calculateAvg();
		
	}
	
	public void inputValues()
	{
		  Scanner reader = new Scanner(System.in);
		  for(int i=0; i<5; i++)
		  {
			  System.out.println("Enter value");
			  int value = reader.nextInt();
			  values[i] = value;
		  }
	  
	        reader.close();	      	        
	}
	
	public void calculateAvg() {
		int avg = 0;
		inputValues();
		for(int i=0;i < values.length ; i++) {
			avg = avg + values[i];
		}
		
		avg = avg / 5;
		System.out.println(avg);
	}

}
