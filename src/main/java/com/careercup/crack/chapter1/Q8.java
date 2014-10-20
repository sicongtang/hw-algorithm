package com.careercup.crack.chapter1;

/**
 * 
 * Assume you have a method isSubstring which checks if one word is a substring
 * of another Given two strings, s1 and s2, write code to check if s2 is a
 * rotation of s1 using only one call to isSubstring (i e , “waterbottle” is a
 * rotation of “erbottlewat”)
 * 
 * @author BobbyTang
 *
 */
public class Q8 {

	public static boolean isSubstring(String s1, String s2) {
		return false;
	}
	
	/**
	 * personal solution
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static boolean isRotation(String s1, String s2) {
		for (int i = 1; i <= s2.length() + 1; i++) {
			String temp = s2.substring(0, i);
			if (!s1.contains(temp)) {
				int lastIndex = i - 1;
				String sub2 = s2.substring(lastIndex);
				String prevTemp = s2.substring(0, lastIndex);
				String sub1 = s1.substring(0, s1.indexOf(prevTemp));
				if (sub1.equals(sub2)) {
					return true;
				}
				return false;
			}
		}
		return false;
	}

	/**
	 * standard answer
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static boolean isRotation2(String s1, String s2) {
		int len = s1.length();
		if(len == s2.length() && len > 0) {
			String s1s1 = s1 + s1;
			return s1s1.contains(s2);
		}
		return false;
	}

	
	public static void main(String[] args) {
		String s1 = "waterbottle";
		String s2 = "erbottlewat";
		boolean bool = Q8.isRotation(s1, s2);
		System.out.println(bool);
		
		boolean bool2 = Q8.isRotation2(s1, s2);
		System.out.println(bool2);

	}
}
