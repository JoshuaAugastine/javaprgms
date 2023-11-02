package Assesment2;
import java.util.Scanner;

public class Totalparcel {
	 static int method(int arr[], int min, int n, int p) {
		 int count=0, weight=0;
		 check:
			 for(int i=0; i<n; i++) {
				 weight+=arr[i];
				 if(weight>min) {
					 weight=0;
					 i--;
					 ++count;
					 continue check;
				 }
				 if(count==p) {
					 if(--i==n-1)
						 return min;
					 else {
						 min++;
						 i=-1;
						 count=0;
						 weight=0;
						 continue check;
					 }
				 }
			 }
		 return min;
	 }

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int j=0;j<t;j++) {
			int n=s.nextInt();
			int sum=0;
			int p = s.nextInt();
			int arr[]= new int[n];
			for(int i=0; i<n; i++) {
				arr[i]=s.nextInt();
				sum+=arr[i];
			}
			int min=sum/p;
			int result=method(arr,min,n,p);
			System.out.print(result+" ");
		}
	}
}
