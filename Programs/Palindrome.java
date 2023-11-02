package Programs;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int num,remainder,result=0;
      
		
		Scanner x = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		num  = x.nextInt();
		int temp=num;
          while(num!=0) {
        	  remainder = num%10;
        	  result=result*10 + remainder;
        	  num=num/10;
          }
        	  System.out.println("The value is result:" + result);  
        	  System.out.println("The value is num:" + num); 
        	  if(temp==result) {
              System.out.println("PALINDROME");  
          }
        	  else {
                  System.out.println(" NOT PALINDROME");  
              }
	}
        	  
        	  
        	  

}
