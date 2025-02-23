package com.sree.stream2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest3 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4);

		System.err.println("**************//removing duplicates in the list//********************");
		// removing duplicates in the list
		Map<Integer, Long> x = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		x.entrySet().stream().filter(m -> m.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toSet())
				.forEach(System.out::println);

		System.err.println("**************//finding duplicates in the list//********************");
		// finding duplicates in the list

		list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(m -> m.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList())
				.forEach(System.out::println);
	}

}
