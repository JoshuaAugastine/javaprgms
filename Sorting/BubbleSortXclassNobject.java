package Sorting;

import java.util.Scanner;

public class BubbleSortXclassNobject {
	 static void bubblesort(int a[],int n) {
	for(int step=0; step<n-1; step++) {
		for(int i=0; i<n-step-1; i++) {
			if(a[i]>a[i+1]) {
				int temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
			}
		}
	}
		
}
	 static void printarray(int a[] , int n) {
		  for(int i=0; i<n; i++) {
			  System.out.println(a[i]);
		  }
	 }
	   public static void main(String[] xyz) {
		   int n;
		   Scanner x = new Scanner(System.in);
		   System.out.println("enter the no. of elements");
		   n = x.nextInt();
		   int a[]= new int[n];
		   System.out.println("enter the array of elements");
		   for(int i=0; i<n; i++) {
		   a[i]= x.nextInt();
	   }
       bubblesort(a,n);
       System.out.println("elements aftr the bubblesort");
       printarray(a,n);
	   }
	   
}
