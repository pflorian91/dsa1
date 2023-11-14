package com.webgenerals.dsa.stack;

public class StackMain {

	public static void main(String[] args) {

		System.out.println("\n Simple stack");

		Stack myStack = new Stack(4);
		myStack.printTop();
		myStack.printHeight();
		System.out.println("\nStack:");
		myStack.printStack();

		//

	}

}
