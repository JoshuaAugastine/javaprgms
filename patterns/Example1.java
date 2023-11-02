package patterns;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		int i,n,j;
		Scanner x = new Scanner(System.in);
		System.out.print("enter the no of lines");
		n=x.nextInt();
		for( i=1;i<=n;i++) {
			for(j=1;j<=i;j++) {    //to increment 
			//for(j=n;j>=i;j--){  // to decrement
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
