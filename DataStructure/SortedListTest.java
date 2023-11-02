package DataStructure;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;


class SortedList {
	
	private ArrayList<Integer>list;
	
	//constructor
	
	public SortedList() {
		list = new ArrayList<Integer>();
	}
    
	//fn to check if list is empty
	public boolean isEmpty()
	{
		return list.size() == 0 || list == null;
	}
	//fn to clear list
	public void clear()
	{
		list = new ArrayList<Integer>();
	}
	//fn to get size of list 
	public int size() {
		return list.size();
	}
	//fn to add element to list 
	public void add(int ele) {
		int pos = list.size();
		list.add(ele);
		while(pos > 0 && ele < list.get(pos-1)) {
			list.set(pos,list.get(pos-1));
			pos--;
		}
		list.set(pos, ele);
	}
	//remove
	public void remove(int ind) {
		list.remove(ind);
	}
	//fn to perform binary search
	public int binarySearch(int ele) {
		return Collections.binarySearch(list,ele);
	}
	//fn to check if element is present in list
	public boolean contains(int ele) {
		return binarySearch(ele)>=0;
	}
	//FN to string
	public String toString() {
		return list.toString();
	}
}
	//class sortedlist
	public class SortedListTest
	{
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		//creating obj of class sortedlist
		SortedList list = new SortedList();
		
		System.out.println("SORTED LIST TEST\n");
		char ch;
		//perform list opertion
		do {
			System.out.println("\nSORTED LIST OPERATIONS\n");
			System.out.println("1 . insert");
			System.out.println("2 . remove");
			System.out.println("3 . binary search");
			System.out.println("4 . contains");
			System.out.println("5 . check empty");
			System.out.println("6 . get size");
			System.out.println("7 . clear");
			int choice = x.nextInt();
			switch(choice) {
			case 1: 
				System.out.println("enter integer element to add");
				list.add(x.nextInt());
				break;
			case 2:	
				System.out.println("enter index");
				list.remove(x.nextInt());
				break;
			case 3:
				System.out.println("enter integer element to search");
				System.out.println(" binary search result : ");
				list.binarySearch(x.nextInt());
				break;
			case 4:
				System.out.println("enter integer element");
				System.out.println("contains result :");
				list.contains(x.nextInt());
				break;
			case 5:
				System.out.println("empty status =" + list.isEmpty());
				break;
			case 6:
				System.out.println("Size = " + list.size() +"\n");
				break;	
			case 7:
				System.out.println("sorted list cleared");
				list.clear();
				break;
			default:
				System.out.println("wrong entry \n");
		        break;
			}
		System.out.println(list);
		System.out.println("\n Do you want to continue (type y or n) \n ");
		ch = x.next().charAt(0);
		}
		while(ch == 'Y' || ch == 'y');
	}
	}

