package Matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexGroup {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("josh");
		Matcher m = p.matcher("joshua augastine");
		while(m.find())
		
		System.out.println("start :" + m.start() + " " + "end :" + m.end() + "   " + "group " + m.group());
		

	}

}
