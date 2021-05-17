package first;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		
        int itemA = 200, itemB=80, itemC = 150;


        double total_amt;
        
        double disc,tax;
        total_amt = ((3*itemA) + (5*itemB) + (2*itemC));
        
        disc = (0.15 * total_amt);
        
        total_amt = total_amt - disc;
        
        tax = (0.02 * total_amt);
        
        total_amt += tax; //shorthand notation
        
        System.out.println("The amount is:" + total_amt);
     //  total_amt = total_amt + tax;
        
        if(total_amt>=2000)
        {
            System.out.println("Congrats, you won a coupon!");
        }
        else
        {
            System.out.println("Thank you for visiting the store");
        }
	}

}
