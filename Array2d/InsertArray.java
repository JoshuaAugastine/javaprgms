package Array2d;

import java.util.Scanner;

public class InsertArray {

	public static void main(String[] args) {
          int n,pos,ele;
          Scanner x = new Scanner(System.in);
          System.out.print("enter the no.of elements :");
          n = x.nextInt();
          int arr[] = new int[n+1];
          System.out.print("enter the elements :");
          for(int i=0; i<n;i++) {
	   	  arr[i]= x.nextInt();
          }
          System.out.print("enter the position you want to insert :");
          pos = x.nextInt();
          System.out.print("enter the element which you want to insert :");
          ele = x.nextInt();
          System.out.println("Original array:");
  		for(int i=0; i<n ; i++) {
  			System.out.print(arr[i]+" ");
  		}
  		System.out.println();
          int j=n;
          n = n+1;
           while(j>=pos-1) {
        	   arr[j]= arr[j-1];
        	   j--;
           }
          arr[pos-1]=ele;
          System.out.println("inserted array :");
  		for(int i=0;i<n;i++) {
  			System.out.print(arr[i]+" ");
	}
	}
}
