package com.careercup.crack.chapter2;

/**
 * 
 * Implement an algorithm to find the nth to last element of a singly linked
 * list
 * 
 * @author BobbyTang
 *
 */
public class Q2 {

	public static Node nthToLast(Node head, int n) {
		int sum = 0;
		Node node = head;
		while (node.next != null) {
			node = node.next;
			sum++;
		}

		int j = sum - n;
		Node node2 = null;
		if (j >= 0) {
			node2 = head;
			for (int i = 0; i < j; i++) {
				node2 = node2.next;
			}
		}
		return node2;
		
	}
}
