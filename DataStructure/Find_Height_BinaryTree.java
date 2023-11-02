package DataStructure;

public class Find_Height_BinaryTree {
	
	public static class Node {
	 int data;
	 Node right,left;
	 
	 public Node(int data) {
		 //Assign data to new node, set left and right children to null
		 this.data = data;
		 this.left = null;
		 this.right = null;
	 }
	}
	//represent the root of binary tree
	
	public Node root;
	public Find_Height_BinaryTree () {
	root = null;
	}
	//findhgt()will determine the max hgt of the binary tree
	
	public int findHeight(Node temp) {
		
		//check whether tree is empty
		if(root == null) {
			System.out.println("Tree is Empty");
			return 0;
		}
		else {
			int leftHeight = 0, rightHeight = 0;
			
			//cal the hgt of the subtree
			if(temp.left != null)
				leftHeight = findHeight(temp.left);
			
			//cal the hgt of the subtree
			if(temp.right != null)
				rightHeight = findHeight(temp.right);
			
			//compare hght to left subtree n right subtree
			//and store maximum of two in variable max
			int max = (leftHeight > rightHeight) ? leftHeight : rightHeight;
			
			//cal the tot hght of tree by adding height of the root
		    return(max+1);
		}
	}

	public static void main(String[] args) {
		
		Find_Height_BinaryTree bt = new Find_Height_BinaryTree();
		//add nodes to the binary tree
		bt.root = new Node(1);
		bt.root.left = new Node(2);
		bt.root.left.left = new Node(4);
		bt.root.left.right = new Node(5);
		bt.root.left.left.left = new Node(7);
		bt.root.left.left.right = new Node(8);
		bt.root.left.left.left.left = new Node(9);
		bt.root.right = new Node(3);
		bt.root.right.right = new Node(6);
		bt.root.right.right.left = new Node(10);
		bt.root.right.right.left.left = new Node(12);
		bt.root.right.right.left.right= new Node(13);
		
		
		//disp the max hgt of the given binary tree
		
		System.out.println("Maximum height of the given binary tree :" + bt.findHeight(bt.root));
	}

}
