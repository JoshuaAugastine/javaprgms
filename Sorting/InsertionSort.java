package Sorting;

import java.util.Scanner;

public class InsertionSort {
	static void Insertionsort(int a[],int n) { // using static void is used to get value from user
		for(int step=1; step<n; step++) {
			int key=step;
			for(int i=step-1; i>=0; i--) {
				if(a[i]>a[key]){
					int temp = a[i];
					a[i] = a[key];
					a[key] = temp;
				 key--;
				}
			}
		}
			
	}
		 static void printarray(int a[] , int n) {
			  for(int i=0; i<n; i++) {
				  System.out.print(a[i]+" ");
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
	       Insertionsort(a,n);
	       System.out.println("elements aftr the Insertionsort");
	       printarray(a,n);


	}

}
