package com.careercup.crack.chapter2;

/**
 * Implement an algorithm to delete a node in the middle of a single linked
 * list, given only access to that node. EXAMPLE Input: the node ‘c’ from the
 * linked list a->b->c->d->e Result: nothing is returned, but the new linked
 * list looks like a->b->d->e
 * 
 * @author BobbyTang
 *
 */
public class Q3 {

	/**
	 * This problem can not be solved if the node to be deleted is the last node
	 * in the linked list.
	 * 
	 * @param n
	 * @return
	 */
	public static boolean deleteNode(Node n) {
		// if the node to be deleted is the last node
		if (n == null || n.next == null) {
			return false;
		}

		Node next = n.next;
		n.data = next.data;
		n.next = next.next;

		return true;
	}
}
