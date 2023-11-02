package Array2d;

import java.util.Scanner;

public class MaxArray {

	public static void main(String args[]) {
		int n,max,min;
		Scanner x = new Scanner(System.in);
		System.out.println("enter the no of element");
		n = x.nextInt();
		System.out.println("enter the array element");
		int[] a= new int[] {23,45,67,83,23};
		max=a[0];
		for(int i=1;i<n;i++) {
			if(a[i]>max)
				max=a[i];				
		}
		min=a[0];
		for(int i=1;i<n;i++) {
			if(a[i]<min)
				min=a[i];		}
	
	 System.out.println(+ max);
     System.out.println(+ min);
}
}

