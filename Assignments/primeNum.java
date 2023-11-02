package Assignments;

import java.util.Scanner;

public class primeNum {

	public static void main(String[] args) {
		int n,number =2;
		Scanner x = new Scanner (System.in);
		System.out.println("enter the total no. of elements ");
		n = x.nextInt();
		for(int i=1; i<=n; i++) {
			if(number == 2) {
				System.out.println(2+" ");
				number++;
			}
			else
			{
				Task:
				for(int j=2; j<=number/2; j++) {
				if(number%j == 0) {
				number++;
				continue Task;
				}	
			}
				System.out.print(number++ +" ");
				
				}
			}
		}
	}
	