package Matcher;

import java.util.regex.Pattern;

public class Regex5 {

	public static void main(String[] args) {
		
		System.out.println("metacharacters d...."); //d means digit
		System.out.println(Pattern.matches("\\d", "abc"));  //false(non digit)
		System.out.println(Pattern.matches("\\d", "1")); //true - digit and comes once
		System.out.println(Pattern.matches("\\d", "4443")); //false - digit but comes more than once
		System.out.println(Pattern.matches("\\d", "323abc")); //false - digit and char 
		
		System.out.println("metacharacters D.....");
		System.out.println(Pattern.matches("\\D", "abc")); //false- non digit but comes more than once
		System.out.println(Pattern.matches("\\D", "1")); //false - digit
		System.out.println(Pattern.matches("\\D", "4443")); //false - digit
		System.out.println(Pattern.matches("\\D", "323abc"));//false - digit n char
		System.out.println(Pattern.matches("\\D", "m")); //true - non digit n comes once
		
		System.out.println("metacharacters D with quantifier....");
		System.out.println(Pattern.matches("\\D*", "maa")); //true - non digit n may come 0 or more times
	} 

}
