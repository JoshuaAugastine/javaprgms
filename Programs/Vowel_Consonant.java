package Programs;

import java.util.Scanner;

public class Vowel_Consonant {

	public static void main(String[] args) {
		char ch;
		Scanner x = new Scanner(System.in);
		System.out.println("Enter the character : ");
		ch = x.next().charAt(0);
		switch(ch) {
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println("vowel:"+ch);
			break;
			default:
		System.out.println("consonants  :" +ch);
		}
		

	}

}
