package edu.mit.clrs.chapter6.sample;

import java.util.Arrays;

/**
 * This class is directly translated from CLRS pseudocode.
 * 
 * HEAPSORT.A/
 * 
 * @author BobbyTang
 * 
 */
public class HeapSortSample {
	public void sort(int[] array) {
		buildMaxHeap(array);

		// array[N-1] --> array[1]
		int heapSize = array.length;
		for (int i = array.length - 1; i > 0; i--) {
			//delete max
			swap(array, 0, i);
			heapSize = heapSize - 1;
			maxHeapify(array, 0, heapSize);
		}

	}

	public void buildMaxHeap(int[] array) {
		// floor(A.length/2)
		int heapSize = array.length;
		// array begin with 0, inclusive
		for (int i = array.length / 2; i >= 0; i--) {
			maxHeapify(array, i, heapSize);
		}
	}

	public void maxHeapify(int[] array, int i, int heapSize) {
		int left = leftChild(i);
		int right = rightChild(i);
		int largest;

		//left less than length of array minus 1
		//compare current node and two child nodes
		if (left < heapSize && array[left] > array[i]) {
			largest = left;
		} else {
			largest = i;
		}

		if (right < heapSize && array[right] > array[largest]) {
			largest = right;
		}

		if (largest != i) {
			swap(array, i, largest);

			maxHeapify(array, largest, heapSize);
		}

	}

	public void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public int leftChild(int i) {
		return 2 * i + 1;
	}

	public int rightChild(int i) {
		return 2 * i + 2;
	}

	public static void main(String[] args) {
		int[] array = { 4, 6, 33, 32, 78, 33, 43, 3, 1 };
		System.out.println(Arrays.toString(array).toString());
		HeapSortSample instance = new HeapSortSample();
		instance.sort(array);
		System.out.println(Arrays.toString(array).toString());
	}
}
