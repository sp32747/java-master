package com.sree.leet2;

public class ReverseNumberWithIntegerRange {

	public static void main(String[] args) {
		int x = 123456;
		System.out.println(x % 10); //last digit
		System.out.println(x / 10); //other numbers then last digit

		
		int revNum = reverseInt(x);

	}

	private static int reverseInt(int x) {
		int reverse = 0;

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		if (x == min || x == max)
			return 0;
		while(x!=0) {
			int last ;
		}
		
		
		
		return max;
	}

}
