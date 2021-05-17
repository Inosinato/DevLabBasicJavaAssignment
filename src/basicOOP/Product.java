package basicOOP;

public class Product {

	//attributes or properties --INSTANCE VARIABLES
    int pid;
    int price;
    String name;
  
  //float f2= 5.6f;
  //double d1 = 2.5; 
  
  public int getPid() {
      return pid;
  }

  public void setPid(int pid) {
      this.pid = pid;
  }

  public int getPrice() //return type is int
  {
      return price;//last statement in any method
  }

  public void setPrice(int price) {
      this.price = price;
  }

  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }

  
  
  //behaviour
  //called function
  void setProductDetails(int pid, int price, String name) //parameters
  {
      //this is a keyword to indicate this object
      //LHS belongs the object, RHS belongs to only this method
       this.pid= pid; 
       this.price = price; 
       this.name=name;
       
      /*
       * pid = proid; price=pr; name=nm;
       */
  }
  
  void showProductDetails()
  {
      System.out.println("ProductId is: " +pid);
      System.out.println("Price is: " +price);
      System.out.println("Name is: " +name);
  }
  
  //getter and setter methods
  
  //calling function here is main()
  public static void main(String[] args) 
  {
      // TODO Auto-generated method stub
      
      Product p1 = new Product();
      p1.setProductDetails(1,234,"Pen");
      p1.showProductDetails();
      p1.setPrice(450);
      int pr = p1.getPrice();
      System.out.println("Price returned is :" + pr);
  }

}
