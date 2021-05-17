package assignment2;

import java.util.ArrayList;
import java.util.List;

public class RepeatedChars {
	
    private static List<String> chars = new ArrayList<String>();


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String example = "This is an example of string";
		printCountOfDuplicateCharacter(example);
		
	}

	private static void printCountOfDuplicateCharacter(String input) {
	
	    for (int i = 0; i < input.length(); i++) {
	        char ch = input.charAt(i);
	
	        if (charHasBeenRevised(ch) || ch == ' ')
	            continue;
	
	        int count = 0;
	        for (int j = 0; j < input.length(); j++) {
	            if (ch == input.charAt(j)) {
	                count++;
	            }
	        }
	        System.out.println("The letter '" + ch + "' appeared " + count + " times");
	    }
	    chars.clear();
	}

	private static boolean charHasBeenRevised(char ch) {
	
	    if (chars.contains(Character.toString(ch))) {
	        return true;
	    } else {
	        chars.add(Character.toString(ch));
	    }
	    return false;
	}
}
