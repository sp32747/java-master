package com.sree.practice;

import java.util.Arrays;

public class WordCountInAString {

	public static void main(String[] args) {
		String x="srikant panigrahi";
		
		Arrays.asList(x.toCharArray()).stream().filter(i->i.equals(" ") && i.length<x.length()).forEach(System.out::println);
		
	}

}
