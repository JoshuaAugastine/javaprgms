package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.*;

public class IteratorDemo {

	// print the array list in forward direction - use iterator 
	
	public static void main(String[] args) {
		
		//create a new array
		
		ArrayList<String> a1 = new ArrayList<String>();
		
		//add elements to the arraylist 
		
		a1.add("c");
		a1.add("A");
		a1.add("E");
		a1.add("B");
		a1.add("D");
		a1.add("F");
		
		//use iterator to display conttents to a1
		;
			    System.out.print("Original contents of a1 : ");
			    Iterator<String> itr=a1.iterator();
			    while(itr.hasNext()){
			    Object element=itr.next();
			    System.out.print(element+" ");
				
			}
			System.out.println();
			
			ListIterator<String> litr=a1.listIterator();
			while(litr.hasNext()){
			  Object element=litr.next();
			  litr.set(element+"+");
			
			}
			   System.out.print("Modified contents of a1 : ");
			   itr=a1.iterator();
			   while(itr.hasNext()){
				    Object element=itr.next();
				    System.out.print(element+" ");
		   
			   }
			   System.out.println();
			   System.out.print("Modified list backwards  ");
			   while(litr.hasPrevious()){
			   Object element=litr.previous();
			    System.out.print(element+" ");

			   }
			    System.out.println();

			}
		}
