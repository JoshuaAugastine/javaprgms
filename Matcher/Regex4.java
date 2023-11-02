package Matcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex4 {

	public static void main(String[] args) {
		//1stway
		Pattern p = Pattern.compile(".s"); //represents single char
		Matcher m = p.matcher("as");
		boolean b = m.matches();
		
		//2ndway
		boolean b2= Pattern.compile(".s").matcher("as").matches();
		
		//3rd way 
		boolean b3 = Pattern.matches(".s", "as");
		
		System.out.println(b + " " + b2 + " " + b3);
		}

}
