package com.webgenerals.dsa.stack;

import java.util.ArrayList;

public class StackArray<T> {

	private ArrayList<T> stackList = new ArrayList<>();

	public ArrayList<T> getStackList() {
		return stackList;
	}

	public void printStack() {
		for (int i = stackList.size() - 1; i >= 0; i--) {
			System.out.println(stackList.get(i));
		}
	}

	public boolean isEmpty() {
		return stackList.size() == 0;
	}

	public T peek() {
		if (isEmpty()) {
			return null;
		} else {
			return stackList.get(stackList.size() - 1);
		}
	}

	public int size() {
		return stackList.size();
	}

	public void push(T value) {
		stackList.add(value);
	}

	public T pop() {
		if (isEmpty()) return null;
		return stackList.remove(stackList.size() - 1);
	}

	public static String reverseString(String string) {
		StackArray<Character> stack = new StackArray<>();
		String reversedString = "";

		for (char c : string.toCharArray()) {
			stack.push(c);
		}

		while (!stack.isEmpty()) {
			reversedString += stack.pop();
		}

		return reversedString;
	}

	public static void sortStack(StackArray<Integer> stack) {
		StackArray<Integer> additionalStack = new StackArray<>();

		while (!stack.isEmpty()) {
			int temp = stack.pop();

			while (!additionalStack.isEmpty() && additionalStack.peek() > temp) {
				stack.push(additionalStack.pop());
			}

			additionalStack.push(temp);
		}

		while (!additionalStack.isEmpty()) {
			stack.push(additionalStack.pop());
		}
	}

}
