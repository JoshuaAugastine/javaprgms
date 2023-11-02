package Sorting;

import java.util.Scanner;

public class HeapSorting {

	public static void main(String[] args) {
		int n;
		Scanner x = new Scanner(System.in);
		System.out.println("enter the no. of the elements ");
		n = x.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the elements ");
		for(int i=0; i<n; i++) {
	    arr[i] = x.nextInt();
		}
		 
		for(int step=0; step<n-1 ; step++) {
			int max_idx = n-step-1;
			for(int i=n-step-2; i>=0; i--) {
				if(arr[max_idx]<arr[i]) {
					max_idx=i;
				}
			} 
			  int t= arr[max_idx];
			  arr[max_idx] = arr[n-step-1];
			  arr[n-step-1] = t;
			  //max_idx++;
		}
		System.out.println("After Heap Sorting");
		for(int i=0; i<n; i++) {
			System.out.print( arr[i]+ " ");
		}
	}
}
