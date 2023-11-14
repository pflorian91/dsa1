package com.webgenerals.dsa.algorithms.sorts;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BubbleSort {

	public static void bubbleSort(int[] array) {
		for (int i = array.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] myArray = {4, 2, 6, 5, 1, 3};

		bubbleSort(myArray);

		log.debug("Resulting array {}", myArray); // [1, 2, 3, 4, 5, 6]
	}

}