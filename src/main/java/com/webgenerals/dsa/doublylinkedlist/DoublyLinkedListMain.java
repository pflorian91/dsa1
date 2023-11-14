package com.webgenerals.dsa.doublylinkedlist;

public class DoublyLinkedListMain {

	public static void main(String[] args) {

		DoublyLinkedList myDLL = new DoublyLinkedList(7);
		myDLL.printHead();
		myDLL.printTail();
		myDLL.printLength();
		System.out.println("\nDoubly Linked List:");
		myDLL.printList();

		// append

		System.out.println("\nAppend:");

		DoublyLinkedList myDLL2 = new DoublyLinkedList(1);
		myDLL2.append(2);
		myDLL2.printHead();
		myDLL2.printTail();
		myDLL2.printLength();
		System.out.println("\nDoubly Linked List:");
		myDLL2.printList();

		// remove

		System.out.println("\n Remove:");

		DoublyLinkedList myDLL3 = new DoublyLinkedList(1);
		myDLL3.append(2);
		myDLL3.append(3);
		myDLL3.append(4);
		myDLL3.append(5);

		System.out.println("DLL before remove():");
		myDLL3.printList();

		System.out.println("\nRemoved node:");
		System.out.println(myDLL3.remove(2).value);
		System.out.println("DLL after remove() in middle:");
		myDLL3.printList();

		System.out.println("\nRemoved node:");
		System.out.println(myDLL3.remove(0).value);
		System.out.println("DLL after remove() of first node:");
		myDLL3.printList();

		System.out.println("\nRemoved node:");
		System.out.println(myDLL3.remove(2).value);
		System.out.println("DLL after remove() of last node:");
		myDLL3.printList();

		// swap

		System.out.println("\n Swap:");

		DoublyLinkedList myDLL4 = new DoublyLinkedList(1);
		myDLL4.append(2);
		myDLL4.append(3);
		myDLL4.append(4);
		myDLL4.append(5);

		System.out.println("DLL before swap:");
		myDLL4.printList();

		myDLL4.swapFirstLast();

		System.out.println("\nDLL after swap:");
		myDLL4.printList();


		// reverse

		System.out.println("\n Reverse:");

		DoublyLinkedList myDLL5 = new DoublyLinkedList(1);
		myDLL5.append(2);
		myDLL5.append(3);
		myDLL5.append(4);
		myDLL5.append(5);

		System.out.println("DLL before reverse:");
		myDLL5.printList();

		myDLL5.reverse();

		System.out.println("\nDLL after reverse:");
		myDLL5.printList();

		// palindrome

		System.out.println("\n palindrome:");

		DoublyLinkedList myDLL6 = new DoublyLinkedList(1);
		myDLL6.append(2);
		myDLL6.append(3);
		myDLL6.append(2);
		myDLL6.append(1);

		System.out.println("myDLL6 isPalindrome:");
		System.out.println(myDLL6.isPalindrome());

		DoublyLinkedList myDLL7 = new DoublyLinkedList(1);
		myDLL7.append(2);
		myDLL7.append(3);

		System.out.println("\nmyDLL7 isPalindrome:");
		System.out.println(myDLL7.isPalindrome());


	}

}
