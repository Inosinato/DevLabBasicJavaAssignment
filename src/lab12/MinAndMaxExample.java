package lab12;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MinAndMaxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   List<Integer> list1 = new LinkedList<Integer>();  
	         list1.add(55);  
	         list1.add(25);  
	         list1.add(50);  
	         list1.add(99);  
	         list1.add(200);  
	         list1.add(1); 
	         
	         System.out.println("Value of maximum element from the collection: "+ Collections.max(list1));  //max of list
	         System.out.println("Value of minimum element from the collection: "+ Collections.min(list1));  //min of list
	}

}
