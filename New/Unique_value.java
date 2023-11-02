package New;

import java.util.Scanner;

public class Unique_value {

	public static void main(String[] args) {
	    int flag=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the total no of elements");
		int n = s.nextInt();
		int [] arr=new int [n];
		System.out.println("Enter the elements ");
		for(int i=0;i<n;i++) {
		arr[i]= s.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(arr[i] == arr[j] && i != j) {
					flag=1;
					//System.out.println(arr[i]);
				}
                if(flag==0) {
				System.out.print(arr[i]);
                }
			}
		}
	}
}