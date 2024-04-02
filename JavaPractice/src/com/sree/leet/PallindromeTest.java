package com.sree.leet;

public class PallindromeTest {

	public static void main(String[] args) {
		boolean res = testPalndrm(121);

		System.out.println(res);
		// System.out.println(120%10);0
	}

	private static boolean testPalndrm(int num) {

		if (num < 0 || (num != 0 && num % 10 == 0)) {
			return false;
		}

		int reverse = 0;

		while (num > reverse) {
			int lastDigit = num % 10;
			reverse = reverse * 10 + lastDigit;
			num = num / 10;
		}

//we check this condition bcoz at this point of time half part of the number is equal to reverse for even numebers and for odd just deveide it by 10

		return num == reverse || num == reverse / 10;
	}

}
