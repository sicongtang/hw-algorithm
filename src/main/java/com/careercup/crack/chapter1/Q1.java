package com.careercup.crack.chapter1;

/**
 * 
 * Implement an algorithm to determine if a string has all unique characters
 * What if you can not use additional data structures?
 * 
 * @author BobbyTang
 *
 */
public class Q1 {
	
	public static boolean isUniqueChars2(String str) {
		char[] charSet = str.toCharArray();
		boolean[] bol = new boolean[58];
		for (char a : charSet) {
			int tmp = (int) a;
			tmp = tmp - 65;
			if (bol[tmp]) {
				return false;
			}
			bol[tmp] = true;
		}
		return true;
	}
	
	public static void main(String[] args) {
		boolean bol = Q1.isUniqueChars2("abeopu");
		System.out.println(bol);
	}
}
