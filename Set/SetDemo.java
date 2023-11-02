package Set;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		//set is not allowed to using duplicate elements
		
		int count [] = {34,22,10,60,30,22};
		//hashset find the dulipcate set in element
		//hash table to store element as fast
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0; i<count.length; i++) {
			set.add(count[i]);
			
		}
		//treeset is used to automatically sort the element
		System.out.println(set);
		TreeSet<Integer> sortedSet = new TreeSet<Integer>(set);
		System.out.println("The sorted list is :");
		System.out.println(sortedSet);
		System.out.println("The first element of the set is :" +(Integer)sortedSet.first());
		System.out.println("The last element of the set is :" +	(Integer)sortedSet.last());
	}

}
