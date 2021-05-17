package lab11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> example = new ArrayList();
		example.add("example");
		example.add("an");
		example.add("is");
		example.add("This");
		example.add(3, "of the class");
		
		for (String s : example) {
			System.out.println(s);
		}
		
		System.out.println(example.get(4) + " " + example.get(2) + " " + example.get(1) + " " + example.get(0) + " " + example.get(3));
	}

}
