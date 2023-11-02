package Assesment1;

import java.util.Scanner;

public class SimpleSum {

	public static void main(String[] args) {
		int a,b,c,result;
		Scanner x = new Scanner(System.in);
		System.out.print("Enter the 3 digit number :");
		a = x.nextInt();
		b = x.nextInt();
		c = x.nextInt();
        result = a+b+c;
        System.out.println("the sum of value is :" + result);
	}

}
