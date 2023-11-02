package New;

import java.util.Scanner;

public class Boolean_matrix {

	public static void main(String[] args) {
			
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the row ");
			int r=s.nextInt();
			System.out.println("Enter the column ");
			int c=s.nextInt();
			int [][]mat=new int [r][c];
			System.out.println("Enter the elements ");
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					mat[i][j]=s.nextInt();
			}
		}
				int R[]=new int [r];
				int C[]= new int [c];
			for(int i=0;i<r;i++) {
				for(int j=0;j<c;j++) {
					
					R[i]=0;
					C[j]=0;
				}
			}
			for( int i=0;i<r;i++) {
				for(int  j=0;j<c;j++) {
					if ((mat [i][j]==1)) {
						R[i]=1;
						C[j]=1;
					}
				}
			}
			for( int i=0;i<r;i++) {
				for(int  j=0;j<c;j++) {
				if(R[i]==1 || C[j]==1) {
					mat[i][j]=1;
				}
				}
		}
			System.out.println("Boolean Matrix  ");
			for( int i=0;i<r;i++) {
				for(int  j=0;j<c;j++) {
					System.out.print(mat[i][j]+" "); 
				}
				System.out.println(); // 0 0 0
									 // 0 0 1
				}
		}

	}
				
		
