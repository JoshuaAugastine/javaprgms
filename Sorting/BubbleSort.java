package Sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		int n,temp;
		Scanner x = new Scanner(System.in);
		System.out.print("enter the no. of elements :" );
		n = x.nextInt();
		int a[]=new int[n];
		System.out.print("enter the of elements :" );
		for(int i=0; i<n; i++) {
		a[i] = x.nextInt();
		}
		for(int step=0; step<n-1; step++) {
			for(int i=0; i<n-step-1; i++) {
				if(a[i]>a[i+1]) {
					temp=a[i];
				    a[i]=a[i+1];
				    a[i+1]=temp;
				}
				
			}
		
		}
		System.out.println("after sorting :");
		for(int i=0; i<n; i++) {
			System.out.print( a[i]+" ");
		}
	}
	}


