package com.cleancode.arraystring;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, find two numbers such that they add up to a
 * specific target number.
 * 
 * The function twoSum should return indices of the two numbers such that they
 * add up to the target, where index1 must be less than index2. Please note that
 * your returned answers (both index1 and index2) are not zero-based.
 * 
 * You may assume that each input would have exactly one solution.
 * 
 * @author BobbyTang
 *
 */
public class TwoSum {

	/**
	 * O(n2) runtime, O(1) space – Brute force
	 */
	public int[] twoSum(int[] numbers, int target) {
		int[] result = new int[2];
		for (int i = 0; i < numbers.length; i++) {
			int startNum = numbers[i];

			for (int j = (i + 1); j < numbers.length; j++) {
				int endNum = numbers[j];
				// core
				if ((startNum + endNum) == target) {
					result[0] = startNum;
					result[1] = endNum;
					return result;
				}
			}

		}

		return result;
	}

	/**
	 * O(n) runtime, O(n) space – Hash table:
	 */
	public int[] twoSum2(int[] numbers, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < numbers.length; i++) {
			int startNum = numbers[i];

			// core
			if (map.containsKey(target - startNum)) {
				result[0] = (target - startNum);
				result[1] = startNum;
			}

			map.put(startNum, i);
		}

		return result;
	}

	public static void main(String[] args) {
		TwoSum twoSum = new TwoSum();
		int[] result = twoSum.twoSum2(new int[] { 7, 12, 15, 4, 30 }, 45);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + "-");
		}
	}
}
