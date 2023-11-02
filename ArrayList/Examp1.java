package ArrayList;

import java.util.ArrayList;

public abstract class Examp1 {

	public static void main(String[] args) {
	 ArrayList<String> alist = new ArrayList<String>();
	 alist.add("steve");
	 alist.add("tim");
	 alist.add("lucy");
	 alist.add("pat");
	 alist.add("angela");
	 alist.add("jen");
	 alist.add("tom");
	 
	 //displaying element
	 
	 System.out.println(alist);
	
	 //adding 'steve' at the fourth pos 
	 
	 alist.add(3,"steve");
	 
	 //displaying element
	 System.out.println(alist);
	}

}
