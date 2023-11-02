package Set;

import java.util.Queue;
import java.util.*;

public class QueueEx {

	public static void main(String[] args) {
		
		
		//priority queue and assign it to queue 
		
		Queue<String> q = new LinkedList<String>();
		
		//adding elements 
		
		q.add("rick");
		q.add("maggie");
		q.add("glenn");
		q.add("negan");
		q.add("daryl");
		
		//remove and poll - remove the element 
		//when the queue is empty - remove() - WILL THROW AN EXPECTION
		//poll() - PRINTS NULL
		System.out.println("Elements in queue " + q);
		
		System.out.println("remove element " + q.remove());
		
		System.out.println("head Element " + q.element());
		
		System.out.println("poll() " + q.poll());
		
		System.out.println("peek() " + q.peek());
		
		System.out.println("Elements in queue " + q);
		

	}

}
