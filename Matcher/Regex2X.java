package Matcher;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2X {

	public static void main(String[] args) {
		 Scanner x = new Scanner(System.in);
		 System.out.println("Enter the String :");
		 String str = x.nextLine();
		 Pattern p = Pattern.compile("javaTraining" , Pattern.CASE_INSENSITIVE);
		 Matcher m = p.matcher(str);
		 boolean matchfound = m.find();
		 if(matchfound) {
			 System.out.println("Match found");
		 }
		 else {
			 System.out.println("match not found");
		 }

	}

}
