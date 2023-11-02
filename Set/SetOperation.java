package Set;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class SetOperation {

	public static void main(String[] args) {
		
		Integer[] A = {22,45,33,66,55,34,77};
		Integer[] B = {33,2,83,45,3,12,55};
		Set<Integer>set1= new HashSet<Integer>();
		set1.addAll(Arrays.asList(A));
		Set<Integer>set2= new HashSet<Integer>();
		set2.addAll(Arrays.asList(B));
		
		//finding union
		
		Set<Integer>Union_data = new HashSet<Integer>(set1);
		Union_data.addAll(set2);
		System.out.println("Intersection of set1 and set2");
		System.out.println(Union_data);
		
		// intersection 
		
		Set<Integer>Intersection_data = new HashSet<Integer>(set1);
		Intersection_data.retainAll(set2);
		System.out.println("Intersection of set1 and set2");
		System.out.println(Intersection_data);
		
		//finding differeence
		
		Set<Integer>difference_data = new HashSet<Integer>(set1);
		
		difference_data.removeAll(set2);
		System.out.println("difference of set1 and set2");
		System.out.println(difference_data);
		
		
		

	}

}
