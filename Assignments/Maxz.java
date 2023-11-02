package Assignments;

import java.util.Scanner;

public class Maxz {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("enter the total no. of element:");
		int n = x.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the elements:");
		for(int i=0; i<n; i++) {
			arr[i]=x.nextInt();
		}
		int max=arr[0];
		for(int i=0; i<n; i++) {
			if(max < arr[i]) 
				max = arr[i];
				
		}
		System.out.print(max);
	}
	}
