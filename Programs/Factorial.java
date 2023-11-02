package Programs;
import java.util.Scanner;
public class Factorial {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,fact=1;
		Scanner x = new Scanner (System.in);
		System.out.println("ENTER THE NUMBER:");
		num = x.nextInt();
		for(int i=num;i>0;i--) {
			fact=fact*i;
		}
		System.out.printf("FACTORIAL IS %d" , fact);
		x.close();
		

	}

}
