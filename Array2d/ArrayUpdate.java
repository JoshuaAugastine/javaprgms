package Array2d;

import java.util.Scanner;

public class ArrayUpdate {

	public static void main(String[] args) {
		int n,pos,update;
	    Scanner x = new Scanner(System.in);
	    System.out.println("enter the no. element  :");
	    n = x.nextInt();
	    int[] arr = new int[n];
	    System.out.print("enter the no. of elements :");
	    for(int i=0; i<n; i++) {
	     arr[i]=x.nextInt();
	    }
	    System.out.println("enter the postion of the  element  you want to update:");
	    pos = x.nextInt();
	    System.out.println("enter the update element :");
	    update = x.nextInt();
	    
	    arr[pos-1]=update;
	    for(int i=0; i<n; i++) {
               System.out.println(arr[i]);
	}
	}
}
