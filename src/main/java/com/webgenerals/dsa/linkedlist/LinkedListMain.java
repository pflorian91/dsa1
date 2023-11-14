package com.webgenerals.dsa.linkedlist;

public class LinkedListMain {

	public static void main(String[] args) {
		LinkedList myLinkedList = new LinkedList(1);
		myLinkedList.append(2);
		myLinkedList.append(3);
		myLinkedList.append(4);

		System.out.println("LL before reverse():");
		myLinkedList.printList();

		myLinkedList.reverse();

		System.out.println("\nLL after reverse():");
		myLinkedList.printList();

		LinkedList.Node middleNode = myLinkedList.findMiddleNode();
		System.out.println("Middle node " + middleNode);

		LinkedList.Node kthFromEnd = myLinkedList.findKthFromEnd(3);
		System.out.println("Kth node " + kthFromEnd);

		boolean hasLoop = myLinkedList.hasLoop();
		System.out.println("Has loop " + hasLoop);

		LinkedList ll = new LinkedList(3);
		ll.append(5);
		ll.append(8);
		ll.append(10);
		ll.append(2);
		ll.append(1);

		System.out.println("LL before partitionList:");
		ll.printList(); // Output: 3 5 8 10 2 1

		ll.partitionList(5);

		System.out.println("LL after partitionList:");
		ll.printList(); // Output: 3 2 1 5 8 10


		LinkedList ll2 = new LinkedList(1);
		ll2.append(1);
		ll2.append(2);
		ll2.append(2);
		ll2.append(3);
		ll2.append(3);
		ll2.append(3);
		ll2.append(4);

		System.out.println("Removing duplicates without set");
		System.out.println("Before");
		ll2.printList();
		ll2.removeDuplicatesWithoutSet();
		System.out.println("After");
		ll2.printList();

		LinkedList ll3 = new LinkedList(1);
		ll3.append(1);
		ll3.append(2);
		ll3.append(2);
		ll3.append(3);
		ll3.append(3);
		ll3.append(3);
		ll3.append(4);

		System.out.println("Removing duplicates with set");
		System.out.println("Before");
		ll3.printList();
		ll3.removeDuplicatesWithSet();
		System.out.println("After");
		ll3.printList();


		LinkedList ll4 = new LinkedList(1);
		ll4.append(2);
		ll4.append(3);
		ll4.append(4);
		ll4.append(5);

		System.out.println("Original linked list: ");
		ll4.printList();

		// Reverse a sublist within the linked list
		ll4.reverseBetween(1, 3);
		System.out.println("\nReversed sublist (1, 3): ");
		ll4.printList();
	}
}
