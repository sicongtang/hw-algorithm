package edu.mit.clrs.chapter7.sample;

import java.util.Arrays;

/**
 * Self-implementation version of quick sort
 * Take the first element as pivot value.
 * @author BobbyTang
 * 
 */
public class QuickSortA {
	public void sort(int[] array, int p, int r) {
		if (p < r) {
			int q = partition(array, p, r);
			sort(array, p, q - 1);
			sort(array, q + 1, r);
		}
	}

	private int partition(int[] array, int p, int r) {
		int i = p;
		int key = array[p];
		for (int j = p + 1; j < r + 1; j++) {
			if (array[j] < key) {
				i++;
				swap(array, i, j);
			}
		}

		swap(array, p, i);

		return i;
	}

	private void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void main(String[] args) {
		int[] array = { 4, 6, 33, 32, 78, 33, 43, 3, 1 };
		System.out.println(Arrays.toString(array).toString());
		QuickSortA instance = new QuickSortA();
		instance.sort(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array).toString());
	}
}
