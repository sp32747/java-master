package com.sree.stream2;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindFirstNonRepeative {

	public static void main(String[] args) {

		String stringObj="Srikanta panigrahi";
		
		String x = Arrays.asList(stringObj.split("")).stream().map(c->c.toLowerCase())
		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet().stream()
		.filter(entry->entry.getValue()==1).map(entry->entry.getKey()).findFirst().get();
		
		System.out.println(x);
		
		
		Arrays.asList(stringObj.split("")).stream().map(c->c.toLowerCase())
		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		.entrySet().stream().filter(entry->entry.getValue()==1).map(entry->entry.getKey()).findFirst().get();
		
	}

}
