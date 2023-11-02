package Datatype;
import java.util.Scanner;

public class Try {

	public static void main(String[] args) {
		String name;
		char gender;
		long contact;
		int id,mark1,mark2,mark3;
		float tot,avg;
		Scanner x = new Scanner(System.in);
		System.out.println("enter the name");
		name = x.next();
		System.out.println("enter the id");
		id = x.nextInt();
		System.out.println("enter the gender");
		gender = x.next().charAt(0);
		System.out.println("enter the contact number");
		contact= x.nextLong();
		System.out.println("enter the MARK1");
		mark1 = x.nextInt();
		System.out.println("enter the mark2");
		mark2 = x.nextInt();
		System.out.println("enter the mark3");
		mark3 = x.nextInt();
		
		tot=mark1+mark2+mark3;
		avg=tot/3;
		
		System.out.println(name);
		System.out.println(id);
		System.out.println(gender);
		System.out.println(contact);
		System.out.println(mark1);
		System.out.println(mark2);
		System.out.println(mark3);
		System.out.println(tot);
		System.out.println(avg);
		
		
		
		
	}

}
