package lab6;

import java.util.Scanner;

public class ShowMatrix {	

	private static int[][] matrixs;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cols,rows;
		matrixs = null;
		
		 Scanner reader = new Scanner(System.in);
		 System.out.println("Enter how many cols");
		 cols = reader.nextInt();
		 System.out.println("Enter how many rows");
		 rows = reader.nextInt();
	  
	     matrixs = new int[rows][cols];
	        
	        
		
		
		for(int a = 0; a < rows; a++) {
			for(int b = 0; b < cols; b++) {
				System.out.println("Enter value for " + a + "," + b + " position");
				matrixs [a][b] = reader.nextInt();
			}
			System.out.println();
		}
	  
	        reader.close();	
	        
	        for(int a = 0; a < rows; a++) {
				for(int b = 0; b < cols; b++) {
					System.out.print("!" + matrixs[a][b] + "!");
				}
				System.out.println();
			}
		
		

	}
}
	
