package Array2d;

public class Arrayadd {

	public static void main(String[] args) {
		int row=3,col=3;
		int a[][] ={ {2,3,4},
			         {7,8,9},
			         {5,6,8}};
	    int b[][] = { {3,3,3},
		              {3,4,6},
		              {8,4,7}};	
	     int result[][]= {{0,0,0},
		                 {0,0,0},
		                 {0,0,0}};
	     
	     System.out.println("A matrix");
			for(int i=0 ; i<row; i++) {
				for(int j=0; j<col ; j++) {
					System.out.print(a[i][j]+" ");
					
				}
				System.out.println();
			}
			System.out.println("B matrix");
				for(int i=0 ; i<row; i++) {
					for(int j=0; j<col ; j++) {
						System.out.print(b[i][j]+" ");
					}	
					System.out.println();
				}
					System.out.println("Matrix addition");
					for(int i=0 ; i<row; i++) {
						for(int j=0; j<col ; j++) {
					result[i][j]=a[i][j]+b[i][j];
				System.out.print(result[i][j]+" ");
				     // if(i==j) {
				    	//  System.out.print(" ");
				     // }
					System.out.println();
				
					}
					}
	}
}
