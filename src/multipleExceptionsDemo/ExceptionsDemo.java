package multipleExceptionsDemo;

public class ExceptionsDemo {
	 public static void main(String[] args)
     {
         int num1=20,num2=2,num3;
         
         //num1=20;
         //num2=0;
         
         //try-catch
     try
     {
         num3 = num1/num2; //20/2
         System.out.println("Result of division is: " + num3);
     }
     //always put the specific exception catch blocks on top, before the generic one.
     catch(ArithmeticException ae) //catch(Exception e)
     {
         ae.printStackTrace();
         ae.toString();
     }
     catch(Exception e)//parent class of all exceptions
     {
         //handles all kinds of exceptions
         //toString() which gives you a string representation of an object
         e.printStackTrace();
         //e.toString();
     }
     //multiple catch blocks are possible. Specific Exceptions need to 
     //preceed the generic Exception catch block.
     
     
     
     num3=num1+num2;
     System.out.println("Result after addition is: "+ num3);
     System.out.println();
     num3 = num1-num2;
     System.out.println("Result after subtraction is: "+ num3);
     System.out.println();
     
     }
 }   

