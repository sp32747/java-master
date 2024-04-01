package com.sree.leet;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		int[] num1 = {1, 2, 3, 5, 7, 4, 6, 8, 10 };
		int target = 8;

		int[] res = new int[2];

		HashMap<Integer, Integer> hm = new HashMap<>();

		for (int i = 0; i < num1.length; i++) {
			int diff = target - num1[i];
			if (hm.containsKey(diff)) {
				res[0] = i;
				res[1] = hm.get(diff);

				System.out.println(Arrays.toString(res));
				//break;
			}

			else {
				hm.put(num1[i], i);
			}
		}

	}

}
