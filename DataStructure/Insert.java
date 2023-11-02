package DataStructure;

import java.util.Scanner;

public class Insert {

	public static void main(String[] args) {
		int ins,len,ind,j,n;
		Scanner x = new Scanner(System.in);
		System.out.println("enter the no of element :");
		n=x.nextInt();
		int arr[]= new int[n+1];
		System.out.println("enter the array element :");
		for(int i=0; i<n ;i++) {
			arr[i]=x.nextInt();
		}
		System.out.print("insert element :");
		ins = x.nextInt();
		System.out.print("\ninsert index:");
		ind = x.nextInt();
		j=n;
		System.out.println("Original array:");
		for(int i=0; i<n ; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		n = n+1;
		System.out.println("j= "+j);
		while(j>=ind) {
			arr[j]=arr[j-1];
			j=j-1;
		}
		arr[ind]=ins;
		System.out.println("inserted array :");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
			
		}
		
	}

}
