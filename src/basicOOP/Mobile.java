package basicOOP;

public class Mobile extends Product {

	String brand;
    String os;//operating system
    int ram;
    
    Mobile()
    {
        super();//makes an explicit call to super class's constructor
        System.out.println("---Mobile object created--------");
    }
    
    public static void main(String[] args)
    {
        Product p1 = new Product();
        System.out.println("Product 1: " + p1);
        
        p1.setProductDetails(10,30000,"ledtv");
        
        p1.showProductDetails();
        
        Mobile mb = new Mobile();
        
        mb.setProductDetails(4, 50000, "Iphone", "Apple", "IOS", 645);
        
        //runtime polymorphism
        mb.showProductDetails();
        
    }

    //same method as in parent but different set of attributes
    //same name, different parameters : METHOD OVERLOADING
    void setProductDetails(int pid, int price, String name,String brand,String os, int ram) //parameters
    {
        //this is a keyword to indicate this object
        //LHS belongs the object, RHS belongs to only this method
         this.pid= pid; 
         this.price = price; 
         this.name=name;
         this.brand=brand;
         this.os=os;
         this.ram=ram;
    }
    
    
    //same method as in parent with same set of attributes
    //METHOD OVERRIDING
    void showProductDetails()
    {
        System.out.println("ProductId is: " +pid);
        System.out.println("Price is: " +price);
        System.out.println("Name is: " +name);
        System.out.println("Brand is: " +brand);
        System.out.println("OS is: " +os);
        System.out.println("RAM is: " +ram);
        
    }

}
