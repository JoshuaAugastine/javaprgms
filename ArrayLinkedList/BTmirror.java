package ArrayLinkedList;

class Node0 {
	int data;
	Node0 right=null,left=null;
	
	Node0(int data) {
		this.data = data;
	}
}
class BTmirror {

	public static void preorder(Node0 root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preorder(root.left);
		preorder(root.right);
	}
	
	public static void swap(Node0 root) {
		if(root == null) {
			return;
		}
		Node0 temp = root.left;
		root.left = root.right;
		root.right = temp;
	}
	public static void convertToMirror(Node0 root) {
		if(root == null) {
			return;
		}
				convertToMirror(root.left);
				convertToMirror(root.right);
				swap(root);
			}
	public static void main(String[] args) {
		   Node0 root = new Node0(1); 
		   root.left = new Node0(2);
		   root.right = new Node0(3);
		   root.left.left = new Node0(4);
		   root.left.right = new Node0(5);
		   root.right.left = new Node0(6);
		   root.right.right = new Node0(7);
		   
          convertToMirror(root);
          preorder(root);
	}
		}
	
