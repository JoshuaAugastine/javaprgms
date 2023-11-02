package Set;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;

public class Treemap {

	public static void main(String[] args) {
		//declare treemap
		
		TreeMap<Integer , String> tmap = new TreeMap <Integer , String>();
		
		//Add
		
		tmap.put(2, "data");
		tmap.put(3, "atta");
		tmap.put(4, "kata");
		
		//display using iterator
		
		Set set = tmap.entrySet();
		Iterator iterator = set.iterator() ;
		while(iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			System.out.println("key is : " + mentry.getKey() + " " + " & value is :" + mentry.getValue());
			//System.out.print(mentry.getValue());
			
		}

	}

}
