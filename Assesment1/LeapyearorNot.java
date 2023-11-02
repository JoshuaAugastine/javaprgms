package Assesment1;
import java.util.Scanner;
public class LeapyearorNot {

	public static void main(String[] args) {
		int year;
		Scanner x = new Scanner(System.in);
		System.out.println("Enter the year :");
		year = x.nextInt();
		if(year%400==0) {
			System.out.println("YES");
		}
			else {
				System.out.println("NO");
			}
		}

	}


