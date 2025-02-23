package com.sree.stream2;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountVowels {

	public static void main(String[] args) {

		String input = "hello hello";

//		IntStream x = input.chars();
//		prints the asci value of each char in the int stream
		// input.chars().map(x->x).forEach(System.out::println);
//		System.out.println(x.count());

		long countVowel = input.chars().filter((x) -> {
			return (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u');

		}).count();

		System.out.println(countVowel);

		// count the number of characters

		Map<String, Long> countMap = input.chars().mapToObj(x -> (char) x)
				.collect(Collectors.groupingBy(Object::toString, Collectors.counting()));

		System.out.println(countMap);

	
		//count the number of characters
		
		  Map<Object, Long> xmap =
		  Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		  
		  System.out.println(xmap);
		  
		  
		  
		
		 
	}

}
