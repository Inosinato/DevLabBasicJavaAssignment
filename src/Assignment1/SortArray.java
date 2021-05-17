package Assignment1;

import java.util.Scanner;

public class SortArray {

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
		sort(arr);
		System.out.println("ordered array");
		print(arr);
	}

	
	static public void sort(int[] array)
	{
		int temp; 
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length - 1; j++) {
				if(array[i] < array[j])
				{
					temp = array[i];
					array[i] = array [j];
					array[j] = temp;
				}
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
