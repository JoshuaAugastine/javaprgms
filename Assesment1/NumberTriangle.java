package Assesment1;
import java.util.Scanner;
public class NumberTriangle {

	public static void main(String[] args) {
				int i,j,n;
				Scanner x = new Scanner(System.in);
				System.out.println("total no of lines:");
				n = x.nextInt();
				for(i=1;i<=n;i++) {
					for(j=1;j<=i;j++) {
						System.out.print(j+ " ");
					}
					System.out.println();
				}


	}

}
