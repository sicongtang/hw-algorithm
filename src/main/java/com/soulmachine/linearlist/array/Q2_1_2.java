package com.soulmachine.linearlist.array;

/**
 * 2.1.2 Remove Duplicates from Sorted Array II
 * 
 * Follow up for ”Remove Duplicates”: What if duplicates are allowed at most
 * twice?
 * 
 * For example, Given sorted array A = [1,1,1,2,2,3], Your function should
 * return length = 5, and A is now [1,1,2,2,3]
 * 
 * @author BobbyTang
 *
 */
public class Q2_1_2 {

	public int removeDuplicates(int[] array) {

		int index = 0;
		int conIndex = 0;
		for (int i = 0; i < array.length; i++) {
			conIndex++;
			if ((i - 1) > 0 && array[i - 1] != array[i]) {
				index = index + conIndex;
				array[index] = array[i];
				conIndex = 0;
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
