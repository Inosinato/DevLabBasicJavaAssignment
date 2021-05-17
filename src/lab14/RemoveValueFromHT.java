package lab14;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class RemoveValueFromHT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> map=new Hashtable<Integer,String>(); 
        map.put(1,"Paul");    
        map.put(2,"Ringo");   
        map.put(3,"George");    
        map.put(4,"John"); 
        map.put(5,"Michael");
        
        
        Iterator ks = map.entrySet().iterator();

    	System.out.println("Original hashtable values: ");    	
    	
        while(ks.hasNext())
        {
        	Map.Entry obj=(Entry)ks.next();
        	System.out.println(obj.getValue());
        }

        System.out.println("");
    	System.out.println("Removing " + map.get(5) + "\n");    	

        map.remove(5);
        
        
        Iterator ks2 = map.entrySet().iterator();
        
        System.out.println("After deletion hashtable values: ");    	
    	
        while(ks2.hasNext())
        {
        	Map.Entry obj=(Entry)ks2.next();
        	System.out.println(obj.getValue());
        }
	}

}
