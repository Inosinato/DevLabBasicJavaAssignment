package abstraction;

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // creating the Object of Terrestrial class 
        // and using Animal class reference. 
     
     //Classreference name is asame as the constructor being called
     
// Terrestrial object1 = new Terrestrial("Elephants");
        //reference type = object type : 
     //with inheritance : my reference can be of super class, and point to different child objects
        Animals object1 = new Terrestrial("Elephants");
        
        //reference of the super class - point to a sub class object 
        object1.basicDetails("are terrestrial animals."); //from animals
        object1.habitat(); //from terrestrial
        object1.respiration(); //from terrestrial
        
                
       object1 = new Aquatic("Fishes"); //polymorphism
        System.out.println(" "); 
        // creating the Objects of circle class 
        //object1 = new Amphi("");
        
        //Overriding- runtime polymorphism 
        
       Animals object2 = new Terrestrial("Lions");
        object2.basicDetails("Lions are terrestrial animals");
        
       object2 = new Aquatic("Fishes"); 
        object2.basicDetails("are aquatic animals."); 
        
      
        
     //   object2.habitat(); 
     //   object2.respiration(); 
        
      //  Animals object3 = new Aquatic();
        
	}

}
