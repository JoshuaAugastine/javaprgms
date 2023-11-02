package Assignments;

import java.util.Scanner;

public class SecZ {

	public static void main(String[] args) {
		int i;
		Scanner x = new Scanner(System.in);
		System.out.println("enter the total no. of element:");
		int n = x.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the elements:");
		for(i=0; i<n; i++) {
			arr[i]=x.nextInt();
		}
		int min = arr[0];
		for( i=1;i<n;i++) {
			if(arr[i] < min)
				min=arr[i];  }
		System.out.println("minimum element :" + min);
		
      for(i=n-1; i>0; i--) {
    	  if(arr[i] != arr[i-1])
    		  break;
      }
      System.out.println("sec minimum element :" + arr[i-1]); 
     }
}
