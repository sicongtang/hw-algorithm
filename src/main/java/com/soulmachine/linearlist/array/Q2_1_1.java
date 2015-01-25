package com.soulmachine.linearlist.array;

/**
 * 2.1.1 Remove Duplicates from Sorted Array
 * 
 * Given a sorted array, remove the duplicates in place such that each element
 * appear only once and return the new length.
 * 
 * Do not allocate extra space for another array, you must do this in place with
 * constant memory.
 * 
 * For example, Given input array A = [1,1,2],Your function should return length
 * = 2, and A is now [1,2].
 * 
 * @author BobbyTang
 *
 */
public class Q2_1_1 {

	// LeetCode, Remove Duplicates from Sorted Array
	// 时间复杂度 O(n),空间复杂度 O(1)
	public int removeDuplicates(int[] array) {
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (i - 1 > 0 && array[i - 1] != array[i]) {
				array[++index] = array[i];
			}
		}

		return index + 1;
	}

	
	public static void main(String[] args) {
		Q2_1_1 q = new Q2_1_1();
		int[] array = { 1, 1, 2, 2, 2, 3, 3, 5, 6, 6, 6 };
		int length = q.removeDuplicates(array);
		for (int i = 0; i < length; i++) {
			System.out.print(array[i]);
		}
	}
}
