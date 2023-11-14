package com.webgenerals.dsa.stack;

public class StackArrayMain {

	public static void main(String[] args) {

		StackArray myStack = new StackArray<>();

		myStack.push(1);
		myStack.push(2);
		myStack.push(3);

		myStack.printStack();

		System.out.println("Peek " + myStack.peek());

		//

		System.out.println("\n Pop from stack");

		StackArray myStack1 = new StackArray<>();
		myStack1.push(1);
		myStack1.push(2);
		myStack1.push(3);

		System.out.println("Stack before pop():");
		myStack1.printStack();

		System.out.println("\nPopped node:");
		System.out.println(myStack1.pop());

		System.out.println("\nStack after pop():");
		myStack1.printStack();

		// reverse string

		System.out.println("\nReverse string");
		String myString = "hello";
		String reversedString = StackArray.reverseString(myString);
		System.out.println(reversedString);

		// sorting

		System.out.println("\nSorting");
		StackArray<Integer> stack = new StackArray<>();
		stack.push(3);
		stack.push(2);
		stack.push(5);
		stack.push(1);
		stack.push(4);

		System.out.println("Before sorting:");
		stack.printStack();

		StackArray.sortStack(stack);

		System.out.println("\nAfter sorting:");
		stack.printStack();

	}

}
