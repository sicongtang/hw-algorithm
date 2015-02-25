package com.cleancode.arraystring;

import java.util.Arrays;

public class BinarySearch {

	/**
	 * This class should not be instantiated.
	 */
	private BinarySearch() {
	}

	/**
	 * Searches for the integer key in the sorted array a[].
	 * 
	 * @param key
	 *            the search key
	 * @param a
	 *            the array of integers, must be sorted in ascending order
	 * @return index of key in array a[] if present; -1 if not present
	 */
	public static int rank(int key, int[] a) {
		int lo = 0;
		int hi = a.length - 1;
		while (lo <= hi) {
			// Key is in a[lo..hi] or not present.
			int mid = lo + (hi - lo) / 2;
			if (key < a[mid])
				hi = mid - 1;
			else if (key > a[mid])
				lo = mid + 1;
			else
				return mid;
		}
		return -1;
	}

	/**
	 * Reads in a sequence of integers from the whitelist file, specified as a
	 * command-line argument. Reads in integers from standard input and prints
	 * to standard output those integers that do *not* appear in the file.
	 */
	public static void main(String[] args) {
		int key = 10;
		// read the integers from a file
		int[] whitelist = { 1, 32, 423, 3453, 45 };

		// sort the array
		Arrays.sort(whitelist);

		rank(key, whitelist);
	}
}