package com.careercup.crack.chapter4;

/**
 * Given a sorted (increasing order) array, write an algorithm to create a
 * binary tree with minimal height.
 * 
 * @author BobbyTang
 *
 */
public class Q3 {

	public static TreeNode addToTree(int arr[], int start, int end) {
		if (end < start) {
			return null;
		}
		int mid = (start + end) / 2;
		TreeNode node = new TreeNode(arr[mid]);
		node.left = addToTree(arr, start, mid - 1);
		node.right = addToTree(arr, mid + 1, end);
		return node;
	}

	public static TreeNode createMinimalBST(int array[]) {
		return addToTree(array, 0, array.length - 1);
	}
}
