package Assignments;

import java.util.Scanner;

public class Natural_Num {

	public static void main(String[] args) {
		int n,i;
		Scanner x = new Scanner (System.in);
		System.out.println("enter the total no. of elements ");
		n = x.nextInt();
		
		for(i=1; i<n+1; i++) {
		System.out.println(i);
		}
	}
}
