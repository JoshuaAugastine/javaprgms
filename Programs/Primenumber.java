package Programs;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,notprime=0;
		Scanner x = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		num  = x.nextInt();
		for(int i=2;i<=num;i++) {
			if(num%i==0) {
				notprime=1;
				break;
			}
		if(notprime==1) 
		System.out.println(" NOT PRIME NUMBER");
		else
			System.out.println("PRIME NUMBER");
			x.close();
		}
	}
}	
