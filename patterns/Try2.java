package patterns;

import java.util.Scanner;

public class Try2 {

	public static void main(String[] args) {
		int i,n,j,space;
		char value;
		char ch='e';
		Scanner x = new Scanner(System.in);
		System.out.println("enter the total lines :");
		n = x.nextInt();
		for(i=1;i<=n;i++) {
			for(space=i; space>1 ; space--) {
				System.out.print(" ");
						}
			value=ch;
			for(j=n;j>=i;j--) {
				System.out.print(value-- +" ");
			}
			ch--;
			System.out.println();
		}

	}

}
