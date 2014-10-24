package com.careercup.crack.chapter4;

/**
 * Implement a function to check if a tree is balanced For the purposes of this
 * question, a balanced tree is defined to be a tree such that no two leaf nodes
 * differ in distance from the root by more than one
 * 
 * @author BobbyTang
 *
 */
public class Q1 {

	public static int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}

		return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
	}

	public static int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}

		return 1 + Math.min(minDepth(root.left), minDepth(root.right));
	}

	/**
	 * 
	 * The idea is very simple: the difference of min depth and max depth should
	 * not exceed 1, since the difference of the min and the max depth is the
	 * maximum distance difference pos- sible in the tree
	 * 
	 * @param root
	 * @return
	 */
	public static boolean isBalanced(TreeNode root) {
		return (maxDepth(root) - minDepth(root) <= 1);
	}

}
