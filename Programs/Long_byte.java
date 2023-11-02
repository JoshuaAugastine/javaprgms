package Programs;

import java.util.Scanner;

public class Long_byte {

	public static void main(String[] args) {
		 long a;
		 byte b;
		 Scanner x = new Scanner(System.in);
		 System.out.print("Enter any long value  :");
		 a = x.nextLong();
		 b = (byte)a;
		 System.out.print("conversion in to byte :"+b);

	}

}
