package com.sree.practice;
import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3 };
		int step = 2;
		rotate(arr, arr.length,step);
	}

	private static void rotate(int[] arr, int n ,int step) {
		/*
		 * int j = 0;
		 * 
		 * 
		 * int tmp;
		 * 
		 * while (j < step)
		 * 
		 * { tmp = arr[j]; 
		 * arr[j] = arr[k-step];
		 *  arr[k-step] = tmp;
		 *   j++; k--; step--;
		 * 
		 * 
		 * }
		 */

		if(step>n) {
			step=step%n;
			
			System.out.println(step);
			
			for(int i=0;i<n;i++) {
				
				
			}
		}
		
		
		System.out.println(Arrays.toString(arr));
	}
}
