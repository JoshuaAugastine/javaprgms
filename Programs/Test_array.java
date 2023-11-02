package Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Test_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] intArray = { 1,2,3,4,5};
       String intArrayString = Arrays.toString(intArray);
       System.out.println(intArray);
       for(int val: intArray) {
    	   System.out.println(val+",");
       }
       System.out.println("\n" + intArrayString);
    	   
    	   //........using scanner
       int arr[]= {0,0,0,0,0};
       Scanner x = new Scanner (System.in);
       System.out.println("Enter the array element:");
       for(int i=0;i<5;i++) {
    	   arr[i]=x.nextInt();
       }
       System.out.println("Array elements are:");
       for(int a:arr) {
    	   System.out.println(a);
    	   
       }
       
       }
	}


