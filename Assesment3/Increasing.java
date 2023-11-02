package Assesment3;

import java.util.Scanner;

public class Increasing {

	public static void main(String[] args) {
		 int n,count=0,count2=0;
	       Scanner x = new Scanner(System.in);
	       System.out.println("enter the no. of elements you want in array :");
	       n = x.nextInt();
	       int arr[]= new int [n];
	       System.out.println("enter the no. of elements you want in array :");
	       for(int i=0; i<n; i++) {
	       arr[i] = x.nextInt();
	       }
	       
	     // for(int i=0; i<n; i++) {
	    	  if(arr[n-2]<=arr[n-4]) {
	    		  count++;
	    	
	    	    System.out.println("strictly  not increasing");
	       }      	  
	       else {
	    	  System.out.println("strictly increasing");
	      
}
	    	   }
	       
	}
