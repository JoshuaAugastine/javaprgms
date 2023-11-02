package Programs;

import java.util.Scanner;

public class Increment_decrement {
 
	public static void main(String [] xyz) {
		int a,b,c,d,e;
		Scanner x = new Scanner(System.in);
		System.out.print("enter any integer a  :" );
		a = x.nextInt();
		b = ++a;          // a=12 , b=a++ , b=12, a=13
		System.out.println("result after pre Increment a :"+a );
		System.out.println("result after pre Increment b :"+b );
		c = a++;
		System.out.println("result after pre Increment a :"+a );
		System.out.println("result after pre Increment c :"+b );
		d = --a;
		System.out.println("result after pre Increment a :"+a );
		System.out.println("result after pre Increment b :"+d );
		e = a--;
		System.out.println("result after pre Increment a :"+a );
		System.out.println("result after pre Increment b :"+e );
	}
}
