package Programs;

import java.util.Scanner;

public class Increment_digits {

	public static void main(String[] args) {
		int m,a;
		String s ="";
		Scanner x = new Scanner(System.in);
		System.out.print("Enter any number :");
		m= x.nextInt();
          while(m>0) {    
			 a=m%10; 
			 m=m/10; // to get a number as separate that
			 a=a+1;  // to add a 1 
             s=a+s;
		}
		 System.out.print("It will be : " +s);

	}

}
