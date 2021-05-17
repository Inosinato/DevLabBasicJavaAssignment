package assignment2;

import java.util.Scanner;

public class IsPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Please enter a word: ");
		
		String word = reader.next();
		StringBuilder reverseWord = new StringBuilder();
		reverseWord.append(word);
		reverseWord.reverse();
		
		reader.close();
		
		if(word.contentEquals(reverseWord))
			System.out.println(word + " is a palindrome ");
		else
			System.out.println(word + " is not a palindrome");
	}

}
