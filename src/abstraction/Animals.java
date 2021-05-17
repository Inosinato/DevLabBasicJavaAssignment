package abstraction;

public abstract class Animals {
	
	 String name = " "; 
     
     // declare non-abstract methods 
     // it has default implementation
     
     public void basicDetails(String details) //concrete method
     { 
         System.out.println("---animals----"); 
         System.out.println(name + " " + details); 
     } 
        
     // abstract methods which will be implemented by its subclass(es) 
     
    public abstract void habitat();//abstract //method signatures
     
    public abstract void respiration(); 
}
