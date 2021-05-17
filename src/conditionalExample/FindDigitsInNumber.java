package conditionalExample;

import java.util.Scanner;

public class FindDigitsInNumber {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        //int n = 7;
        
        int n;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter the number:");
        
        n = scan.nextInt();
        
        scan.close();
        
        if(n>=0 && n<10)
        {
            System.out.println("1-digit");
        }
        else if(n<100 && n>=10)
        {
            System.out.println("2-digit");
        }
        else if(n>=100 && n<1000)
        {
            System.out.println("3-digit");
        }
        else if(n<10000 && n>=1000)
        {
            System.out.println("4-digit");
        }
        else if(n<100000 && n>=10000)
        {
            System.out.println("5-digit");
        }
        else
        {
            System.out.println("number is not in 1 & 99999");
        }
    }
}
