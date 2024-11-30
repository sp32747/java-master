package com.sree.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicates {

	public static void main(String[] args) {
		
		List<Integer> numList=Arrays.asList(2,2,3,5,6,7,8,8);
		
		List<String> stringList=Arrays.asList("sree","sree","pan","srik");
		
		//System.out.println("*****find all the duplicate elements in the number list****");
		//finding duplicate numbers
		numList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().filter(x->x.getValue()>1).map(x->x.getKey())
		.collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("*****find all the duplicate elements in the String****");
		
		//finding duplicate strings
		stringList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet()
		.stream().filter(x->x.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList()).forEach(System.out::println);
		
		
	//	numList.stream().filter(n->n%2==0).collect(Collectors.toList()).forEach(System.out::println);
		
		
	}

}
