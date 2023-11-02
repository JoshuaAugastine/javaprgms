package New;
import java.util.Scanner;
public class Triangle_right {

	public static void main(String[] args) {
		
		int n;
		Scanner x = new Scanner(System.in);
		System.out.println("Enter the total no. elements ");
		n = x.nextInt();
		for(int i=1;i<=n;i++) {
          for(int j=1;j<=i;j++) {
        	  System.out.print("*");
	}
         System.out.println();
	}

	}
}
