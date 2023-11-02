package Assesment2;

import java.util.Scanner;

public class Transx {

	public static void main(String[] args) {
		int row,column;
		Scanner x = new Scanner(System.in);
		System.out.println("enter the row");
		row = x.nextInt();
		System.out.println("enter the column");
		column = x.nextInt();

        int[][] matrix = {{7,3,4}, {2,3,4},{5,6,7}};
		display(matrix);
		
		
		int[][] transpose = new int[column][row];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				transpose[j][i]= matrix[i][j];
			}
		}
		
		display(transpose);
	}
	public static void display(int[][] matrix) {
		System.out.println("The matrix is ");
		for(int[]row:matrix) {
			for( int column:row) {
				System.out.print(column + "  ");
			}
			System.out.println();
		}


	}

}
