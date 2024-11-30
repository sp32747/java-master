package com.sree.leet3;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountOne {

	public static void main(String[] args) {
	int x = Arrays.asList(1, 1, 2, 6, 6, 8, 8).stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(s -> s.getValue() == 1).map(s->s.getKey()).findFirst().get();
	System.out.println(x);
	}

}
