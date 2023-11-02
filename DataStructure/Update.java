package DataStructure;

import java.util.Scanner;

public class Update {

	public static void main(String[] args) {
		int ins,element,j,n,pos;
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
		System.out.println("enter the update element :");
		element=x.nextInt();
		System.out.println("Original array:");
		for(int i=0; i<n ; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		arr[pos-1]=element;
		System.out.println("updated array :");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
			
		}
		


	}

}
