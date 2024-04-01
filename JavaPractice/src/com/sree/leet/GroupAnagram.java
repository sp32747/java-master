package com.sree.leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
	public static void main(String[] args) {

		String[] strs = { "ate", "tea", "ten", "net", "bat" };
		List<List<String>> anagramLst = groupAnagrams(strs);

		/*
		 * for(List<String> analst:anagramLst)
		 * 
		 * System.out.println(analst);
		 */

		System.out.println(anagramLst);
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
		if (strs.length == 0)
			return new ArrayList();
		Map<String, List> ans = new HashMap<String, List>();
		for (String s : strs) {
			char[] ca = s.toCharArray();
			Arrays.sort(ca);
			String key = String.valueOf(ca);
			System.out.println(key);
			if (!ans.containsKey(key))
				ans.put(key, new ArrayList());
			ans.get(key).add(s);
		}
		return new ArrayList(ans.values());
	}
	/*
	 * private static List<List<String>> groupAnagrams(String[] strs) {
	 * 
	 * if (strs.length == 0) return new ArrayList();
	 * 
	 * Map<String, List> ans = new HashMap<>();
	 * 
	 * for (String word : strs) { char[] ca = word.toCharArray(); Arrays.sort(ca);
	 * 
	 * String key = String.valueOf(ca);
	 * 
	 * if(!ans.containsKey(key)) { ans.put(key, new ArrayList<>());
	 * 
	 * ans.get(key).add(word); }
	 * 
	 * }
	 * 
	 * return new ArrayList(ans.values()); }
	 */

}
