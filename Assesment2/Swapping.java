package Assesment2;
import java.util.Scanner;
public class Swapping {

	public static void main(String[] args) {
		int m,n,temp;
		Scanner x = new Scanner(System.in);
		System.out.println("enter the First number");
		m = x.nextInt();
		System.out.println("enter the Second number");
		n = x.nextInt();
		temp=m;     // n=n+m;  m=n-m   n=n-m
		m=n;
		n=temp;
		System.out.println("first value  :" + " " +m);
		System.out.println("second value :" + " " + n);

	}

}
