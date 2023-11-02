package ArrayLinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class ExA1 {

	public static void main(String[] args) {
	 LinkedList<String> list = new LinkedList<String>();
	 
	 //Adding elements to linked list 
	 
	 list.add("steve");
	 list.add("carl");
	 list.add("john");
	 
	 //adding an element to first position 
	 list.addFirst("syl");
	 
	 //adding an element to last position 
	 list.addLast("josh");
	 
	 //adding an element to 3rd position 
	 list.add(2, "peter");
	 
	 //remove 
	 
	 //list.remove(2);
	// list.removeFirst();
	 
	 //Itertor linkedlist
	 
	 Iterator<String> iterator = list.iterator();
	 while(iterator.hasNext()) {
		 System.out.println(iterator.next());
	 }
	}
     
}
