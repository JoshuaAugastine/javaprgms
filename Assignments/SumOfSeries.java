package Assignments;

import java.util.Scanner;

public class SumOfSeries {

	public static void main(String[] args) {
				int n;
				Scanner x = new Scanner (System.in);
				System.out.println("ENTER THE  VALUE ");
				n = x.nextInt();   
				System.out.println("The Sum of the series : ");		
				System.out.print("1/1");
					int res = 0;
					int result = 0;
				int sum=1;
				
				for(int i=2;i<=n;i++) {
					sum=i*i;
					System.out.print(" + 1/"+sum+"");
					res=res+sum;
					result=res+1;
				}
				 System.out.print(" = "+result);
	}

}
