package assignment3;

import java.util.Hashtable;
import java.util.Scanner;

public class KeyExistInHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer,String> map = new Hashtable<Integer,String>(); 
        map.put(1,"Paul");    
        map.put(2,"Ringo");   
        map.put(3,"George");    
        map.put(4,"John");     
	 
	    Scanner reader = new Scanner(System.in);
	    System.out.println("Enter key to know if hash table");
	    int value = reader.nextInt();
	    reader.close();
	    
	    boolean exists = map.containsKey(value);
	    System.out.println(value + " key exists in Hashtable ? : " + exists);  
	}

}
