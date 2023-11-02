package Set;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hashmap2 {

	public static void main(String[] args) {
		
		//declare hashmap
		//hashmap even ever using iterator u must to declare map.entry
		//entry set is used to moving the cursor to element 1
		
		HashMap <Integer , String> hmap = new HashMap<Integer ,String>();
		
		// adding element to hashmap
		
		hmap.put(12, "joshua");
		hmap.put(13, "jenish");
		hmap.put(14, "madhan");
		hmap.put(15, "naresh");
		hmap.put(16, "akash");
		
		Set set = hmap.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry)iterator.next();
			System.out.print("key is : " + mentry.getKey() + " & value is :");
			System.out.println(mentry.getValue());
			
		}
		String var = hmap.get(2);
		System.out.println("Value at index 2 is : " +var);
		
		//remove
		hmap.remove(3);
		System.out.print("map key and values after removal :");
		Set set2 = hmap.entrySet();
		Iterator iterator2 = set2.iterator();
		while(iterator2.hasNext()) {
			Map.Entry mentry2 = (Map.Entry)iterator2.next();
			System.out.print("key is : " + mentry2.getKey() + " & value is :");
			System.out.println(mentry2.getValue());
		
		
		}
	}

}
