package lab13;

import java.util.TreeSet;

public class TreeSetToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
        
        //add elements to TreeSet
      treeSet.add(1);
      treeSet.add(3);
      treeSet.add(2);
      treeSet.add(5);
            
       Object[] objArray = treeSet.toArray();

      for (Object object : objArray) 
		System.out.println(object);
	
	}

}
