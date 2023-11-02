package Array2d;

public class Arrayequal {
	
	public static void main(String[] args) {
		int row=3,col=3;
		int a[][] = { {1,2,3},
				      {4,5,6},
				      {7,8,9}};
		int b[][]= { {10,20,30},
				     {40,50,60},
				     {70,80,90}};
		
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
			System.out.println("same or not");
			 int i=0,j=0;
			if(a[i][j]==b[i][j]) {
				   System.out.println("its same");
			}	
            else
			System.out.println("its not same");
		}
		
	
	}

