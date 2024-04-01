package com.sree.leet;

import java.util.Arrays;

public class MoveZeros {
	public static void main(String[] args) {
		int[] arr = { 1, 0, 5, 9, 0, 7, 4 };
		int left = 0;

		for (int right = 0; right < arr.length; right++) {
			if (arr[right] != 0) {
				arr[left] = arr[right];
				left++;
			}

			
		}

		for(int i=left;i<arr.length;i++) {
			arr[i]=0;
		}
		System.out.println(Arrays.toString(arr));
	}
}
