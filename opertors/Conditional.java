package opertors;

import java.util.Scanner;

public class Conditional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num;
		 String result;
		 Scanner x =  new Scanner(System.in);
		 System.out.println("Enter the number:");
		 num= x.nextInt();
		 result=(num%2==0)?"even number":"odd number";
		 System.out.println(result);
		 x.close(); //need to close the scanner

	}

}
