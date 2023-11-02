package Assesment2;
import java.util.Scanner;
public class OddxEven {
  public static void main(String args[]) {
	int m;
	Scanner s=new Scanner(System.in);
	System.out.print("enter the number of elements   : ");
	m=s.nextInt();
	int arr[]=new int[m];
	System.out.println("enter the elements of array  :");
	for(int j=0;j<m;j++) {
		arr[j]=s.nextInt();

	}System.out.println("elemets of array are");
	for(int x:arr) {
		
	System.out.print(x+" ");}
	System.out.println();
	System.out.println("even numbers are ");
	for(int i=0;i<m;i++) {
		if(arr[i]%2==0) {
		System.out.print(arr[i]+" ");
		}	
	}System.out.println();
	System.out.println("odd numbers are ");
	for(int i=0;i<m;i++) {
		if(arr[i]%2!=0) {
		System.out.print(arr[i]+" ");
		}
		
	}
}
}