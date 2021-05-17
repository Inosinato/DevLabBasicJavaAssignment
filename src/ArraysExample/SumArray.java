package ArraysExample;

import java.util.Scanner;

public class SumArray {
	
public static void main(String[] args) {
        
        int[] arr = new int[5]; //declaration
        
        //int[] arr = {10,56,34,2,7}; //declaration n initialization together
        
        int sum =0;
        
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the elements of the array");
        
        for(int i=0;i<5;i++)//indexing starts from 0 - go from 0 to 4
        {
            arr[i] = reader.nextInt(); //arr[0] = 50; arr[1]=60; arr[2] = 80; arr[3] = 100; arr[4] = 120
        }
        
        reader.close();
        
        //basic for
        //5 elements - 0 to 4
         /* for(int i=0;i<arr.length;i++)  //arr.length : length gives me the size of the array : length is a property
          {
              sum = sum + arr[i]; 
            //  sum -= arr[i];
            //  sum += arr[i];  //short-hand notation
          }*/
         
        //JVM finds out the loop counter from the size of the array passed
        //enhanced for loop - for-each loop
          ///type var: collection/array var stores the type of data inside the array
         for(int num : arr)//num=arr[0] //(datatype variable : collection object)
         { 
             //sum = sum + num
             sum+=num; //sum = sum+num; }
         }
         
        System.out.println("Sum is " +sum);
    }
}
