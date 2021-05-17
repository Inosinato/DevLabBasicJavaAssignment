package assignment3;

import java.util.TreeSet;

public class HighestAndLowestInTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeSet<Integer> set = new TreeSet<Integer>(); 
	        set.add(75);
	        set.add(21);
	        set.add(16);
	        set.add(3);
	        set.add(140);
	        
	        System.out.println("Lowest value stored in: " + set.pollFirst());
	        
	        System.out.println("Highest value stored in: " + set.pollLast());
	}

}
