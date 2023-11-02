package DataStructure;

//node creation
	class Node{
		int data;
		Node left,right;
		
		Node(int d){
			data = d;
			left = right = null;
		}
	}
	// cal hgt
	class Height {
		int height = 0 ;
	}

	public class BalancedTree_HeightBal {
		Node root;
		
		public BalancedTree_HeightBal () {
			root = null;
		}
		
     //check hght balance
		boolean checkHeightBalance(Node root, Height height) {
			
			if(root == null) {
				height.height = 0;
				return true;
			}
			
			Height leftHeighteight = new Height(), rightHeighteight = new Height();
			boolean l = checkHeightBalance(root.left , leftHeighteight);
			boolean r =  checkHeightBalance(root.right , rightHeighteight);
			int leftHeight = leftHeighteight.height ;
			int rightHeight = rightHeighteight.height;
			
			height.height = (leftHeight > rightHeight ? leftHeight : rightHeight ) + 1 ;
			
			if ((leftHeight - rightHeight >=2 ) || (rightHeight - leftHeight >=2))
				return false;
			
			else 
				return l && r;
		}
	public static void main(String[] args) {
	        Height height = new Height();
	        BalancedTree_HeightBal tree = new BalancedTree_HeightBal();
	        
	        tree.root = new Node(1);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(5);
	        
	        if(tree.checkHeightBalance(tree.root, height))
	        	System.out.println("tree is balanced");
	        else
	        	System.out.println("tree is not balanced");
	        
	}

}
