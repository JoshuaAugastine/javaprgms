package Assignments;

import java.util.Scanner;

public class Fib {

	public static void main(String[] args) {
		
		int n,i,f1=0,f2=1,f3;
		Scanner x = new Scanner (System.in);
		System.out.println("enter the total no. of elements ");
		n = x.nextInt();
		System.out.print(f1 + " "+ f2 +" ");
		for(i=2; i<n; i++) {
			f3 = f2 + f1;
			f1 = f2;
			f2 = f3;
		System.out.print(f3 + " ");
		}
	}

}
