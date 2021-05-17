package lab13;

import java.util.TreeSet;

public class TreeSetExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeSet<Integer> set = new TreeSet<Integer>(); 
	        set.add(23);
	        set.add(56);
	        set.add(71);
	        set.add(91);
	        set.add(100);
	        
	        System.out.println("Lowest value stored in: " + set.pollFirst());
	        
	        System.out.println("Highest value stored in: " + set.pollLast());

	}

}
