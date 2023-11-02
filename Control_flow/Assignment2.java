package Control_flow;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int std_id;
        String std_name;
        int mark1,mark2,mark3;
        float tot,avg;
        
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the std_id:");
        std_id = x.nextInt();
        System.out.println("Enter the Name:");
        std_name = x.next();
        System.out.println("Enter the mark1:");
        mark1 =x.nextInt();
        System.out.println("Enter the mark2:");
        mark2 =x.nextInt();
        System.out.println("Enter the mark3:");
        mark3 =x.nextInt();
      
        tot= mark1+mark2+mark3;
        avg=tot/3;
        
        System.out.println("Student Information");
        System.out.println(".");
        System.out.println("mark1       :"+ mark1);
        System.out.println("mark2       :"+ mark2);
        System.out.println("mark3       :"+ mark3);
        System.out.println("total       :"+ tot);
        System.out.println("Average     :"+ avg);
        
        if(avg <50) {
        	System.out.println("POOR");
        }
        else if(avg>=50 && avg<60) {
             System.out.println("WORKHARD");
            }
        else if(avg>=60 && avg<75) {
            System.out.println("GOOD");
           }
        else if(avg>=75 && avg<90) {
            System.out.println("VERY GOOD");
           }
        else if(avg>=90 && avg<=100) {
        	System.out.println("EXCELLENT");
        	}
	}

}
