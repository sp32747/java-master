package com.sree.leet;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 7, 8, 10, 11, 17 };

		int num = 17;
		int left = 0;

		int right = arr.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] == num) {
				System.out.println("found at " + mid);
				
			}

			if (num > arr[mid]) {
				left = mid + 1;
			}

			else {
				right = mid - 1;
			}

		}
		

	}

}
