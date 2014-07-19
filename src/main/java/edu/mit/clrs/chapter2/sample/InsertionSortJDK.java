package edu.mit.clrs.chapter2.sample;

import java.util.Arrays;

/*
 * This class is extracted from the legacyMergeSort branch of Arrays.sort() 
 */
public class InsertionSortJDK {
	//private static final int INSERTIONSORT_THRESHOLD = 7;

	public void sort(Object[] dest, int low, int high) {
		// int length = high - low;

		// Insertion sort on smallest arrays
		// if (length < INSERTIONSORT_THRESHOLD) {
		for (int i = low; i < high; i++)
			for (int j = i; j > low && ((Comparable) dest[j - 1]).compareTo(dest[j]) > 0; j--)
				// swap
				swap(dest, j, j - 1);
		return;
		// }
	}

	/**
	 * Swaps x[a] with x[b].
	 */
	private static void swap(Object[] x, int a, int b) {
		Object t = x[a];
		x[a] = x[b];
		x[b] = t;
	}

	public static void main(String[] args) {
		Integer[] array = { 4, 6, 33, 32, 78, 33, 43, 3, 1 };
		System.out.println(Arrays.toString(array).toString());
		InsertionSortJDK instance = new InsertionSortJDK();
		instance.sort(array, 0, array.length);
		System.out.println(Arrays.toString(array).toString());
	}

}
