package com.sree.stream2;

import java.util.Arrays;

public class PrintNumberStratingWith1 {

	public static void main(String[] args) {
		Arrays.asList(1, 13, 18, 67, 188).stream().map(s -> s + "").filter(x -> x.startsWith("1"))
				.forEach(System.out::println);
		
		Arrays.asList(1, 13, 18, 67, 188).stream().map(s->s+"").filter(s->s.startsWith("6")).forEach(System.out::println);
		
		
	}

}
