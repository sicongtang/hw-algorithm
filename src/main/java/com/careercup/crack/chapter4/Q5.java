package com.careercup.crack.chapter4;

/**
 * Write an algorithm to find the ‘next’ node (i.e., in-order successor) of a
 * given node in a binary search tree where each node has a link to its parent.
 * 
 * @author BobbyTang
 *
 */
public class Q5 {

	/**
	 * given node in a binary search tree where each node has a link to its
	 * parent
	 * 
	 * @param e
	 * @return
	 */
	public static TreeNode inorderSucc(TreeNode e) {
		if (e != null) {
			// take care if e is the root
			if (e.parent == null || e.right != null) {
				// 1. If X has a right child, then the successor must be on the
				// right side of X (because of the order in which we visit
				// nodes). Specifically, the left-most child must be the first
				// node visited in that subtree.
				return leftMostChild(e.right);
			} else if (e.parent != null && e.parent.left == e) {
				// 2.a. If X was a left child (P.left = X), then P is the
				// successor of X
				return e.parent;
			} else if (e.parent != null && e.parent.right == e) {
				// 2.b. If X was a right child (P.right = X), then we have fully
				// visited P, so we call successor(P).
				TreeNode parent = null;
				while ((parent = e.parent) != null) {
					if (parent.left == e) {
						return parent;
					} else {
						e = e.parent;
					}
				}
			}
		}
		return null;
	}

	public static TreeNode leftMostChild(TreeNode e) {
		if (e == null) {
			return null;
		}
		while (e.left != null) {
			e = e.left;
		}
		return e;
	}
}
