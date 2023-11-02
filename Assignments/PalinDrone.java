package Assignments;

import java.util.Scanner;

public class PalinDrone {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		System.out.println("enter the word :");
		String str = x.nextLine();
		
		 String reverse = new StringBuffer(str).reverse().toString();

	   	  System.out.println("\nString before palindrome:" + str);
	   	System.out.println("String after palindrome:" + reverse);
	   	if(str == reverse) 
	   		System.out.println("palindrome");
	   	else
	   		System.out.println("Not palindrome");
	   	}
	  
	}


