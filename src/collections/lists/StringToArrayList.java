package collections.lists;

import java.util.Arrays;
import java.util.List;

public class StringToArrayList {
	public static void main(String[] args)
    {  
        //array to arrayList
        String[] words = {"hi", "boom", "hello", "friend", "dear"};  
        
        //Arrays has a static method called asList() to convert an array into ArrayList
        
        //parameterization
        List<String> list = Arrays.asList(words);  
        
        System.out.println("As a list:" +list);
    
        for (String e : list)
        {  
            System.out.print(" "+ e);  
        }  
    }  
}
