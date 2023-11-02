package Programs;

import java.util.Scanner;

public class Extract_digits {

	public static void main(String[] args) {
		int n,m,a,i=1,counter=0;
		Scanner x = new Scanner(System.in);
		System.out.print("enter any number :");
		n = x.nextInt();
		m =n ;
		while(n>0) {
			n = n/10;     //to find the how many numbers users put on input
			counter++;    // Ex : 6578 - 4
		}
		while(m>0) {    
			 a = m % 10 ; // to extract the  last number ex:3456 - 6 
			 System.out.println("Digits at the position "+ counter+":"+a);
			 m=m/10;
			 counter--;
		}
	}

}
