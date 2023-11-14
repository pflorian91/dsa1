package com.webgenerals.dsa.binarysearchtree;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BinarySearchTreeMain {

	public static void main(String[] args) {
		BinarySearchTree myBST = new BinarySearchTree();

		myBST.insert(47);
		myBST.insert(21);
		myBST.insert(76);
		myBST.insert(18);
		myBST.insert(27);
		myBST.insert(52);
		myBST.insert(82);

		System.out.println("BST Contains 27:");
		System.out.println(myBST.contains(27));

		System.out.println("\nBST Contains 17:");
		System.out.println(myBST.contains(17));

		log.debug("Breadth First Search:");

		BinarySearchTree myBST2 = new BinarySearchTree();

		myBST2.insert(47);
		myBST2.insert(21);
		myBST2.insert(76);
		myBST2.insert(18);
		myBST2.insert(27);
		myBST2.insert(52);
		myBST2.insert(82);

		System.out.println("\nBreadth First Search:");
		System.out.println( myBST2.BFS() );

		log.debug("DFS in order");

		BinarySearchTree myBST3 = new BinarySearchTree();

		myBST3.insert(47);
		myBST3.insert(21);
		myBST3.insert(76);
		myBST3.insert(18);
		myBST3.insert(27);
		myBST3.insert(52);
		myBST3.insert(82);

		System.out.println("\nDFS InOrder:");
		System.out.println( myBST3.DFSInOrder() );
	}

}
