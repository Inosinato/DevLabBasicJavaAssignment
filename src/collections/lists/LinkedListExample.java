package collections.lists;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	 public static void main(String[] args)
     {  
         //Creating list of Books 
             
         List<Book> list=new LinkedList<Book>(); 
         
         //Creating Books  
         
         Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
         Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
         Book b3=new Book(103,"Operating System","Galvin","Wiley",6); 
         
         //Adding Books to list  
         list.add(b1);  
         list.add(b2);  
         list.add(b3);
         
      //   list.add(null);
         
     //    System.out.println("The initial list is:" + list);
         
         //Traversing list  
         for(Book b:list)
         {  
           //System.out.println("Direct access : " + b);
           System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
         } 
         
        list.remove(b2);
       
        // remove();
        // list.remove(b1);
         
           //Traversing list  after remove
             System.out.println("\n After removal, the list is:");
             for(Book b:list)
             {  
                 System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
             }
         }  
}
