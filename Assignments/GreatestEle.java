package Assignments;

import java.util.Scanner;

public class GreatestEle {

	public static void main(String[] args) {
		int n,max=0;
		Scanner x = new Scanner (System.in);
		System.out.println("Enter the total no. of elements :");
		n = x.nextInt();
		int flag=0;
		int arr[] = new int[n];
		System.out.println("Enter the array of elements :");
		for(int i=0; i<n; i++) {
			arr[i]=x.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			if(arr[i] == arr[n-1]) {
				System.out.println(arr[i]+ "->-1");
				flag=1;
			}
	    for(int j=i+1; j<n; j++) {		
	    	if(arr[i] < arr[j]) { 
	    		System.out.println(arr[i]+ "->"+arr[j]);
	    		flag=1;
			break;
			}
	       }
	    if(flag==0)
	    	System.out.println(arr[i]+"->-1");
	    flag=0;
	   }
      }
  }
