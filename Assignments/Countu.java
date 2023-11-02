package Assignments;

import java.util.Scanner;

public class Countu {

	public static void main(String[] args) {
		int count=0;
		Scanner x = new Scanner(System.in);
		System.out.println("enter the total no. of element:");
		int n = x.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the elements:");
		for(int i=0; i<n; i++) {
			arr[i]=x.nextInt();
		}
		System.out.println("enter the countable element:");
		int m = x.nextInt();
		
		for(int i=0; i<n; i++) {
			if(arr[i] == m) 
			count++;
			
		}
		System.out.println("total count :"+ count);
	}
	}
