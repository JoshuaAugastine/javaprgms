package Array2d;

import java.util.Scanner;

public class ArrayDulpicate {

	public static void main(String[] args) {
		int n;
	    Scanner x = new Scanner(System.in);
	    System.out.println("enter the no. element  :");
	    n = x.nextInt();
	    int[] arr = new int[n];
	    System.out.print("enter the no. of elements :");
	    for(int i=0; i<n; i++) {
	     arr[i]=x.nextInt();
	    }
       for(int i=0; i<n-1; i++) {
    	   for(int j=i+1; j<n; j++) {
    		   if(arr[i]==arr[j]) {
    			   if(j!=n-1) {
    				   arr[j]=arr[j+1];
    				   
    			   }
    			   n=n-1;
    			   j--;
    		   }
    	   }
    	   
       }
      System.out.println("array elements");
      for(int i=0; i<n; i++) {
    	  System.out.println(arr[i]);
      }
      
	}

}
