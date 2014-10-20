package com.careercup.crack.chapter1;

/**
 * Write a method to decide if two strings are anagrams or not
 * 
 * @author BobbyTang
 *
 */
public class Q4 {

	public static boolean isAnagrams(String former, String latter) {

		char[] charFormer = former.toCharArray();
		char[] charLatter = latter.toCharArray();

		if (charFormer.length != charLatter.length) {
			return false;
		}

		for (int i = 0; i < charFormer.length - 1; i++) {
			if (charFormer[i] != charLatter[charFormer.length - 1 - i]) {
				return false;
			}
		}

		return true;
	}
	
	//solution 2
	//sort, then determine whether it is equal or not
	
	public static void main(String[] args) {
		boolean bol = Q4.isAnagrams("acde", "edcba");
		System.out.println(bol);
		
	}

}
