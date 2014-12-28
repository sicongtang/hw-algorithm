package com.careercup.crack.chapter4;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Given a binary search tree, design an algorithm which creates a linked list
 * of all the nodes at each depth (i.e., if you have a tree with depth D, you’ll
 * have D linked lists).
 * 
 * @author BobbyTang
 *
 */
public class Q4 {

	ArrayList<LinkedList<TreeNode>> findLevelLinkList(TreeNode root) {
		int level = 0;
		ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();
		LinkedList<TreeNode> list = new LinkedList<TreeNode>();
		list.add(root);

		result.add(level, list);

		while (true) {
			list = new LinkedList<TreeNode>();

			for (int i = 0; i < result.get(level).size(); i++) {
				TreeNode n = (TreeNode) result.get(level).get(i);
				if (n != null) {
					if (n.left != null)
						list.add(n.left);
					if (n.right != null)
						list.add(n.right);
				}
			}

			if (list.size() > 0) {
				result.add(level + 1, list);
			} else {
				break;
			}

			level++;
		}

		return result;
	}

}
