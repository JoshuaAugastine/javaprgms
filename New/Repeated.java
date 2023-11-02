package New;

import java.util.Scanner;

public class Repeated {

	public static void main(String[] args) {
			
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the word ");
			String str =s.nextLine();
         	int n = str.length();
			for(int i=0; i<n-1; i++) {
				for(int j=i+1; j<n; j++) {
					if(str.charAt(i) == str.charAt(j)) {
						System.out.println(str.charAt(i));
						break;
					}
			}
		
			}
	}
}
	