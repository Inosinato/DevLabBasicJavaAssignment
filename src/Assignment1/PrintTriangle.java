package Assignment1;

import java.util.Scanner;

public class PrintTriangle {
	
    static String matrix[][];


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangleTriangle();
		equilateralTriangle();
	}
	
	static void equilateralTriangle()
	{		
		Scanner reader = new Scanner(System.in);
		 System.out.println("Enter the base of the triangle");
		 int base = reader.nextInt();
		 reader.close();
		 
	     matrix = new String[base*2][base*2];

		 
		System.out.println("Equilateral Triangle");
	
		
		for(int a = 0; a < base; a++) {
			for(int b = 0; b < (base*2) ; b++) {
				matrix[a][b] = " ";
			}
		}
		
		for(int a = 0; a < base;  a++)
		{
			for(int b = 0; b < base*2; b++)
			{
				for(int c = 0; c <= a; c++)
				{
					int cal = base - 1 - c;
					int cal2 = base - 1 + c;
					
					if(a%2 == 0)
					{
						if(cal%2 == 0)
						{
							matrix[a][cal] = "0";
							matrix[a][cal2] = "0";
						}
					}
					else
					{
						if(cal%2 != 0)
						{
							matrix[a][cal] = "0";
							matrix[a][cal2] = "0";
						}
					}
				
				}
			}
		}
		
		for(int a = 0; a < base; a++) {
			for(int b = 0; b < base*2; b++) {
				System.out.print(matrix[a][b]);
			}
			System.out.println();
		}
		System.out.println("");
		
	}
	
	static void rectangleTriangle()
	{
		System.out.println("Rectangle Triangle \n");
		matrix = new String[10][10];

		for(int i = 0; i < 10; i++)
        {
        	for(int j = 0; j < i+1; j++)
        	{
        		matrix [i][j] = "0";
        	}
        }
		
		for(int a = 0; a <10; a++) {
			for(int b = 0; b < a+1; b++) {
				System.out.print(matrix[a][b]);
			}
			System.out.println();
		}
		System.out.println("");
	}
	
}
