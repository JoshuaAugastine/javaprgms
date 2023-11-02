package patterns;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		int i,n,j,space;
		Scanner x = new Scanner (System.in);
		System.out.println("enter the no of lines :");
		n = x.nextInt();
		for(i=1;i<=n;i++) {
			for(space=i; space>1; space--) {
				System.out.print(" ");
			}
			for(j=n;j>=i;j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}
	
	}

