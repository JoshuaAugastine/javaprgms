package DataStructure;

public class SinglyLinkedlist {
	
	public class Node{
		   int data ; //class variable
		   Node next; // to form linked list
		   public Node(int data) { //parameter
			   this.data=data;
			   this.next=null;
			   }
	}
	//implementation1 - refer class note
    public Node head = null;
    public Node tail = null;
    //imp2 
     public void addNode(int data) {
    	 Node newNode = new Node(data);
    	 
    	 if(head==null) {
    		 head = newNode;
    		 tail = newNode;
    	 }
    	 //next is the link to connect with next node
    	 else {
    		 tail.next = newNode;
    		 tail = newNode;
    	 }
     }
     
     public void display() {
    	 Node current = head;
    	 if(head==null) {
    		 System.out.println("List is empty");
    		 return;// if the current head is empty , we need to see anything at if and else , we breaking the issue
    	 }
    	 else {
    		 System.out.println("Nodes are singly linked list");
    		 while(current!=null) { // current - head then it will change , it need to stop at null 
    			 System.out.println(current.data);
    			 current = current.next;
    			 
    		 }
    		 System.out.println("Node Completed");
    	 }
     }
	public static void main(String[] args) {
		
		SinglyLinkedlist sl = new SinglyLinkedlist();
		sl.display();
		sl.addNode(1);
		sl.addNode(2);
		sl.addNode(3);
		sl.addNode(4);
		sl.display();
	}

}
