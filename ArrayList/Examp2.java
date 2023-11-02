package ArrayList;

import java.util.ArrayList;

public class Examp2 {

	public static void main(String[] args) {
	     @SuppressWarnings("rawtypes")
		 ArrayList<Comparable> alist = new ArrayList<Comparable>();
		 alist.add("steve");
		 alist.add("tim");
		 alist.add("lucy");
		 alist.add("pat");
		 alist.add("angela");
		 alist.add(3);
		 alist.add(12.0);
		 
		 //displaying element
		 
		 System.out.println(alist);
		
		 //removing 'steve' and 'angela'
		 alist.remove("angela");
		 alist.remove("steve");
		 
		 //to update the element 
		 alist.set(4, "mondal");
		 //displaying element
		 System.out.println(alist);
		 
		 //removing 3rd element
		 
		 alist.remove(2);
		 
		 //to add  a value using index
		 alist.add(0,"harsha");
		 alist.add(3,"josh");
		 
		 System.out.println(alist.get(2));
		 System.out.println(alist.indexOf("mondal"));
		 System.out.println(alist.contains("josh"));
		 
		 //to clear
		 alist.clear();
         
		//displaying element
		 System.out.println(alist);
		 
	 
		//displaying element with size 
		 System.out.println(alist.size());
	}

}
