package binaryTree;

public class BinaryTree{

	Node root;
	
	public void addNode(int key, String name) {
		
		Node newNode = new Node(key, name);
		
		if(root == null) {
			
			root = newNode;

		} else {
			Node focusNode = root;
			
			Node parent;
			
			while(true) {
				
				parent = focusNode;
				
				if(key < focusNode.key) {
					focusNode = focusNode.leftChild;
					
					if(focusNode == null) {
						parent.leftChild = newNode;
						return;
					}
				} else {
					focusNode = focusNode.rightChild;
					
					if(focusNode == null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}

	public void inOrderTraverseTree(Node focusNode) {
		if(focusNode != null) {
			inOrderTraverseTree(focusNode.leftChild);
			
			System.out.println(focusNode);
			
			inOrderTraverseTree(focusNode.rightChild);
		}
	}		
	
	public static void main(String[] args) {
	
		BinaryTree theTree = new BinaryTree();
		
		theTree.addNode(50, "Boss");	
		theTree.addNode(25, "V Boss");	
		theTree.addNode(15, "O Boss");	
		theTree.addNode(30, "S Boss");	
		theTree.addNode(75, "Sales");	
		theTree.addNode(85, "Salesman");	
		theTree.addNode(60, "Salesman 1");	
		
		theTree.inOrderTraverseTree(theTree.root);
	}
	
}



class Node{
	
	int key;
	String name;
	
	Node leftChild;
	Node rightChild;
	
	Node(int key, String name){
		this.key = key;
		this.name = name;
	}
	
	public String toString() {
		return name + " has a key " + key;
	}
}