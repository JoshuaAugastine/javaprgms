package Array2d;

import java.util.Scanner;

public class ArrayDeletion {

	public static void main(String[] args) {
		int n,pos,del,ele;
		Scanner x = new Scanner(System.in);
		System.out.print("enter the no. of elements :");
		n = x.nextInt();
		int[] arr = new int[n];
		System.out.print("enter the elements   :");
		for(int i=0; i<n ;i++) {
		arr[i]= x.nextInt();
		}
		System.out.print("enter the postion of elements you want to delete :");
		pos = x.nextInt();
		
		System.out.println("original array :");
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]+" ");
		}
		
		int j=pos;
		while(j<n) {
			arr[j-1]=arr[j];
			j++;
		}
		n=n-1;
		System.out.println("deleted array :");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
