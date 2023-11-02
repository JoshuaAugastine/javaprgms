package Set;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public class HashmapLooping {

	public static void main(String[] args) {
		// forloop
		// while loop + iteration
		
		HashMap<Integer , String> hmap = new HashMap<Integer , String>();
		
		//adding 
		
		hmap.put(11,"jo");
		hmap.put(3,"jb");
		hmap.put(5,"srk");
		hmap.put(9,"mes");
		hmap.put(7,"cr");
         
		// forloop
		System.out.println("for loop :");
		for (Map.Entry me : hmap.entrySet()) {
			System.out.println("key :" + me.getKey() + " " + "& value : " + me.getValue());
		}
		
		//while loop & iteration
		
		System.out.println("while loop :");
		Iterator iterator = hmap.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry me2 = (Map.Entry)iterator.next();
			System.out.println("key :" + me2.getKey() + " " + "& value : " + me2.getValue());
		}
	}

}
