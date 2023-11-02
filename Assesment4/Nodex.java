package Assesment4;

public class Nodex {
	 int data ; 
	 Nodex next; 
	 public Nodex(int data) {
	 this.data=data;
	 this.next=null;
 }
	 public Nodex head = null;
	 public Nodex tail = null;
	 
   public void insertAtBeginning(int data) {
			Nodex newNode=new Nodex(data);
			newNode.next=head;
			head=newNode;
  }
	    
	 public void addNode(int data) {
	    	 Nodex newNode = new Nodex(data);
	    	 
	    	 if(head==null) {
	    		 head = newNode;
	    		 tail = newNode;
	    	 }
	    	 else {
	    		 tail.next = newNode;
	    		 tail = newNode;
	    	 }
	     }
	 public void insertAtEnd(int data) {
			Nodex newNode=new Nodex(data);
			if(head==null) {
				head=newNode;
				tail=newNode;
				return;
			}
			Nodex current=head;
			while(current.next!=null) {
				current=current.next;
			}
			current.next=newNode;
		}
	 
	public void display() {
	    	 Nodex current = head;
	    	 if(head==null) {
	    		 System.out.println("List is empty");
	    		 return;
	    	 }
	    	 else {
	    		 System.out.println("Nodes are singly linked list");
	    		 while(current!=null) { 
	    			 System.out.println(current.data);
	    			 current = current.next;
	    			 
	    		 }
	    		 System.out.println("Node Completed");
	    	 }
	     }
		public static void main(String[] args) {
			
	        Nodex n = new Nodex(0);
			n.display();
			n.addNode(10);
			n.addNode(20);
			n.insertAtEnd(100);
			n.addNode(30);
			n.addNode(40);
			n.insertAtBeginning(1000);
			n.insertAtBeginning(2000);
			n.display();
		}

	}

