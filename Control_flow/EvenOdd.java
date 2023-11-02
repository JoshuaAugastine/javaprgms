package Control_flow;

import java.util.Scanner;


public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		
		Scanner x = new Scanner(System.in);
		
		System.out.println("enter the number:");
		num1=x.nextInt();
		
		if(num1%2==0)
		{
		System.out.println("even number" + num1);
		}
		else {
		System.out.println("odd number" + num1);
			}
		}
			
		
	}


