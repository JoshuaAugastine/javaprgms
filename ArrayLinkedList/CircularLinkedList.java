package ArrayLinkedList;

public class CircularLinkedList {
	int flag=0;
	public class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
				}
	}
	//declaring head and tail pointer as null
	public Node head=null;
	public Node tail=null;
	//this function will add the new node at the end of the list
	public void addBeginning(int data){
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
			tail.next=head;
		}
			else {
				newNode.next=head;
				head=newNode;
				
			}
		}
	
	public void add(int data) {
		//create new Node
		Node newNode=new Node(data);
		//check if the list is empty
		if(head==null)
		{
			//if list is empty,both head and tail would point to new node
			head=newNode;
			tail=newNode;
			newNode.next=head;
		}
		else {
			//tail will point to new node.
			tail.next=newNode;
			//New node will become new tail
			tail=newNode;
			//since,it is circular linked list tail will point to head
			tail.next=head;
		}
	}
	//Displays all the nodes in the list
	public void insertBetween(int data,int item) {
		Node newNode=new Node(data);
		Node current=head;
		if(head==null) {
			head=newNode;
			tail=newNode;
			tail.next=head;
			return;
		}
		else {
			do {
				if(current.data==item) {
					if(current ==tail) {
						tail.next=newNode;
						tail=newNode;
						tail.next=head;
						current=newNode;
				}
				else {
					newNode.next=current.next;
					current.next=newNode;
					current=newNode;
				}
			}
			current=current.next;
			}while(current!=head);
		}
	}
	public void addNodeLast(int data){
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			tail=newNode;
			tail.next=head;
		}
			else {
				tail.next=newNode;
				tail=newNode;
				tail.next=head;
				
			}
		}
	public void deleteNode(int data) {
		Node newNode =new Node (data);
		Node current =head;
		if(head==null) {
			System.out.println("list is empty");
			return ;
		}
		do {
			if(current==head && current.data==data) {
				newNode = head.next;
				tail.next=newNode;
				head = newNode;
				
			}
			else if(current.next.data==data) {
				newNode=current.next;
				current.next=newNode.next; 
				flag=1;
			}
			current=current.next;
		}while(current!=head);
		if(flag==0){
		System.out.println("element not present");
		}
	}
	
	public void display() {
		Node current=head;
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		else {
			System.out.println("Nodes of the circular linked list:");
			do {
				//prints each node by incrementing pointer.
				System.out.print(" "+current.data);
				current=current.next;
			}while(current!=head);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		CircularLinkedList cl=new CircularLinkedList();
		//Adds data to the list
		cl.add(1);
		cl.addBeginning(5);
		cl.add(2);
		cl.add(3);
		cl.add(4);
		cl.deleteNode(2);
		cl.addNodeLast(12);
		cl.insertBetween(10,12);
		
		//display all the nodes present in the list
		cl.display();
		
	}

}
