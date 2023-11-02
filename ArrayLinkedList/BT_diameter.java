package ArrayLinkedList;
import java.util.concurrent.atomic.AtomicInteger;
class Node1{
	int data;
	Node1 left = null, right = null;
	
	Node1(int data){
		this.data = data;
	}
}
  class BT_diameter{
	  //fn to find the diameter of the binary tree , note that the 
	  //fn returns the height of the subtree rooted at a given node,
	  //and the diameter is updated within the fn as it is passed by
	  //ref using "AutomaticInteger" class .
	  public static int getDiameter(Node1 root , AtomicInteger diameter) {
		  //base case; tree is empty
		  if(root == null) {
			  return 0;
		  }
	 //get heights of the left and right subtrees
		  int left_height = getDiameter (root.left , diameter);
		  int right_height = getDiameter (root.right , diameter);
		 //cal diameter "through" the current mode
          int max_diameter = left_height + right_height + 1;
          //update max diameter ( note the diameter " excluding " the current
          //node in the subtree rooted at the current node is already updated
          //since we are doing postorder traversal
          diameter.set(Math.max(diameter.get(), max_diameter));
          //its important to return the height of the subtree rooted at the current node
          return Math.max(left_height, right_height)+1;
	  }
	    public static int getDiameter(Node1 root) {
	    	AtomicInteger diameter = new AtomicInteger(0);
	    	getDiameter(root,diameter);
	    	return diameter.get();
	    }

	
	public static void main(String[] args) {
		
		Node1 root = new Node1(1);
	    root.left = new Node1(2);
	    root.right = new Node1(3);
	    root.left.right = new Node1(4);
	    root.right.left = new Node1(5);
	    root.right.right = new Node1(6);
	    root.right.left.left = new Node1(7);
	    root.right.left.right = new Node1(8);
	    
	    System.out.print ("the diameter of the tree is :" + getDiameter(root));
	    

	}

}
