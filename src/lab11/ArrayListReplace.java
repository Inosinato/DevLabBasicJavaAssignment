package lab11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> example = new ArrayList();
		example.add("example");
		example.add("other");
		
		for (String s : example) {
			System.out.println(s);
		}
		
		System.out.println("After replace");
		
		example.set(1, "Replacement");
		
		for (String s : example) {
			System.out.println(s);
		}
	}

}
