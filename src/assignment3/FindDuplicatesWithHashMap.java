package assignment3;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class FindDuplicatesWithHashMap {

	public static void main(String[] args) {
		
		 HashMap<String, String> hashmap = new HashMap();
         
		    hashmap.put("1","Red");
		    hashmap.put("2","Blue");
		    hashmap.put("3","White");
		    hashmap.put("4","Green");
		    hashmap.put("5","Blue");
		    hashmap.put("6","Red"); 
		    
		 Collection<String> col = hashmap.values();
		 
		 for(String s:col) {
			 if(Collections.frequency(col, s) > 1) {
				 
			 }
		 }
		 
		 
	}
}
