package DataStructure;

public class DoublyLinkedlist {
	int flag=0;
	class NodeZ {
		
		int data;
		public NodeZ prev;
		public NodeZ next;
		 public NodeZ(int data) {
			 this.data= data;
		 }
	}
    NodeZ head = null;
    NodeZ tail = null;
    public void addNode(int data) {
    	NodeZ temp = new NodeZ(data);
    	if(tail != null){
    		tail.next= temp;
    		temp.prev=tail;
    	}
    	tail = temp;
    	if(head == null) {
    		head=temp;
    	}
    System.out.println("New node added :" + data);
}
    	public int removeNodeFront() {
    		NodeZ temp = head;
    		head = head.next;
    		head.prev=null;
    		System.out.println("deleted" + temp.data);
			return temp.data;
    	}
    	public int removeNodeBack() {
    		NodeZ temp = tail;
    		tail = tail.prev;
    		tail.next=null;
    		System.out.println("deleted" + temp.data);
			return temp.data;
    	}
    	public void removeElement(int data) {
    		NodeZ temp = head;
    		if(head.data == data) {
    		head = head.next;
    		head.next.prev=null;
    		}
    		while(temp!=null) {
    			if(temp.data == data) {
    				temp.next.prev = temp.prev;
    				temp.prev.next = temp.next;
    				flag=1;
    			}
    			temp = temp.next;
    		}
    		if(flag==0)
    			System.out.println("ELEMENT IS NOT PRESENT");
    		}
    	public void iterateForward() {
    		NodeZ temp = head;
    		while(temp != null) {
    			 System.out.println(temp.data);
    			 temp = temp.next;
    		}
    	}
    	public void addNodeFront(int data) {
    		NodeZ temp = new NodeZ(data);
    		if(head != null) {
    			head.prev = temp;
    			temp.next = head;
    		}
    		head=temp;
    		if(tail==null) {
    			tail = temp;
    		}
    		System.out.println("new node added :" + data);
    	}
    	public void iterateBackward() {
    		NodeZ temp = tail;
    		while(temp != null) {
    			 System.out.println(temp.data);
    			 temp = temp.prev;
    		}
    	}
	public static void main(String[] args) {
		DoublyLinkedlist dl = new DoublyLinkedlist();
		dl.addNode(2);
		dl.addNode(4);
		dl.addNode(6);
		dl.addNode(8);
		dl.addNodeFront(100);
		dl.addNode(10);
		dl.removeNodeFront();
		dl.removeNodeBack();
		dl.removeElement(40);
		System.out.println("FORWARD DIRECTION:");
		dl.iterateForward();
		System.out.println("BACKWORD DIRECTION:");
		dl.iterateBackward();

	}

}
