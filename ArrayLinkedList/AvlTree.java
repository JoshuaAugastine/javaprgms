package ArrayLinkedList;


     
	//create NodeA 
	
	class NodeA{
		int item,height;
		NodeA left,right;
		
		NodeA(int d){
			item = d;
			height = 1;
		}
	}
	//tree class 
	
	class AvlTree{
		NodeA root;
		int height(NodeA N) {
		if(N == null)
			return 0;
		return N.height;
	}
  int max(int a, int b) {
	  return (a>b)? a:b ; 
	  }
  
  NodeA rightRotate(NodeA y) {
	  NodeA x = y.left;
	  NodeA T2 = x.right;
	  x.right = y;
	  y.left = T2;
	  y.height = max(height(y.left),height(y.right))+1;
	  x.height = max(height(x.left),height(x.right))+1;
	  return x;
  }
  
  NodeA leftRotate(NodeA x) {
	  NodeA y = x.right;
	  NodeA T2 = y.left;
	  y.left = x;
	  x.right = T2;
	  x.height = max(height(x.left),height(x.right))+1;
	  y.height = max(height(y.left),height(y.right))+1;
	  return y;
  }
  
  //get balance factor of a NodeA
  
  int getBalanceFactor(NodeA N) {
	  if(N == null)
		  return 0;
	  return height(N.left) - height(N.right);
  }
  
  //insert a NodeA
  NodeA InsertNodeA(NodeA NodeA , int item) {
	  
	  //find the pos and insert the NodeA
	  
	  if(NodeA == null)
		  return(new NodeA(item));
	  if(item < NodeA.item)
		  NodeA.left = InsertNodeA(NodeA.left,item);
	  else if(item > NodeA.item)
		  NodeA.right = InsertNodeA(NodeA.right , item);
	  else
		  return NodeA;
	  
	  //update the balance factor of each NodeA 
	  NodeA.height = 1+ max(height(NodeA.left),height(NodeA.right));
	  int balanceFactor = getBalanceFactor(NodeA);
	  if(balanceFactor > 1) {
		  
		  if(item < NodeA.left.item) {
			  return rightRotate(NodeA);
		  }
			  else if(item > NodeA.left.item) {
				  NodeA.left = leftRotate(NodeA.left);
				  return rightRotate(NodeA);
			  }
	  }
  if (balanceFactor < -1) {
	  if(item > NodeA.right.item) {
		  return leftRotate(NodeA);
	  }
	  else if(item < NodeA.right.item) {
		  NodeA.right = rightRotate(NodeA.right);
		  return leftRotate(NodeA);
	  }
	  }
  return NodeA;
  }
	
NodeA NodeAWithMinValue(NodeA NodeA) {
	NodeA current= NodeA;
	while(current.left != null)
		current = current.left;
	return current;
}
  //del a NodeA
NodeA deleteNodeA(NodeA root , int item) {
	//find the NodeA to be deleted
	
	if(root == null)
		return root;
	if(item < root.item)
		root.left = deleteNodeA(root.left , item);
	else if(item > root.item)
		root.right = deleteNodeA(root.right , item);
	else {
		if((root.left == null) || (root.right == null)) {
			NodeA temp = null;
			if(temp == root.left)
				temp = root.right;
			else
				temp = root.left;
			   if(temp == null) {
				   temp = root;
				   root = null; 
			   }
			   else 
				   root = temp;
		}
		else {
			NodeA temp = NodeAWithMinValue(root.right);
			root.item = temp.item;
			root.right = deleteNodeA(root.right, temp.item);
		}
	}
	if(root == null)
		return root;
	
	//update the balance factor
	
	root.height = max(height(root.left), height(root.right))+1;
	int balanceFactor = getBalanceFactor(root);
	if(balanceFactor > 1) {
		if(getBalanceFactor(root.left) >= 0) {
			return rightRotate(root);
		}
		else {
			root.left = leftRotate(root.left);
			return rightRotate(root);
		}
	}
	if(balanceFactor < -1) {
		if(getBalanceFactor(root.right) <= 0) {
			return leftRotate(root);
		}
		else {
			root.right = rightRotate(root.right);
			return leftRotate(root);
		}
	}
	return root;
		}
			void preOrder(NodeA NodeA) {
				if(NodeA != null) {
					System.out.print(NodeA.item + " ");
					preOrder(NodeA.left);
					preOrder(NodeA.right);
					
			   }
		}
	private void printTree(NodeA currPtr, String indent , boolean last) {
		if(currPtr != null ) {
			System.out.print(indent);
			if(last) {
				System.out.print("R------");
				indent += " ";
			}
			else {
				System.out.print("L------");
				indent += "| ";
			}
		System.out.println(currPtr.item);
		printTree(currPtr.left, indent,false);
		printTree(currPtr.right, indent,true);
		
		
			}
		}
	// driver code 
	public static void main(String[] args) {
		AvlTree tree = new AvlTree();
		tree.root = tree.InsertNodeA(tree.root, 33);
		tree.root = tree.InsertNodeA(tree.root, 13);
		tree.root = tree.InsertNodeA(tree.root, 53);
	    tree.root = tree.InsertNodeA(tree.root, 9);
	    tree.root = tree.InsertNodeA(tree.root, 21);
		tree.root = tree.InsertNodeA(tree.root, 61);
		tree.root = tree.InsertNodeA(tree.root, 8);
	    tree.root = tree.InsertNodeA(tree.root, 11);
	    tree.printTree(tree.root, " ", true);
	    tree.root = tree.InsertNodeA(tree.root, 13);
	    System.out.println("after deletion :");
	    tree.printTree(tree.root, " ", true);
	}
	  }
 