package assignment3;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> as = new ArrayList<>();
		
		as.add("Dog");
		as.add("Cat");
		as.add("Snake");
		as.add("Cow");
		as.add("Horse");
		as.add("Pig");
		
		System.out.println("List before sort");
		
		for(String s:as) {
			System.out.println(s);
		}
		
		Collections.sort(as);
		
		System.out.println("List after sort");
		
		for(String s:as) {
			System.out.println(s);
		}
	}

}
