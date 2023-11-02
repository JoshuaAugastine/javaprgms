package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArraySort {

	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		Scanner x = new Scanner(System.in);
		System.out.println("Enter the no of elements :");
		int n = x.nextInt();
		 /*arr.add("steve");
		 arr.add("tim");
		 arr.add("lucy");
		 arr.add("pat");
		 arr.add("angela"); */
		
		System.out.println("Enter the array elements:");
		for(int i=0; i<n; i++) {
			arr.add(x.next());
		}
		 
		 System.out.println("Array List :");
		 System.out.println(arr);
		 Collections.sort(arr);
		 System.out.println("ArrayList using for each :");
		 for(String str1: arr) {
			 System.out.println(str1);
		 }

	}

}
