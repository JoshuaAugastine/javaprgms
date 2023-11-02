package Programs;

import java.util.Scanner;

public class Year_week_Day {

	public static void main(String[] args) {
		int year,week,week1,day,m;
		Scanner x = new Scanner(System.in);
		System.out.print("enter the total day  :" );
		m = x.nextInt();
		year = m/365;
		System.out.println("year :" +year);
		week = m-(year*365);
		week1 = week/7 ;
		System.out.println("week :" +week1);
		day = week%7;
		System.out.println("day  :" +day);
	}

}
