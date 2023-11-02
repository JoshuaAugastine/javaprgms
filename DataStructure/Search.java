package DataStructure;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		int flag=0,sea,n;
		Scanner x = new Scanner(System.in);
		System.out.println("enter the no of element :");
		n=x.nextInt();
		int arr[]= new int[n];
		System.out.println("enter the array element :");
		for(int i=0; i<n ;i++) {
			arr[i]=x.nextInt();
		}
		System.out.print("search element:");
		sea = x.nextInt();
		
		for(int i=0; i<n ; i++) {
			if(arr[i]==sea) { 
			System.out.print("search element i at position:"  + (i+1));
		    flag=1;
		}
		}		
		if(flag==0) {
			System.out.print("invalid number");
		}
		//System.out.println();
	}
}

