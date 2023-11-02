package Array2d;

public class DuplicateNeg {

	public static void main(String[] args) {
	
		int arr[] = {1,-20,3,-1,2,-17,8,8,3};
		int inc=0, inc1=0, inc2=0,inc3=0;
		int even[]= new int[5];
		int odd[]=new int[5];
		int neg[]=new int[5];
		int dup[]=new int[5];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				neg[inc++]=arr[i];
			}
				if(arr[i]%2==0) {
					even[inc1++]=arr[i];
				}
				if(arr[i]%2!=0) {
					odd[inc2++]=arr[i];
				}
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						dup[inc3++]=arr[i];
					}	
				}
		}
	System.out.println("odd numbers:");
	for( int i=0;i<inc1;i++) {
		System.out.print(odd[i]+" ");
	}
	System.out.println("\n even numbers:");
	for( int i=0;i<inc2;i++) {
		System.out.print(even[i]+" ");
	}
	System.out.println("\n neg numbers:");
	for( int i=0;i<inc;i++) {
		System.out.print(neg[i]+" ");
	}
	System.out.println("\n duplicate  numbers:");
	for( int i=0;i<inc3;i++) {
		System.out.print(dup[i]+" ");
	}
	
	
	
	}
	
	
	
}
	
