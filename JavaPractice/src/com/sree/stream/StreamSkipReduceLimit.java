package com.sree.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamSkipReduceLimit {

	public static void main(String[] args) {

		List<Integer> numList = Arrays.asList(2, 2, 3, 5, 66, 67, 8, 8);

		List<String> stringListWithDuplicates = Arrays.asList("sree", "sree", "pan", "srik");

		List<String> stringList = Arrays.asList("srikanta", "panigrahi", "Avyaan", "Nilu", "Ipsita", "patro",
				"Boombean", "Kiyan", "Daksh");

		System.out.println("*****find second highest element in the array  ****");

		Integer secondHighest = numList.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

		System.out.println("*************secondHighest**********   " + secondHighest);
		
		
		System.out.println("*****find longest  element in the string array  ****");
		String longestElemnt=stringListWithDuplicates.stream().reduce((a,b)->a.length()>b.length()?a:b).get();
		
		
		System.out.println("longestElemnt "+longestElemnt);
		
		
		
		System.out.println("*****find longest  element in the number array which is divisible by 2  ****");
		System.out.println(numList.stream().filter(a->a%2==0).reduce((a, b)->a>b?a:b).get());
		
		System.out.println("*****find   element in the number array which is starts with 6 ****");
		
		numList.stream().map(c->c+"").filter(x->x.startsWith("6")).collect(Collectors.toList()).forEach(System.out::println);
		

	}

}
