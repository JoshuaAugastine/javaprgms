
package Matcher;

import java.util.regex.Pattern;
import java.util.regex.*;

class Regex7{
		
		// function to valid password
		 public static boolean isValidPassword(String password) {
			 
			 //regex to check the valid passsword
			 String regex = "^(?=.*[0-9])"
					 +"(?=.[a-z])(?=.*[A-Z])"
					 +"(?=.*[@#$%^&*+-=])"
					 +"(?=\\S+$).{8,20}$";
					 	
					 //compile the regex
					 
					 Pattern p = Pattern.compile(regex);
					 
					 //if the password is empty return false
					 
					 if(password == null) {
						 return false;
						 
					 
		 }
					 
					 //pattern class contains matcher() method to find matching
					 
					 Matcher m = p.matcher(password);
					 
					 //return if the password 
					 //matched the regex
					 
					 return m.matches();
					 
	}

		   //driver code
		 public static void main(String args[]) {
			 
			 //test case 1 
			  String str1 = "Pass@portal20";
              System.out.println(isValidPassword(str1));
              
              //test case2
			  String str2 = "PasswordCheck";
              System.out.println(isValidPassword(str2));
              
              //test case 3
			  String str3 = "Pass@ portal9";
              System.out.println(isValidPassword(str3));
              
              //test case 4
			  String str4 = "1234";
              System.out.println(isValidPassword(str4));
              
              //test case 5
			  String str5 = "Check@20";
              System.out.println(isValidPassword(str5));
              
              //test case 6
			  String str6 = "check@portal20";
              System.out.println(isValidPassword(str6));
		 }
}
