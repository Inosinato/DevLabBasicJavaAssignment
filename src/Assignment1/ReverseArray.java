package Assignment1;

import java.util.Scanner;

public class ReverseArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter size of array");
		int [] arr = new int[reader.nextInt()];

		for(int i=0; i<arr.length; i++)
		{
			  System.out.println("Enter value");
			  int value = reader.nextInt();
			  arr[i] = value;
		}
	  
	    reader .close();		
		
		System.out.println("original array");
		print(arr);
		reverseArray(arr);
		System.out.println("reversed array");
		print(arr);
	}

	
	static public void reverseArray(int[] array)
	{
		int temp; 
		
		if(array.length % 2 == 0)
		{
			for(int i = 0; i <= ((array.length-1) / 2); i++) {
				temp = array[i];
				array[i] = array [array.length - 1 - i];
				array[array.length - 1 - i] = temp;
			}
		}
		else
		{
			for(int i = 0; i < ((array.length-1) / 2); i++) {
				temp = array[i];
				array[i] = array [array.length - 1 - i];
				array[array.length - 1 - i] = temp;
			}
		}
		
	}
	
	static public void print(int[] array)
	{
		for(int i:array)
		{
			System.out.print(i);
		}
		System.out.println();
	}
	
	
}
