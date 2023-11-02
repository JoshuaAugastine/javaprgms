package Programs;

import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,remainder,result=0;
		
		Scanner x = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		num  = x.nextInt();
          while(num!=0) {
        	  remainder = num%10;
        	  result=result*10 + remainder;
        	  num=num/10;
          }
        	  System.out.println("The value is :" + result);  
          }
        	 
	
          }
	

