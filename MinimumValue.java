
public class MinimumValue {

	public static void main(String[] args) {
		int[] arr= {12,7,45,78,2};
		int n = arr.length;
		int min = arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]<min) {
				min=arr[i];
			System.out.println("minimum element" + min);
			}
		}
			

	}

}
