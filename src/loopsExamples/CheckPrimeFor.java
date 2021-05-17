package loopsExamples;

import java.util.Scanner;

public class CheckPrimeFor {
public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input the number: ");
        int num = scan.nextInt();
        
        scan.close();
        
        boolean flag = false;
        
        int count = 0;
        
        //No number is divisible by more than its half
        for(int i=2;i<=num/2;i++) //initialization : i=2
        {
            //i= divisor
            if(num%i == 0) //6%2 == 0 : non-prime nos.
            { 
                flag = true;
                System.out.println(flag);
            }
            count++;
            
        }
    }
}
