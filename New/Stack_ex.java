package New;

import java.util.Scanner;
import java.util.Stack;

public class Stack_ex {

	public static void main(String[] args) {
		
		Scanner x = new Scanner (System.in);
    	System.out.println("ENTER THE DECIMAL VALUE : ");
        int n = x.nextInt();
        System.out.print("BINARY VALUE IS  : ");
        
        Stack<Integer> stk = new Stack<Integer>();
        while(n!=0) {
        	stk.push(n%2);
        	n=n/2;
        	
        }
        while(!stk.isEmpty()) {
        	System.out.print(stk.pop());
        }
	}

}
