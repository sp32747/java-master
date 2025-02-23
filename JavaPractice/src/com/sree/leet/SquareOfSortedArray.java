package com.sree.leet;

import java.util.Arrays;

public class SquareOfSortedArray {

	public static void main(String[] args) {
		int[] arrSorted = { -4, -1, 0, 5, 10 };

		squareSortedArray(arrSorted);

	}

	private static int[] squareSortedArray(int[] arrSorted) {
		int[] resSquared = new int[arrSorted.length];
		int left = 0;
		int right = arrSorted.length - 1;
		int index = resSquared.length - 1;

		while (left <= right) {
			int tmp = Math.max((arrSorted[left] * arrSorted[left]), (arrSorted[right] * arrSorted[right]));

			resSquared[index--] = tmp;

			if (Math.abs(arrSorted[left]) < Math.abs(arrSorted[right])) {
				right--;
			}

			else {
				left++;
			}

		}
		System.out.println(Arrays.toString(resSquared));
		return resSquared;

	}
}