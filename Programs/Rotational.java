package Programs;

import java.util.Scanner;

public class Rotational {
	
	public static void main(String[] arg) {
		//single rotation
		int arr[]= {1,2,3,4,5};
		int n=arr.length;
		int x =arr[n-1];
		for(int i=n-2;i>=0;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[0]=x;
		System.out.println("Enter the value");
		for(int a:arr) {
			System.out.println(a);
		}
		//.... full rotation
		int ar[]= {1,2,3,4,5};
		int rot,e;
		Scanner z = new Scanner(System.in);
		System.out.println("Enter the value");
		rot= z.nextInt();
		int y =ar.length;
		for(int r=1;r<=rot;r++) {
			e=arr[n-1];
		for(int i=n-2;i>=0;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[0]=x;
		for(int array:ar) {
			System.out.println(array+"");
		}
		System.out.println("rotatted atrray");
		}
	}
}
	

