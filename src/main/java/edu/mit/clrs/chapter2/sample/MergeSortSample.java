package edu.mit.clrs.chapter2.sample;

import java.util.Arrays;

/**
 * This class is directly translated from CLRS pseudocode. MERGE.A; p; q; r/
 * MERGE-SORT.A; p; r/
 * 
 * @author BobbyTang
 * 
 */
public class MergeSortSample {

	public void sort(int[] array, int p, int r) {
		if (p < r) {
			int q = (p + r) / 2;

			sort(array, p, q);
			sort(array, q + 1, r);
			merge(array, p, q, r);
		}
	}

	public void merge(int[] array, int p, int q, int r) {
		int n1 = q - p + 1;
		int n2 = r - q;

		int[] leftA = new int[n1];
		int[] rightA = new int[n2];

		for (int i = 0; i < n1; i++) {
			leftA[i] = array[p + i];
		}

		for (int j = 0; j < n2; j++) {
			rightA[j] = array[q + j + 1];
		}

		int i = 0;
		int j = 0;

		for (int k = p; k < r + 1; k++) {
			//copy array if one of side branch is drained
			if (j > n2 - 1) {
				array[k] = leftA[i];
				i++;
			} else if (i > n1 - 1) {
				array[k] = rightA[j];
				j++;
			} else if (leftA[i] <= rightA[j]) {
				array[k] = leftA[i];
				i++;
			} else if (leftA[i] > rightA[j]) {
				array[k] = rightA[j];
				j++;
			}
		}

	}

	public static void main(String[] args) {
		int[] array = { 4, 6, 33, 32, 78, 33, 43, 3, 1 };
		System.out.println(Arrays.toString(array).toString());
		MergeSortSample instance = new MergeSortSample();
		instance.sort(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array).toString());
	}
}
