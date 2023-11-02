package Control_flow;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
        int mark;
        
        Scanner x = new Scanner(System.in);
        
        System.out.println("Enter the mark:");
        mark = x.nextInt();
        
        if(mark <50) {
        	System.out.println("poor");
        }
        else if(mark>=50 && mark<75) {
             System.out.println("good");
            }
        else if(mark>=75 && mark<=100) {
        	System.out.println("excellent");
        	}
        }
        
        		
	}


