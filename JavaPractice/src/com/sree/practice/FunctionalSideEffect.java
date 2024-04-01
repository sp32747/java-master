package com.sree.practice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunctionalSideEffect {
	static int count = 0;
	static int count2 = 0;

	public static void main(String[] args) {

		List<Integer> numList = IntStream.range(1, 1001).boxed().collect(Collectors.toList());

		numList.stream().forEach(num -> count++);

		System.out.println(count);
		// now just change the stream to parallel stream , there is side effect of
		// functional programming the lambda we have used num->count2++ is not pure
		// function bcoz its modifying a variable which is outside of the method here the main method 

		numList.parallelStream().forEach(num -> count2++);
		System.out.println("count with functional side effect " + count2);

	}
}
