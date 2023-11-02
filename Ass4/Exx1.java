package Ass4;

import java.util.Scanner;

public class Exx1 {

	public static void main(String[] args) {
		
		double d1;
		double d2;
		Scanner x = new Scanner(System.in);
		System.out.println("Enter the first value:");
		d1 = x.nextDouble();
		System.out.println("Enter the Second value:");
		d2 = x.nextDouble();
		System.out.println("Ceiling of " + d1 + " = " + Math.ceil(d1));
		System.out.println("floor of " + d1 + " = " + Math.floor(d1));
		System.out.println(Math.ceil(d2));
		System.out.println("floor of " + d2 + " = " + Math.floor(d2));
		
		
		

	}

}
