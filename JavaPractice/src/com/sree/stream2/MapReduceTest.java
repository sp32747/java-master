package com.sree.stream2;

import java.util.Arrays;
import java.util.List;

public class MapReduceTest {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 3, 6, 7, 89, 67);
		
		
		
	list.stream().reduce(Integer::sum).get();
		

		int sum1 = list.stream().mapToInt(i -> i).sum();
		System.out.println(sum1);

		System.out.println("*****************************");
		// in the below example we are using get() to get the value because the method
		// reference sum gives an optional object
		int sum2 = list.stream().reduce(Integer::sum).get();

		System.out.println(sum2);
		System.out.println("*****************************");

		int sum3 = list.stream().reduce(0, (a, b) -> a + b);
		System.out.println(sum3);

		System.out.println("*************find the maximum number in the list****************");

		int highestNum=list.stream().reduce(0, (a, b) -> a > b ? a : b);

		System.out.println(highestNum);
		
		System.out.println("*************find the maximum number in the list using method reference****************");
		
		int highestNum2=list.stream().reduce(Integer::max).get();
		System.out.println(highestNum2);
		
		
		
		
		
	}

}
