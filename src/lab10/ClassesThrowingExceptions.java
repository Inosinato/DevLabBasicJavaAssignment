package lab10;

import java.io.IOException;

public class ClassesThrowingExceptions extends SuperiorClass {

	
	public void methodWithException()
	{
		System.out.println("Child class method");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  SuperiorClass sc = new ClassesThrowingExceptions(); 
		    try { 
		        sc.methodWithException(); 
		    } catch (IOException e) { 
		        e.printStackTrace(); 
		    } 
	}

}

class SuperiorClass {
	
	public void methodWithException() throws IOException 
    { 
        System.out.println("SuperClass"); 
    } 
}

