package Assesment2;

public class Duplicate {

	public static void main(String[] args) {
		int[] arr=new int[] {1,2,2,3,3,4};
		System.out.println("Dulpicate element is given array:");
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j])
					System.out.print(arr[i]+" ");
		}
			}
		}
	}

