package abstraction;

public class Aquatic extends Animals{
	Aquatic()
    {
        System.out.println("Aquatic here");
    }
    
    Aquatic(String name) 
    { 
        // System.out.println("");
       // super(name);//explicit call to the parent class's constructor //first line in the constructor
    } 
       
    public void habitat()  
    { 
        System.out.println("live in water");  
    } 
          
    public void respiration()  
    { 
        System.out.println("respire through gills or their skin");  
    }
}
