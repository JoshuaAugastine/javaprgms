package Datatype;

import java.util.Scanner;

public class Getvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,result;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the first value");
		num1=s.nextInt();
		System.out.print("Enter the second value");
		num2=s.nextInt();		
		result=num1+num2;
		System.out.print("adding two value:" + result);
	

	}

}
