package com.sree.leet3;

public class SlidingWindow {

	public static void main(String[] args) {

		
		int[] arr= {10,2,7,8,11,13};
		int sum=0;
		int n= arr.length;
		int windowSize=3;
		
		for(int i=0;i<windowSize;i++) {
			sum=sum+arr[i];
		}
		
		System.out.println(sum);
		
		for(int i=1;i<=n-windowSize;i++) {
			sum=sum-arr[i-1]+arr[i+windowSize-1];
			System.out.println(sum);
		}
		
		
	}

}
