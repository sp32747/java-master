package com.sree.practice;
import java.util.Arrays;

public class ArrayRev {

	public static void main(String[] args) {
		int[] num1 = { 1, 2, 3, 4, 5, 6 };
		int lengthArr = num1.length;

		revArr(num1, 0, lengthArr-1);

	}

	private static void revArr(int[] num1, int start, int lengthArr) {
		int tmp;
		int counter=0;

		while (start < lengthArr)

		{

			counter++;
			tmp = num1[start];
			num1[start] = num1[lengthArr];
			num1[lengthArr] = tmp;
			start++;
			lengthArr--;

			
		}
		System.out.println(counter);
		System.out.println(Arrays.toString(num1));
	}
}
