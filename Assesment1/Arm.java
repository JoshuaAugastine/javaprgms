package Assesment1;

import java.util.Scanner;

public class Arm {

	public static void main(String[] args) {

	  	int digit=0,num,remainder,result=0,temp;
	  	
		Scanner x = new Scanner(System.in);
		System.out.println("ENTER THE NUM");
		num = x.nextInt();
		temp=num;
		while(num!=0) {
			digit++;
			num=num/10;
		}

		num=temp;
		while(num!=0) {
			remainder = num % 10;
			result= (int) (result + Math.pow(remainder, digit));
			num=num/10;
		}
		if(temp==result) {
			System.out.println("AMSTRONG NUMBER");
		}
		else {
			System.out.println(" NOT AMSTRONG NUMBER");
		}
		
		}

	}


