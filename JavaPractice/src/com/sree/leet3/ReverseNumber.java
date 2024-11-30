package com.sree.leet3;

public class ReverseNumber {

	public static void main(String[] args) {

		int rev = reverse(1234444545);

		System.out.println(rev);
	}

	private static int reverse(int i) {
		int reverse = 0;
		
		int min=Integer.MIN_VALUE;
		int max=Integer.MAX_VALUE;

		while (i != 0) {
			int lastDigit = i % 10;
			if(reverse>max/10) return 0;
			if(reverse<min/10) return 0;
			reverse = reverse * 10 + lastDigit;

			i = i / 10;
		}

		return reverse;
	}

}
