package com.sree.java9;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Java9StreamUpdates {

	public static void main(String[] args) {
		
		//1)immutable collection
		List.of(2,7,8,9);
		
		
		//2)private method in functional interface 
		
		
		//3)
		Arrays.asList(10,40,30,7,18,23,null).stream().takeWhile(i->i%5==0).forEach(System.out::println);
		Arrays.asList(10,40,30,7,18,23,null).stream().dropWhile(i->i%5==0).forEach(System.out::println);
		Arrays.asList(10,40,30,7,18,23,null).stream().flatMap(x->Stream.ofNullable(x)).forEach(System.out::println);
		
		//try with resources block
		
	}

}
