package Vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		
		//initial capacity size - 2
		Vector<String> vec = new Vector <String> ();
		
		//adding element 
		
		vec.addElement("Apple");
		vec.addElement("Orange");
		vec.addElement("Mango");
		vec.addElement("Fig");
		
		//check size and capacity inc
		
		System.out.println("size is : " + vec.size());
		System.out.println("Default capacity increment is: " + vec.capacity());
		
		vec.addElement("fruit1");
		vec.addElement("fruit2");
		vec.addElement("fruit3");
		
		//size and capacity inc after two insertion
		
		System.out.println("size after addition : " + vec.size());
		System.out.println("capacity after increment : " + vec.capacity());
		
		//display vector elements
		//using enumeration is display the vector element content at simtaneously without losing
		//capacity - memory storage    // size - element size
		//size = 2 + 2 =4 / capacity = 2  / size increment = 4 / capacity = double size = 4+4=8
		Enumeration en = vec.elements();
		System.out.println("\n Elements are :");
		while(en.hasMoreElements())
			System.out.println(en.nextElement() +" ");
		
	}

}
