package patterns;

import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		int i,n,j,space,k=1;
		char ch;
		Scanner x = new Scanner (System.in);
		System.out.println("enter the no of lines :");
		n = x.nextInt();
		for(i=1;i<=n;i++) {
			ch='a';
          for(j=1;j<=i;j++) {
        	  System.out.print(ch++ +" ");
	}
         System.out.println();
}
}
}