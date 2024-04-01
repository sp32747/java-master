package com.sree.practice;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {
	public static void main(String[] args) {
		
		List<String> stlist=Arrays.asList("Srikant","Sree","Nilu");
		
		Predicate<String> p= st->st.startsWith("S");
		
		for(String st:stlist) {
			if(p.test(st)) {
				System.out.println(st);
			}
		}
		
	}

}
