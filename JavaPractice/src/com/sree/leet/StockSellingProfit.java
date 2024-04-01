package com.sree.leet;

public class StockSellingProfit {

	public static void main(String[] args) {
		int[] sellingArr = { 7, 1, 5, 3, 6, 4 };

		int profit = calProfit(sellingArr);
		System.out.println(profit);
	}

	private static int calProfit(int[] sellingArr) {
		int profit = 0;
		int left=0;
		if (sellingArr.length == 0) {
			return 0;
		}

		for (int right = 1; right < sellingArr.length; right++) {
			if(sellingArr[right]>sellingArr[left]) {
				profit=Math.max(profit, sellingArr[right]-sellingArr[left]);
			}
			
			else
				left=right;
		}

		return profit;
	}

}
