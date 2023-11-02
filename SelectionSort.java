import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		int n;
		Scanner x = new Scanner(System.in);
		System.out.println("enter the no. of the elements ");
		n = x.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the elements ");
		for(int i=0; i<n; i++) {
	    arr[i] = x.nextInt();
		}
		 
		for(int step=0; step<n-1; step++) {
			int min_idx = step;
			for(int i=step+1; i<n; i++) {
				if(arr[min_idx]>arr[i]) {
					min_idx=i;
				}
			}
			   int temp = arr[step];
			   arr[step] = arr[min_idx];
			   arr[min_idx] = temp;
		}
		System.out.println("Ater Selection Sorting ");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+ " ");
		}
		}
	
	

}
