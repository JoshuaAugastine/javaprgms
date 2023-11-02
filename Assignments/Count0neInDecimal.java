package Assignments;

import java.util.Scanner;

public class Count0neInDecimal {
	public static void main(String[] args) {
		int n,count=0,i=0;
		Scanner x = new Scanner (System.in);
		System.out.println("ENTER THE DECIMAL VALUE ");
		n = x.nextInt();   
	        int[] binaryNum = new int[n];
	        while (n != 0)
	        {
	            binaryNum[i] = n % 2;
	            n = n / 2;
	            i++;
	        }
	        for (int j=i-1; j>=0; j--)
	        	if(binaryNum[j] == 1)
	        	count++;	
	            System.out.print("COUNT ONE IS :" + count);
				
	}

}
