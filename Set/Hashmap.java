package Set;

import java.util.Map;
import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		// hashmap is need to declare keys and values
		//it have a key n value so need to use map - json
		//itertion is used to display the element one by one
		Map<String ,Integer> m1 = new HashMap<String , Integer>();
		m1.put("zara", 5601);
		m1.put("gayu", 5602);
		m1.put("adam", 5603);
		m1.put("eval", 5604);
		
		System.out.println();
		System.out.println("map elements");
		System.out.println("\t "+ m1);
		System.out.println(m1.get("zara"));
		
	}

}
