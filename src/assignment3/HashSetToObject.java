package assignment3;

import java.util.HashSet;

public class HashSetToObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashSet<String> set=new HashSet<String>(); 

        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        
        Object[] obj = new Object[set.size()];
        
        int ai = 0;
        
        for (String s : set) {
			obj[ai] = s;
			ai++;
		}
        
        System.out.println("Printing array of objects");
        for (Object object : obj) {
			System.out.println(object);
		}
	}

}
