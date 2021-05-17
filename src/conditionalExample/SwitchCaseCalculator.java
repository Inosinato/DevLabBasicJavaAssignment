package conditionalExample;

import java.util.Scanner;

public class SwitchCaseCalculator {

	 public static void main(String[] args) {
		    //int to double conversion is implicit  
		    double num1, num2, output = 0.0;
		    
		   Scanner scan = new Scanner(System.in);
		   System.out.println("Enter the first number: ");
		   num1 = scan.nextDouble();
		   
		   System.out.println("Enter the second number: ");
		   num2 = scan.nextDouble();
		   
		   System.out.println("Enter the mathematical operator: ");
		   
		   //int n = scan.nextInt();
		   //double f = scan.nextDouble();
		   
		   char operator = scan.next().charAt(0); //charAt(0) is giving me the first character in that line
		   
		   //char is at 0th index of the input stream 
		   //indices always begin with 0 in Java
		 
		   scan.close();
		   
		   switch(operator) //d : char variable
		   {
		        case '+'://+
		            output = num1 + num2;
		            break;
		        
		        case '-'://-
		            output = num1 - num2;
		            break;
		            
		        case '*'://*
		            output = num1 * num2;
		            break;
		            
		        case '/':
		            output = num1 / num2;
		            break;
		            
		        case '%':
		            output = num1 % num2;
		            break;
		            
		        default: //&, @
		            System.out.println("You have entered an incorrect operator");
		   }
		   
		      System.out.println("The output is:" +output);
		    }
}
