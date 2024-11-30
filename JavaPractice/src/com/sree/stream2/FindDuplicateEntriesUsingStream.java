package com.sree.stream2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateEntriesUsingStream {

	public static void main(String[] args) {
		/*
		 * Set<Integer> set = new HashSet(); Arrays.asList(12, 13, 12, 34, 67, 12,
		 * 78).stream().filter(n -> !(set.add(n))).forEach(System.out::println);
		 */
		
		 Arrays.asList(12, 13, 12, 34, 67, 12, 78).stream()
		 .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		 .entrySet().stream().filter(map->map.getValue()>1).map(Map.Entry::getKey)
		 .collect(Collectors.toList()).forEach(System.out::println);
		 
		//find Unique
		 
		 Arrays.asList(12, 13, 12, 34, 67, 12, 78).stream()
		 .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		 .entrySet().stream()
		 .filter(x->x.getValue()==1).map(Map.Entry::getKey).collect(Collectors.toList()).forEach(System.out::println);
		 
		
		
		
		

	}

}
