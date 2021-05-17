package lab7;

import java.util.Scanner;

public class SortString {
	
	String[] values = new String [4];

	public static void main(String[] args) {
		
		
		String strArr[] = {"Ciaz", "Alto", "Swift", "Dezire", "Brezza"};
		
		SortString ss = new SortString();
		System.out.println("Original");
		SortString.print(strArr);
		System.out.println();
		ss.sort(strArr);
		SortString.print(strArr);
		
	}
	 
	public void inputValues()
	{
			  Scanner reader = new Scanner(System.in);
			  for(int i=0; i<4; i++)
			  {
				  System.out.println("Enter value");
				  String value = reader.next();
				  values[i] = value;
			  }
		  
		        reader.close();	      	        
	}
	
	public void sort(String [] str) {
		String temp;
		System.out.println("Strings in sorted order:");
		for (int j = 0; j < str.length; j++) {
	   	   for (int i = j + 1; i < str.length; i++) {
			// comparing adjacent strings
			if (str[i].compareTo(str[j]) < 0) {
				temp = str[j];
				str[j] = str[i];
				str[i] = temp;
			}
		   }
		}
	}
	
	static public void print(String[] strArr)
	{
		for(String str:strArr)
		{
			System.out.print(str + ",");
		}
	}
}
