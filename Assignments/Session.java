package Assignments;

import java.util.Scanner;

public class Session {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner x = new Scanner(System.in);
		
		System.out.println("ENTER THE NUMBER:");
		a = x. nextInt();
		
		if(a>=1 && a<=4) {
	     System.out.println("SUMMER");
		    }
		else if(a>=5 && a<=8) {
		 System.out.println("RAINY");
			}
		else if(a>=9 && a<=12) {
			 System.out.println("WINTER");
			}
		else {
			 System.out.println("INVALID DATA");
			}

	}

}
