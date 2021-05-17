package collections.lists;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	public static void main(String args[])
    {  
        //coding to interfaces : keeping the references of the parent type and pointing to child type objects
        
                    
     // create a new ArrayList using reference of parent interface List - size as 34
        //int to Integer : primitive to wrapper class : JVM handles on its own
        
        
    List al = new ArrayList(34);  
    al.add(45354);//int
    al.add(345);
    al.add("Deepti");
    al.add(454545454);
    al.add("Amit");  //add is the method for insertion
    al.add(true);//boolean
    al.add('v');  //char
    al.add(null);  
    al.add("Deepti");  
    al.add("sdfsdfds");//String
        
     
     System.out.println("Size of the list is:" + al.size());
    
     //can contain multiple data types
     //can dynamically grow n shrink
     //can contain null elements also
     //insertion order maintained
    
     //different data types in one list : possible
 // index starts from 0 
    for(int j=0;j<al.size();j++)
    {  
        //arr[j]
      System.out.println("" +al.get(j));  //get() is used to fetch the value at a particular index
    }  
    
    
    //first occurrence of the element
    int ind = al.indexOf("Deepti");
    System.out.println("Index is: " + ind);
    
    //add(index, value)
    
     //insertion and removal both from the middle of the list, using indices is possible.
     //add(value)
    al.add(8,"Sachin");  
    
    System.out.println("The element at 2nd position: "+al.get(1)); //random access
    
    
    //arr[index] in case of arrays - arrlist.get(index)
    
    for(int j=0;j<al.size();j++)
    {  
      System.out.println("" +al.get(j));  //get() is used to fetch the value at a particular index
    } 
   }  
}
