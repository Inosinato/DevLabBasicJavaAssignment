package Assignment1;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter base of triangle");
		int base = reader.nextInt();
		System.out.println("Enter height of triangle");
		int height = reader.nextInt();
		
		reader.close();
		
		int area = (base * height)/2;
		
		System.out.println("Area of triangle is: " + area);
	}
	

}
