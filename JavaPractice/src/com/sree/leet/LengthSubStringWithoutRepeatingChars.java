package com.sree.leet;

import java.util.HashMap;
import java.util.Map;

public class LengthSubStringWithoutRepeatingChars {

	public static void main(String[] args) {
		int ans = maxLengthSubString("abdba");
		System.out.println(ans);
	}

	public static int maxLengthSubString(String s) {

		int ans = 0;
		int left = 0;
		Map<Character, Integer> hm = new HashMap();

		for (int right = 0; right < s.length(); right++) {
			char ch = s.charAt(right);

			if (!hm.containsKey(ch)) {
				hm.put(ch, right);
			}

			else {
				left = Math.max(left, hm.get(ch) + 1);
				hm.put(ch, right);

			}

			ans = Math.max(ans, right-left + 1);
		}

		return ans;

	}
}
