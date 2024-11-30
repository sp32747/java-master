package com.sree.leet3;

public class MaxProductArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0, 2, 3, -2, 4,9,8,7,6,0 };
	//	int[] arr = {-2,0,-1 };
		
		//int[] arr = {2, 3, -2, 4 };
		int product = 1;

		int ans = 0;

		if (arr.length == 1) {
			ans = arr[0];
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				product = product * arr[i];
				ans = Math.max(ans, product);
			}

			else {
				product = 1;
			}

		}
	
		product = 1;
		

		for (int i = arr.length-1; i>=0; i--) {
			if (arr[i] != 0) {
				product = product * arr[i];
				ans = Math.max(ans, product);
			}

			else {
				product = 1;
			}

		}
		
		
		
		System.out.println("answer  "+ans);
		
	}

}
