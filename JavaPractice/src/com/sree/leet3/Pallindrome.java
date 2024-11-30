package com.sree.leet3;

public class Pallindrome {

	public static void main(String[] args) {
		int x = 12321;

		boolean ans = isPalindrome(x);

		System.out.println(ans);

	}

	static boolean isPalindrome(int x) {

		if (x < 0 || x % 10 == 0 || x == 0) {
			return false;
		}

		int reverse = 0;

		System.out.println(x / 10);

		System.out.println(x % 10);

		while (x > reverse) {

			int lastdigit = x % 10;

			reverse = reverse * 10 + lastdigit;

			x = x / 10;

		}
		return (x == reverse || x == reverse / 10);
	}

}
