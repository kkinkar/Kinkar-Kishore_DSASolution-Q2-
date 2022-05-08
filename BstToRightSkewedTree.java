package com.gl.BstTransaction;

public class BstToRightSkewedTree {
	
	public Node rightRoot = null;
	
	
	public Node BSTSkewed(Node root)
	{
		
		if(root == null) {
			return rightRoot;
		}else {
			BSTSkewed(root.left);
			
			rightRoot = createRightSkewedTree(rightRoot, root);
			BSTSkewed(root.right);

		}	
		return rightRoot;
	}

	
	public Node createRightSkewedTree(Node rightRoot, Node root) {
		Node n = new Node(root.value);
		if(rightRoot == null) {
			return n;
		}else {
			rightRoot.right = createRightSkewedTree(rightRoot.right, root);
		}
		return rightRoot;

	}
	
	
	public void traverseRightSkewedTree(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.value + " ");
        traverseRightSkewedTree(root.right);       
    }

}
 	