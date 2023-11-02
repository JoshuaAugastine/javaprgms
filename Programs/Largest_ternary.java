package Programs;

import java.util.Scanner;

public class Largest_ternary {

	public static void main(String[] args) {
		int a,b,c,d;
		Scanner x = new Scanner(System.in);
		System.out.println("Enter all three numbers");
		a=x.nextInt();
		b=x.nextInt();
		c=x.nextInt();
		d= c> (a>b ? a:b)?c:((a>b) ? a:b);
		System.out.println("largest number :" +d);
 
	}

}
