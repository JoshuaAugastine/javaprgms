package opertors;

import java.util.Scanner;

public class Biggestnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		 
		Scanner x = new Scanner (System.in);
		
		System.out.println("enter A number");
	    a = x.nextInt();
		System.out.println("enter B number");
	    b = x.nextInt();
		System.out.println("enter C number");
		c = x.nextInt();
		
		if(a>b && a>c) {
			System.out.println(" A is greater");
		}
		else if(b>c &&  b>a) {
			System.out.println(" B is bigger");
		}
		
		else if(c>a && c>b) {
			System.out.println("C is bigger");
		}
		

	}

}
