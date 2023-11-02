package New;

import java.util.Scanner;

public class SimpleSum {

	public static void main(String[] args) {
		
		int n,m,sum;
		Scanner x = new Scanner(System.in);
		System.out.println("Enter the First number");
		n = x.nextInt();
		System.out.println("Enter the Second number");
		m = x.nextInt();
		sum = n + m;
		System.out.println("the sum is :" + sum);
		
	}

}
