package com.sree.java9;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class StringJoinerExample {

	public static void main(String[] args) {

		String input="i am srikanta panigrahi";
		String[] inputArray = input.split(" ");
		
		//output of teh programme should be [i-am-srikanta-panigrahi]
		
		
		
		//using StringJoiner
		StringJoiner joiner=new StringJoiner("-","[","]");
		
		for(String token : inputArray) {
			
			joiner.add(token);
		}
		System.out.println(joiner.toString());
		
		
		//using stream api
		
		String x = Arrays.asList(inputArray).stream().collect(Collectors.joining("-"));
		
		System.out.println("using stream api "+x);
		
		
	}

}
