package com.sree.practice;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class PerfectSum {
	public static void main(String[] args) {
		int[] num1 = { 2, 3, 5, 6, 8, 10 };

		int pSum=10;
		
		perfectSum(num1,pSum);
		
	}

	private static void perfectSum(int[] num1, int pSum) {
		
		
		
			List<Integer> aList = new ArrayList<>();
			for (int i =0;i<num1.length;i++) {
				while (num1[i]<pSum) {
				if(checkPresence(pSum-num1[i],num1)) {
					
					aList.add(num1[i]);
					aList.add(pSum-num1[i]);
					
					
				}
					
					
			}
		}
		System.out.println(aList);
	}
	
	private static boolean checkPresence(int i ,int[] arr) {
		boolean test=false;
		for(int element : arr) {
			if(element==i)
			{
				test=true;
				break;
			}
			
		}
		
		return test;
	}
}
