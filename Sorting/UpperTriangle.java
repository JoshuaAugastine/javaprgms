package Sorting;

import java.util.Scanner;

public class UpperTriangle {

	public static void main(String[] args) {
		int row,column,flag =0;
		Scanner x = new Scanner(System.in);
		System.out.print("enter the no of row    :");
		row = x.nextInt();
		System.out.print("enter the no of Column :");
		column = x.nextInt();
		int a[][]= new int [row][column];
		System.out.print("enter the elements     :");
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++){
				a[i][j]= x.nextInt();
			}
		}
            for(int i=1; i<row; i++) {
            	for(int j=0; j<i; j++) {
                        if(a[i][j]!=0) {
                       flag=1;
                       }
            	}
            }
                  if(flag==0)
                	  System.out.println("yes its a upper triangle");
                   else 
            		System.out.println("mismatch");
	}
	       //else {
		//System.out.println("row n column mismatch");
	     //  }
}

