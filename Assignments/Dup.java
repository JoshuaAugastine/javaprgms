package Assignments;

import java.util.Scanner;

public class Dup {
        static int RemoveDuplicates(int arr[] , int n) {
        int replaceindex=0,i,j;
	    for(i=0; i<n; i++) {
		  for(j=i+1; j<n; j++) {
		     if(arr[j] != arr[i]) {
			  break;
		}
	}
		arr[replaceindex++]=arr[i];
		i=j-1;
		}
	    return replaceindex;
        }
		public static void main(String[] args) {
			Scanner x = new Scanner(System.in);
			System.out.println("enter the total no. of element:");
			int n = x.nextInt();
			int arr[] = new int[n];
			System.out.println("enter the elements:");
			for(int i=0; i<n; i++) {
				arr[i]=x.nextInt();
			}
			int i;
			int index = RemoveDuplicates(arr,n);
			for(i=0; i<index; i++)
			System.out.print(arr[i]+ " ");
	}	
}
