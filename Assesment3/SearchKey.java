package Assesment3;

import java.util.Scanner;

public class SearchKey {

	public static void main(String[] args) {
		int n,search,flag=0;
		Scanner x = new Scanner(System.in);
		System.out.println("enter the no. of elements :");
		n = x.nextInt();
		int[] arr = new int [n];
		System.out.println("enter the elements :");
		for(int i=0; i<n; i++) {
		arr[i]= x.nextInt();
		}
		System.out.println("enter the search element :");
		search = x.nextInt();
		System.out.println("original elements:");
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]+" ");
		}
	      
		for(int i=0; i<n; i++) {

			if(arr[i]==search) {
			System.out.println( " the search element " + " " + search + " postion at " +(i+1)+" ");
			}
		}
		
		
	}
}