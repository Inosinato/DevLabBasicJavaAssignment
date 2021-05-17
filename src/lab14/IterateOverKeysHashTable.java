package lab14;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IterateOverKeysHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer,String> map=new Hashtable<Integer,String>(); 
        map.put(1,"Paul");    
        map.put(2,"Ringo");   
        map.put(3,"George");    
        map.put(4,"John");  
        
        Iterator ks = map.entrySet().iterator();

    	System.out.println("The members of the beatles are: ");    	
    	
        while(ks.hasNext())
        {
        	Map.Entry obj=(Entry)ks.next();
        	System.out.println(obj.getValue());
        }
        
	}

}
