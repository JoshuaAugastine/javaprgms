package Array2d;

public class Multiplymatrix {

	public static void main(String[] args) {
		int r1=2,c1=3;
		int r2=3,c2=2;
		
		int[][] firstmatrix= { {3,-2,5} ,{3,0,4}};
		int[][] secondmatrix= { {2,3},{-9,0},{0,4}};
		
		//mul 
		
		int[][]product = new int[r1][c2];
		for(int i=0; i<r1; i++) {
			for(int j=0; j<c2; j++) {
				for(int k=0; k<c1; k++) {
					product[i][j] += firstmatrix[i][k]*secondmatrix[k][j];
				}
			}
		}
		   // display
		System.out.println("Multiplication of  two matrices is :");
		for(int[]row:product) {
			for(int column:row) {
				System.out.print(column +" ");
			}
			System.out.println();		}
	}

}
