package Assesment4;

import java.util.Arrays;
import java.util.Scanner;

public class Que2 {

	public static int partn(int array[], int low , int high) {
			 
			 int pivot =array[high];
			 int i = (low-1);
			 for(int j=low; j < high; j++) {
				 if(array[j] <= pivot) {
					 i++;
					 int temp = array[i];
					 array[i] = array[j];
					 array[j] = temp;
				 }
			 }
			 static void quicksort(int array[], int low , int high) {
				 if(low < high){
					 quicksort(array , low , partn -1);
					 quicksort(array , partn +1, high);
				 }
			 }
				 
		public static void main(String[] args)	 {
			int n;
			Scanner x = new Scanner(System.in);
			System.out.println("enter the size of the array elements ");
			n = x.nextInt();
			System.out.println("enter the array elements :");
			for(int i=0; i<n; i++) {
		    String str = x.nextLine();
			}
			System.out.println("unsorted array");
			System.out.println(Arrays.toString(data));

		}
}

