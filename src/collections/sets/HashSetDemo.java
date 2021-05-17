package collections.sets;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	 public static void main(String args[])
	    {  
	        //maintains no order
	        HashSet<String> set=new HashSet<String>(); 
	        
	        //add()
	        
	           set.add("Mayank");  
	           set.add("Apoorv");  
	           set.add("Lokesh");  
	           set.add("Abhishek");
	           set.add("Ankur");
	           set.add("Shaishav");
	          
	           System.out.println("An initial list of elements: "+ set); 
	           
	       //Removing specific element from HashSet  
	           //remove()
	           set.remove("Abhishek");  
	           System.out.println("After invoking remove(object) method: "+set);  
	          
	           HashSet<String> set1=new HashSet<String>();  
	           set1.add("Ajay");  
	           set1.add("Gaurav");
	           set1.add("Deepti");
	           //adding another set to an existing set
	           
	           //list1.addAll(list2)
	           set.addAll(set1);  
	           
	           System.out.println("The updated list of elements: "+set); 
	          
	           //Removing all the new elements or a subset from an existing HashSet  
	           set.removeAll(set1);  
	           System.out.println("After invoking removeAll() method, removing recently added set: "+set);  
	           
	                                   
	           System.out.println("The elements of the set through Iterator are:");
	           
	           Iterator<String> itr=set.iterator();  //list.listIterator()
	           while(itr.hasNext())  
	           {  
	               System.out.println(itr.next());  
	           }
	           
	           //Removing elements on the basis of specified condition
	           
	           set.removeIf(str->str.contains("Lo"));
	           System.out.println("After invoking removeIf() method: "+set);
	           
	           set.add("Ankur");
	           
	         //Removing all the elements available in the set  
	           set.clear(); 
	           System.out.println("After invoking clear() method, the set is: "+set);

	    }
}
