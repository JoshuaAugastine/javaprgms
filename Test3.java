import java.util.Scanner;
public class Test3 {
public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		num= s .nextInt();
		for(int i=1; i<=num;i++) {
			System.out.println((i*i+1)+" ");
			s.close();
		}

	}

}
