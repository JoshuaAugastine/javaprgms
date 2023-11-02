package Programs;

import java.util.Scanner;

public class Fibnocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int i,num,f1=0,f2=1,f3;
		Scanner x = new Scanner(System.in);
		System.out.println("ENTER THE NUM");
		num = x.nextInt();
		System.out.print(f1+" "+f2+" ");
		for(i=2;i<=num;i++) {
			f3=f1+f2;
			f1=f2;
			f2=f3;
			System.out.print(f3+" ");
			//num = num-1;
		}
		

	}

}
