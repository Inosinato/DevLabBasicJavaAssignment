package lab14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<Integer, String> hashmap = new HashMap();
         
		    hashmap.put(1,"One");
		    hashmap.put(2,"Two");
		    hashmap.put(3,"Three");
		    hashmap.put(4,"Four");
		    hashmap.put(5,"Five");
		    hashmap.put(6,"Six");  
		    
		    List<String> ls = new ArrayList();
		    
		    Iterator ks = hashmap.entrySet().iterator();
	    	
	        while(ks.hasNext())
	        {
	        	Map.Entry obj=(Entry)ks.next();
	        	ls.add((String) obj.getValue());
	        }
	        
	        System.out.println("Elements in list are: ");
	        for (String s : ls) {
				System.out.println(s);
			}
	}

}
