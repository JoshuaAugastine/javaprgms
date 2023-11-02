package Sorting;

public class MergeSort {
 //merge two subarrays L and M into arr 
	void merge(int arr[] , int p , int q , int r) {
		 
		// create L - A[p..q] and m - A[q+1..r]
		int n1 = q - p + 1;
	    int n2 = r - q;
	    
	    int L[] = new int[n1];
	    int M[] = new int[n2];
	    
	    for(int i=0; i<n1; i++)
	    	L[i]= arr[p+i];
	    
	    for(int j=0; j<n2; j++)
	    	M[j]= arr[q+ 1+ j];
	    
	    // maintain current idx of sub arrays and main array
	    int i,j,k;
	    i = 0;
	    j = 0;
	    k = p;
	     
	    // until we reach either end of either L or M , pick larger among
	    // elements L and M and place them in the correct position at A[p..q]
	    while (i<n1 && j<n2) {
	    	if(L[i] <= M[j]) {
	    		arr[k] = L[i];
	    		i++;
	    	}
	    	else {
	    		arr[k] = M[j];
	    		j++;
	    	}
	    	k++;
	    }
	    // when we run of element in either L or M 
	    // Pick up the remaining elements and put in A[p..q]
	    while(i<n1) {
	    	arr[k] = L[i];
	    	i++;
	    	k++;
	    }
	}
	 
	// divide the array into two subarrays , sort them n merge them 
	void mergesort(int arr[], int l , int r) {
		if(l<r) {
			
			//m is the point where the array is divided into two sub arrays 
			int m = (l + r)/2;
			
			mergesort(arr , l , m );
			mergesort(arr , m+1 , r);
			
			// merge the sorted subarrays
			merge(arr , l , m ,r);
			
	    	}
	    }
	 static void printarray(int arr[]) {
		 int n = arr.length;
		 for(int i=0; i<n; ++i)
			 System.out.print(arr[i]+ " ");
		 System.out.println();
			 
	}
	public static void main(String[] args) {
		
		int arr[]= {6,5,12,10,9,1};
		
		MergeSort ob = new MergeSort();
		ob.mergesort(arr, 0 , arr.length - 1);
		
		System.out.println("sorted array :");
		printarray(arr);

	}

}
