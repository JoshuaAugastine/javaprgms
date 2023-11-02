package Programs;

import java.util.Scanner;

public class Amstrong {
	public static void main(String[] xyz) {
		//AMSTRONG NUM 153, 1634, 1, 2, 3, 4, 5, 6, 7, 8, 9, 370, 371, 54748
  	int digit=0,num,remainder,result=0,temp;
  	
	Scanner x = new Scanner(System.in);
	System.out.println("ENTER THE NUM");
	num = x.nextInt();
	temp=num;
	while(num!=0) {
		digit++;
		num=num/10;
	}

	num=temp;
	while(num!=0) {
		remainder = num % 10;
		result= (int) (result + Math.pow(remainder, digit));
		num=num/10;
	}
	if(temp==result) {
		System.out.println("AMSTRONG NUMBER");
	}
	else {
		System.out.println(" NOT AMSTRONG NUMBER");
	}
	
	}
}
