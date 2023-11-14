package com.webgenerals.dsa.algorithms.sorts;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SelectionSort {

	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			if (i != minIndex) {
				int temp = array[i];
				array[i] = array[minIndex];
				array[minIndex] = temp;
			}
		}
	}

	public static void main(String[] args) {
		int[] myArray = {4, 2, 6, 5, 1, 3};

		selectionSort(myArray);

		log.debug("Resulting array {}", myArray); // [1, 2, 3, 4, 5, 6]
	}
}
