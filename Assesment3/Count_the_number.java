package Assesment3;

import java.util.Scanner;

public class Count_the_number {

	public static void main(String[] args) {
		   int n,occ,count=0;
	       Scanner x = new Scanner(System.in);
	       System.out.println("enter the no. of elements you want in array :");
	       n = x.nextInt();
	       int arr[]= new int [n];
	       System.out.println("enter the no. of elements you want in array :");
	       for(int i=0; i<n; i++) {
	       arr[i] = x.nextInt();
	       }
	       System.out.println("count the no. of occurance:");
	       occ = x.nextInt();
	       for(int i=0; i<n; i++) {
	    	   if(arr[i]==occ) 
	    	      
	    	   count++;
	       }
	    	  System.out.println("no. of occurance of the element:"+ count);   
	    	   
	       }
}
