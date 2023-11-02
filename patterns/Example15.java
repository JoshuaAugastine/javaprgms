package patterns;

import java.util.Scanner;

public class Example15 {

	public static void main(String[] args) {
		int i,n,j,space;
		char ch='e',value;
		Scanner x = new Scanner (System.in);
		System.out.println("enter the no of lines :");
		n = x.nextInt();
		for(i=1;i<=n;i++) {
			for(space=n;space>i;space--) {
				System.out.print(" ");
			}
			value=ch;
		 for(j=1;j<=i;j++) {
			 System.out.print(value++ +" ");
			 
		 }
		 ch--;
		 System.out.println();

	}

	}

}
