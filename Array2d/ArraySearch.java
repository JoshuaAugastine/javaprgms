package Array2d;
import java.util.Scanner;
public class ArraySearch {
	public static void main(String[] args) {
	int n,search;
    Scanner x = new Scanner(System.in);
    System.out.println("enter the no. element  :");
    n = x.nextInt();
    int[] arr = new int[n];
    System.out.print("enter the no. of elements :");
    for(int i=0; i<n; i++) {
     arr[i]=x.nextInt();
    }
    System.out.println("enter the search element :");
    search = x.nextInt();
    
    for(int i=0; i<n; i++) {
    	if(arr[i]==search) {
    		System.out.println("search element" + " " +search + " " + "at postion "+ " "+ (i+1));
    	}
    }
	}
    
}
