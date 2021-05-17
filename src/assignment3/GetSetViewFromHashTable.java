package assignment3;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class GetSetViewFromHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer,String> map=new Hashtable<Integer,String>(); 
        map.put(1,"Paul");    
        map.put(2,"Ringo");   
        map.put(3,"George");    
        map.put(4,"John");  
	 
	    Set<Integer> keys = map.keySet();

	    System.out.println("Set of Keys contains: ");
	 
	    Iterator<Integer> it = keys.iterator();
	    while(it.hasNext()){
	       System.out.println(it.next());
	    }     
	}
}
