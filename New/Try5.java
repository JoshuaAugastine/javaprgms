package New;

import java.util.Scanner;

public class Try5 {

	public static void main(String[] args) {
		int n;
		Scanner  x = new Scanner(System.in);
		System.out.println("enter the total no. ofwords");
		n = x.nextInt();
		int arr[] =  new int[n];
		System.out.println("enter the words");
		for(int i=0; i<n; i++) {
			arr[i] = x.nextInt() ;
		}
		for(int i=0; i<n; i++)
		for(int letter=0; letter<0; letter++){
			if(arr[i] == letter) {
				System.out.println(arr[i]);
			}
		}

	}

}
