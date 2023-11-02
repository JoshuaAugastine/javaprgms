package Assesment2;

import java.util.Scanner;

public class LargeXsmall {
	

	public static void main(String[] args) {
		
		int n,max,min;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the number of elements  :");
		n=s.nextInt();
		int arr[]=new int[n];
		System.out.println("enter the elements of array :");
		for(int j=0;j<n;j++) {
			arr[j]=s.nextInt();

		}for(int x :arr) {
			
		System.out.print(x +" ");}
		System.out.println();
		max=arr[0];
		min=arr[0];
		for (int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}	System.out.println("maximum value: "+max);
		for (int i=0;i<n;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}	System.out.println("minimum value: "+min);

	}

}
