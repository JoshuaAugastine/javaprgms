package Matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {

	public static void main(String[] args) {
		
		 Pattern p = Pattern.compile("javaTraining" , Pattern.CASE_INSENSITIVE);
		 Matcher m = p.matcher("Welcome JavaTraining" );
		 boolean matchfound = m.find();
		 if(matchfound) {
			 System.out.println("Match found");
		 }
		 else {
			 System.out.println("match not found");
		 }
	}

}
