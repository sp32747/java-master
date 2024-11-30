package com.sree.leet;

import java.util.Arrays;

public class RevStringCleanSpace {

	public static void main(String[] args) {

		String s = " i am  sree  ";  //with empty space string 

		reverseWords(s);

	}

	private static String reverseWords(String s) {
		char[] str = s.toCharArray();
		// reverse the entire string
		//reverse(str, 0, str.length - 1);

		// reverse each word
		reverseWord(str);

		// clean up empty space

		String strRev= cleanSpaces(str);
		System.out.println(strRev);
		
		return strRev;
	}

	private static String cleanSpaces(char[] str) {
		
		int left=0;
		int right=0;
		
		while(right<str.length) {
			
			while(right<str.length && str[right]==' ')right++;
			while(right<str.length && str[right]!=' ') {
				str[left]=str[right];
				left++;
				right++;
			}
			
			while(right<str.length && str[right]==' ')right++;
			if(right<str.length) {
				str[left]=' ';
				left++;
			}
		}

		return new String(str).substring(0,left);
	}

	private static void reverseWord(char[] str) {
		int left = 0;
		int right = 0;
		while (left < str.length) {
			while (left < str.length && str[left] == ' ') {
				left++;
				right = left;
			}
			while (right < str.length && str[right] != ' ') {
				right++;
				reverse(str, left, right - 1);
				left = right;

			}
		}

	}

	private static void reverse(char[] str, int left, int right) {
		while (left < right) {
			char temp = str[right];
			str[right] = str[left];
			str[left] = temp;
			left++;
			right--;
		}
		// System.out.println(Arrays.toString(str));
	}

}
