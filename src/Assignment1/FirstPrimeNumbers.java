package Assignment1;

public class FirstPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder  primeNumbers = new StringBuilder();

		int a=1;
		int times = 0;
		while(times< 10)
	    { 		  	  
          int counter=0; 	  
          for(int i = a; i > 0; i--)
          {
             if(a%i==0)
             {
            	 counter = counter + 1;
             }
          }
          
          if (counter == 2)
          {
	     //Appended the Prime number to the String
        	  primeNumbers = primeNumbers.append( "," + a);
        	  times++;
          }
          a++;
	     }	
	       System.out.println("First 10 prime numbers: ");
	       System.out.println(primeNumbers.toString().replaceFirst(",", ""));
	       
	   
	}

}
