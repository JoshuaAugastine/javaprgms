package Programs;

import java.util.Scanner;

public class Count_one {

	public static void main(String[] args) {
		int n,m,count=0;
		String s = "";
		Scanner x = new Scanner (System.in);
		System.out.print("Enter the decimal number  : ");
		n = x.nextInt();
		while(n > 0)
		{
			int a = n%2; // 23%2 = 1 , a=1 , s =1+s , n=23/2 = 11 
			s = a + s;
			n = n / 2;
		}
		// print
		 int l = s.length();
		 for(int i=0; i<l ; i++) {
			 if(s.charAt(i) == '1') {
				 count++;
			 }
		 }
		System.out.println("No. of 1's are :"+ " " + count);

	}

}
