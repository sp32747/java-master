package com.sree.leet;

import java.util.Arrays;

public class RotateArrayKSteps {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7};
		 int kSteps=4;
	int k=(arr.length % kSteps);
		 
		 reverse(arr,0,arr.length-1);
		 reverse(arr,0,k-1);
		 reverse(arr,k,arr.length-1);
		
		
	}

	private static void reverse(int[] arr, int start, int end) {
		while(start<end) {
			int tmp=arr[start];
			arr[start]=arr[end];
			arr[end]=tmp;
			
			start++;
			end--;
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
