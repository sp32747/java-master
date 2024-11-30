package com.sree.leet3;

public class AnagramTest {

	public static void main(String[] args) {

		boolean res = isAnagram("anagram", "margana");

		int[] table = new int[26];
		for (int i = 0; i < "anagram".length(); i++) {
			table["anagram".charAt(i) - 'a']++;
			
			
		}

		System.out.println(res);

	}

	public static boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		int[] table = new int[26];
		for (int i = 0; i < s.length(); i++) {
			table[s.charAt(i) - 'a']++;
		}
		for (int i = 0; i < t.length(); i++) {
			table[t.charAt(i) - 'a']--;
			if (table[t.charAt(i) - 'a'] < 0) {
				return false;
			}
		}
		return true;
	}
}
