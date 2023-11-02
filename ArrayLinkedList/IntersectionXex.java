package ArrayLinkedList;

import java.util.Scanner;
import java.util.HashMap;

public class IntersectionXex {
	
	static class Node{
		int data;
		Node next;
	}
	
	static Node head_ref;
	
    static void append(int new_data) { 
        	 
        	Node new_node = new Node();
        	Node last = head_ref;
           	new_node.data = new_data;
            new_node.next = null;
    
    if (head_ref == null) {
    	head_ref = new_node;
    	return;
    }
    while(last.next != null)
    	last = last.next;
        last.next = new_node;
    return;
    }
    
    static int getFirstDuplicate(Node node)
    {
    	HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
    	Node head = node;
    	
    	while(node != null) {
    		if(mp.containsKey(node.data)) mp.put(node.data, mp.get(node.data) + 1);
    		else mp.put(node.data,1);
    		node = node.next;
    	}
    		node = head;
    		
    		while(node != null) {
    			if(mp.get(node.data)>1)
    				return node.data;
    			node = node.next;
    		}
    		return -1;
    }
 public static void main(String[] args) {
	    int result;
	    head_ref = null;
	    Scanner s = new Scanner(System.in);
		System.out.print("enter the number of elements  :");
		int n= s.nextInt();
		System.out.println("enter the elements  :");
		for(int i=0; i<n; i++) {
		append(s.nextInt());
		}
	  result=getFirstDuplicate(head_ref);
	  if(result==-1)
		 System.out.println("unique element :");
	  else 
		  System.out.println("the duplicate element is :" +result);
	  }
		}


