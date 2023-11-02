-ppackage Programs;
import java.util.Scanner;

public class Integer_conversion {

	public static void main(String[] args) {
		int a;
		byte b;
		char c;
		float d;
		Scanner x =  new Scanner(System.in);
		System.out.print("enter any integer  :");
		a = x.nextInt();
		b=(byte)a;
		System.out.println("conversion in to byte  :" +b);
		c=(char)a;		
		System.out.println("conversion in to char  :" +c);
		d=a;
		System.out.println("conversion in to float :" +d);
	}

}
