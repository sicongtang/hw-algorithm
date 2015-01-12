package com.careercup.crack.chapter8;

/**
 * Write a method to generate the nth Fibonacci number.
 * 
 * @author BobbyTang
 *
 */
public class Q1 {
	/**
	 * F0	F1	F2	F3	F4	F5	F6	F7	F8	F9	F10	F11	F12	F13	F14	F15	F16	F17		F18		F19		F20
	 * 0	1	1	2	3	5	8	13	21	34	55	89	144	233	377	610	987	1597	2584	4181	6765
	 * 
	 * @param n
	 * @return
	 */
	public int printFibonacci(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1 || n == 2) {
			return 1;
		} else if (n > 2) {
			return printFibonacci(n - 1) + printFibonacci(n - 2);
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		Q1 q = new Q1();
		int res = q.printFibonacci(9);
		System.out.println(res);
	}
}
