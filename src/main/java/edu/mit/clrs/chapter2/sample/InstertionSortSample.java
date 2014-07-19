package edu.mit.clrs.chapter2.sample;

import java.util.Arrays;

/**
 * This class is directly translated from CLRS pseudocode.
 * INSERTION-SORT(A)
 * @author BobbyTang
 *
 */
public class InstertionSortSample {
	public void sort(int[] array) {

		for (int j = 1; j < array.length; j++) {
			int key = array[j];
			int i = j - 1;
			while (i >= 0 && array[i] > key) {
				array[i + 1] = array[i];
				i = i - 1;
			}
			array[i + 1] = key;
		}

	}

	public static void main(String[] args) {
		int[] array = { 4, 6, 33, 32, 78, 33, 43, 3, 1 };
		System.out.println(Arrays.toString(array).toString());
		InstertionSortSample instance = new InstertionSortSample();
		instance.sort(array);
		System.out.println(Arrays.toString(array).toString());
	}
}
