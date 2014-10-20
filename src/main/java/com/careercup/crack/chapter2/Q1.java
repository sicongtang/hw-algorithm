package com.careercup.crack.chapter2;

import java.util.HashMap;

/**
 * 
 * Write code to remove duplicates from an unsorted linked list FOLLOW UP How
 * would you solve this problem if a temporary buffer is not allowed?
 * 
 * @author BobbyTang
 *
 */
public class Q1 {

	/**
	 * use temporary buffer
	 * 
	 * @param n
	 */
	public static void deleteDups(Node n) {

		HashMap map = new HashMap();

		Node node = n;
		while (n != null) {
			if (!map.containsKey(n.data)) {
				map.put(n.data, true);
			} else {
				n.previous.next = n.next;
				n.next.previous = n.previous;
			}
			n = n.next;
		}
		
	}
	
	/**
	 * not use buffer
	 * @param n
	 */
	public static void deleteDups2(Node n) {
		
	}
}
