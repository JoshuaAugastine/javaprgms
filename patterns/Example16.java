package patterns;

import java.util.Scanner;

public class Example16 {

	public static void main(String[] args) {
		int i,n,j,space;
		Scanner x = new Scanner (System.in);
		System.out.println("enter the no of lines :");
		n = x.nextInt();
		for(i=1;i<=n;i++) {
			for(space=n;space>i;space--) {
				System.out.print(" ");
			}
		 for(j=1;j<=i;j++) {
			 if(j==1||j==i) {
			 System.out.print("* ");
			 }
			 else {
				 System.out.print(" ");
			 }
		 }
		 System.out.println();
		}
		for(i=2;i<=n;i++) {
			for(space=i;space>1;space--) {
				System.out.print(" ");
			}
		 for(j=n;j>=i;j--) {
			 if(j==n||j==i) {
				 System.out.print("* ");
				 }
				 else {
					 System.out.print(" ");
				 }
			 
		 }
		 System.out.println();
		}

	}

}
