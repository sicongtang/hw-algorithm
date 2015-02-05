package com.cleancode.tree;

public class SortedArrayToBST {
	public TreeNode sortedArrayToBST(int[] num) {
		return sortedArrayToBST(num, 0, num.length - 1);
	}

	private TreeNode sortedArrayToBST(int[] num, int start, int end) {
		if (start > end)
			return null;
		int mid = (start + end) / 2;

		TreeNode node = new TreeNode(num[mid]);
		node.left = sortedArrayToBST(num, start, mid - 1);
		node.left = sortedArrayToBST(num, mid + 1, end);

		return node;
	}
}
