package lab12;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import collections.lists.Book;

public class ReadWithIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> list=new LinkedList<Book>(); 
         
         //Creating Books  
         
         Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
         Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
         Book b3=new Book(103,"Operating System","Galvin","Wiley",6); 
         
         //Adding Books to list  
         list.add(b1);  
         list.add(b2);  
         list.add(b3);
         
         ListIterator<Book> itr = list.listIterator(); 


         while(itr.hasNext())//as long as there is a value in itr
         {    
        	 int count = itr.nextIndex();
             System.out.println("index:"+itr.nextIndex()+" value:"+itr.next().name + " " + list.get(count).author );    //itr.next()
         } 
         
         System.out.println("Traversing elements in backward direction");  
         
         while(itr.hasPrevious()) //hasPrevious() will be false as long as we haven't used itr.next()
         {    
             System.out.println("index:"+itr.previousIndex()+" value:"+itr.previous().name);    
         }   
	}

}
