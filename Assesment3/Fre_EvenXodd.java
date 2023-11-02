package Assesment3;

import java.util.Scanner;
public class Fre_EvenXodd {

	public static void main(String[] args) {
		int n,m,count1=0,count2=0;
		 Scanner x = new Scanner(System.in);
		 System.out.print("Enter number of rows:");
		 n = x.nextInt();
		 System.out.print("Enter number of columns:");
		 m = x.nextInt();
		 int a[][] = new int[n][m];
		 System.out.println("Enter all the elements of matrix:");
		 for (int i=0; i<n; i++)
		 {
		 for (int j=0; j<m; j++)
		 {
		 a[i][j] = x.nextInt();
		 }
		 }
		 System.out.println("Given Matrix:");
		 for (int i=0; i<n; i++)
		 {
		 for (int j=0; j<m; j++)
		 {
		 System.out.print(a[i][j] + " ");
		 }
		 System.out.println("");
		 }
		 for (int i=0; i<n; i++)
		 {
		 for (int j=0; j<m; j++)
		 {
		 if((a[i][j] % 2) == 0)
		 {
		 count1++;
		 }
		 else
		 {
		 count2++;
		 }
		 }
		 }
		 System.out.println("Even number frequency:"+count1);
		 System.out.println("Odd number frequency:"+count2);
	}

}
