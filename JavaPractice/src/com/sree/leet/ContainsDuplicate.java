package com.sree.leet;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] num1 = { 1, 2, 3, 5, 7, 4, 8, 8, 10 };
		Set<Integer> numSet = new HashSet<>();
		boolean res = false;

		for (int i = 0; i < num1.length; i++) {
			if (numSet.contains(num1[i])) {
				res = true;

			}

			else {
				numSet.add(num1[i]);
			}

		}
		System.out.println(res);
	}
}