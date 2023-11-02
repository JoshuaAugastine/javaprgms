package Datatype;

import java.util.Scanner;

public class Getvaluestd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int rollno,age;
	        long contact;
	        String name;
	        char gender;
	        Scanner x = new Scanner(System.in);
	        System.out.println("Enter the rollno:");
	        rollno = x.nextInt();
	        System.out.println("Enter the Name:");
	        name = x.next();
	        System.out.println("Enter the contact:");
	        contact =x.nextLong();
	        System.out.println("Enter the gender:");
	        gender =x.next().charAt(0);
	        System.out.println("Enter the age:");
	        age =x.nextInt();
	        System.out.println("Student Information");
	        System.out.println(".");
	        System.out.println("rollno       :"+ rollno);
	        System.out.println("Name         :"+ name);
	        System.out.println("Contact      :"+ contact);
	        System.out.println("Gender       :"+ gender);
	        System.out.println("Age          :"+ age);
	}

}
