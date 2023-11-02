package Assesment4;

import java.util.Stack;

public class Que4 {
       static void pushelement (Stack<Integer> stk , int x) {
		stk.push(x);
		System.out.println("push ->" +x);
		System.out.println("stack: " +stk);

	}
	static void popelement (Stack<Integer> stk) {
		if (stk.isEmpty()) {
			System.out.println("stack is empty");
		}
		else {
		Integer x= (Integer)stk.pop();
		System.out.println("pop -> " +x);
		System.out.println("stack: " +stk);
		}
	}

	public static void main(String[] args) {
		Stack <Integer> stk = new Stack<Integer>();
		System.out.println("stack: " +stk);

		popelement(stk);
		pushelement(stk, 10); 
		pushelement(stk, 7);
		pushelement(stk, 16);
		pushelement(stk, 28);
		pushelement(stk, 11);
		popelement(stk);
		popelement(stk); 
		
		System.out.println("The finale output " + stk);
		boolean res = stk.isEmpty();
		System.out.println("stack is empty ? :" + " " +  res);
		
	}
	}

