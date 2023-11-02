package Assesment4;

import java.util.Scanner;

public class Que1 {

	public static void main(String[] args) {
		int n;
		Scanner x = new Scanner(System.in);
		System.out.println("enter the size of the array elements ");
		n = x.nextInt();
		int[] arr= new int[n];
		System.out.println("enter the array elements :");
		for(int i=0; i<n; i++) {
	     arr[i] =x.nextInt();
		}
		
		for(int step=1; step<n; step++) {
			int key=step;
			for(int i=step-1; i>=0; i--) {
				if(arr[i]>arr[key]){
					int temp = arr[i];
					arr[i] = arr[key];
					arr[key] = temp;
				 key--;
				}
			}
		}
		
		System.out.println("after sorting :");
		for(int i=0; i<n; i++) {
			System.out.print( arr[i]+" ");
     }
	
  }
}

