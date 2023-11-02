package Matcher;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex3 {

	public static void main(String[] args) {
		
		String line = " this order was placed for QT3000! OK?";
		Pattern p = Pattern.compile("(.*?)(\\d+)(.*)");
		Matcher m = p.matcher(line);
		while(m.find()) {
			System.out.println("group 1: " +m.group(1));
			System.out.println("group 2: " +m.group(2));
			System.out.println("group 3: " +m.group(3));
		}

	}

}
