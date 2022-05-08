package com.gl.Driver;

import com.gl.BstTransaction.BstToRightSkewedTree;
import com.gl.BstTransaction.Node;

public class DriverClass {
	public static void main(String[] args)
	{
		
		BstToRightSkewedTree obj = new BstToRightSkewedTree();
		
		
		Node root = new Node(50);
		root.left = new Node(30);
		root.right = new Node(60);
		root.left.left = new Node(10);
		root.right.left = new Node(55);
		
		Node rightRoot = new Node(0);
		rightRoot = obj.BSTSkewed(root);
		
		obj.traverseRightSkewedTree(rightRoot);
		
	}

}
