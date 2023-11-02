package Ass4;

import java.util.Scanner;

public class Exx3 {

	public static void main(String[] args) {
		    int b,sum=0;
			Scanner x = new Scanner(System.in);
			System.out.println("enter the element :");
			String str = x .next();
			for(int i=0; i<str.length(); i++) {
			     if(Character.isDigit(str.charAt(i)))
			    	 {
			    		 b = Integer.parseInt(String.valueOf(str.charAt(i)));
			    		 sum = sum+b;
			    	 }
			    	 
			     }
			     System.out.println(sum);
	}

}
