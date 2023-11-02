package Ass4;

import java.util.Scanner;

public class Exx2 {

	public static void main(String[] args) {
	    int i,count=0;
		Scanner x = new Scanner(System.in);
		System.out.println("enter the lenght of the element :");
		int n = x .nextInt();
		int arr[] = new int[n];
		System.out.println("enter the elements :");
		for(i=0; i<n; i++) {
		arr[i] = x.nextInt();
		}
		
		/*for(i=0; i<n; i++) {
			if(arr[i]==0) {
			arr[i] = arr[i] + arr[i] + arr[i+1];
			count++;
			
			System.out.println(arr[i]);
			}
	else {
		System.out.println(arr[i]);
	}
		}
		for(i=0; i<n; i++) {
			if(arr[i]!=0) {
			arr[i] = arr[i-1] + arr[i] + arr[i+1];
			count++;
			
			System.out.println(arr[i]);
			}
	else {
		System.out.println(arr[i]);
	}
		}*/
		
		for( i=0; i<n; i++) {
			if(i==0 && arr[0]==0)
				arr[0] = arr[1];
			else if(i==n-1 && arr[n-1]==0)
				arr[n-1]=arr[n-2];
			else if(arr[i]==0)
				arr[i]=arr[i-1]+arr[i+1];
		}
		
		for(int a : arr) {
			System.out.println(a);
			
			
			
				
		}
	
}
}