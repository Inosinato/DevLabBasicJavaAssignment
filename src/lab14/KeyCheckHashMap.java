package lab14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class KeyCheckHashMap {
	 public static void main(String[] args) {
	      
		 HashMap<String, String> hashmap = new HashMap();
            
		    hashmap.put("1","One");
		    hashmap.put("2","Two");
		    hashmap.put("3","Three");
		    hashmap.put("4","Four");
		    hashmap.put("5","Five");
		    hashmap.put("6","Six");       
		 
		    Scanner reader = new Scanner(System.in);
		    System.out.println("Enter key to know if hashmap");
		    String value = reader.next();
		    boolean exists = hashmap.containsKey(value);
		    System.out.println(value + " key exists in HashMap ? : " + exists);  
			                          
		       
		     
	 }
}
