package DataStructure;

import java.util.Scanner;

public class Deletion {

	public static void main(String[] args) {
		int ins,len,ind,j,n,pos;
		Scanner x = new Scanner(System.in);
		System.out.println("enter the no of element :");
		n=x.nextInt();
		int arr[]= new int[n];
		//dynamic array - during the execution the array size will be allocated ex; int[n]
		//static array - its a stable array size ex;int[10] 
		System.out.println("enter the array element :");
		for(int i=0; i<n ;i++) {
			arr[i]=x.nextInt();
		}
		System.out.print("insert position:");
		pos = x.nextInt();
		j=pos;
		System.out.println("Original array:");
		for(int i=0; i<n ; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("j= "+j);
		while(j<n) {
			arr[j-1]=arr[j];
			j++;
		}
		n=n-1;
		System.out.println("deleted array :");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
			
		}
		

	}

}
