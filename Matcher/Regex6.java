package Matcher;

import java.util.regex.Pattern;

public class Regex6 {

	public static void main(String[] args) {
		
//create a regular expression that accepts alphanumeric characters only , its length must be six char only
		
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "130900")); //true - it fills atleast 6 char
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "joshua1309")); //false -  more than 6 char
		
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "JA2UK2")); //true
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "Josh$2")); //false -  more than 6 char

	}

}
// regex = "^(?=.*[0-9](?=.*[a-z)(?=.*[A-Z])(?=.*[@#$%^&-+()]