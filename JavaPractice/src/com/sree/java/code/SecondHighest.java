package com.sree.java.code;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;
		
		int arr[]= {3,67,34,6,7};
		
		System.out.println("highest "+highest+"    secondHighest  "+secondHighest);
		
		for(int i: arr) {
			if (i > highest) {
				secondHighest = highest;
				highest = i;
			} else if (i > secondHighest) {
				secondHighest = i;
			}

		}
		System.out.println(secondHighest);

	}

}
