package com.sree.stream;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindUniqueElements {

	public static void main(String[] args) {

		List<Integer> numList = Arrays.asList(2, 2, 3, 5, 6, 7, 8, 8);

		List<String> stringList = Arrays.asList("sree", "sree", "pan", "srik");

		System.out.println("*****find all the unique elements in the number list****");

		numList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(x -> x.getValue() == 1).map(x -> x.getKey()).collect(Collectors.toList())
				.forEach(System.out::println);

		System.out.println("*****find all the unique elements in the string list****");
		stringList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
				.stream().filter(x -> x.getValue() == 1).map(x -> x.getKey()).collect(Collectors.toList())
				.forEach(System.out::println);

		System.err.println("*****find FIRST non repeative element in the String list  ****");
	
		String firstUniqeVal= stringList.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet().stream()
				.filter(x->x.getValue()==1).findFirst().get().getKey();
		
		System.out.println(firstUniqeVal);

	}

}
