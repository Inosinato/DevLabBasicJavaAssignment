package multipleExceptionsDemo;

public class MultipleEx {
	  public static void main (String args[]) 
      {
         int array[] = {20,20,40}; //size = 3
         int num1 = 15, num2 = 0;
         int result = 0;
        
         try 
         {
             result = num1/num2;
             System.out.println("The result is" +result);
             
             for(int i = 5; i >= 0; i--) //loop goes from i=5 till i= 0 : 6 times
                {
                   System.out.println("The value of element in the array is: " +array[i]);
                }
           
         } 
         catch(Exception e)
         {
             e.printStackTrace();
         }
         System.out.println("Check");
         System.out.println("Reaching here.......");
         
      }
}
