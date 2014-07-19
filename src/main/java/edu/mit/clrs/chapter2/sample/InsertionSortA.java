package edu.mit.clrs.chapter2.sample;

import java.util.Arrays;

/**
 * Self-implementation version of insertion sort
 * @author BobbyTang
 *
 */
public class InsertionSortA {

	public void sort(int[] array) {

		for (int j = 1; j < array.length; j++) {
			int key = array[j];
			int i = j - 1;
			for (; i >= 0; i--) {
				if (array[i] > key) {
					//do not need swap here
					array[i + 1] = array[i];
				} else {
					break;
				}
			}
			array[i + 1] = key;
		}

	}

	public static void main(String[] args) {
		int[] array = { 4, 6, 33, 32, 78, 33, 43, 3, 1 };
		System.out.println(Arrays.toString(array).toString());
		InsertionSortA instance = new InsertionSortA();
		instance.sort(array);
		System.out.println(Arrays.toString(array).toString());
	}
}
