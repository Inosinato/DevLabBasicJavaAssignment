package lab8;

import java.util.Scanner;

public class CompareStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter first string");
		String a = reader.next();
		System.out.println("Enter second string");
		String b = reader.next();
		
		reader.close();
		
		if(a.equals(b)) 
			System.out.println("Strings are equal");
		else
			System.out.println("Strings are not equal");
		
	}

}
