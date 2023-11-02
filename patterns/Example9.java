package patterns;

import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
		int i,n,j,k,space,value;
		Scanner x = new Scanner (System.in);
		System.out.println("enter the no of lines :");
		n = x.nextInt();
		for(i=1;i<=n;i++) {
			for(space=n;space>i;space--) {
				System.out.print(" ");
			}
		 for(j=1;j<=i;j++) {
			 System.out.print(j+" ");
			 }
		 value=--j;
		 for(k=1;k<j;k++){
			 System.out.print(--value +" ");
		 }
		 System.out.println();

	}

}
}