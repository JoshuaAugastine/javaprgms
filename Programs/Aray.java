package Programs;
import java.util.Scanner;
public class Aray {
	
	
	public static void main(String[] args) {
		int num,min,max,min_idx,max_idx;
		System.out.println("enter the array number of elements");
		Scanner x = new Scanner(System.in);
		num = x.nextInt();
		int arr[] = {0,0,0,0,0};
		System.out.println("Enter the array elements: ");
		for(int i=0;i<num;i++) {
			arr[i]=x.nextInt();
		}
		
		min=arr[0];
		min_idx=0;
		for(int i=1;i<num;i++) {
			if(min>arr[i]) {
				min=arr[i];
				min_idx=i;
			}	
		}
		System.out.println("minimum element in the array: "+min);
		System.out.println("minimum index in the array: "+min_idx);
		
		max=arr[0];
		max_idx=0;
		for(int i=1 ; i<num ; i++) {
			if(max<arr[i]) {
				max=arr[i];
				max_idx=i;
				
			}
			
		}
		System.out.println("maximum element in the array: "+max);
		System.out.println("maximum index in the array: "+max_idx);
		
		System.out.println("output "+( max_idx - min_idx));

	}
	


}
