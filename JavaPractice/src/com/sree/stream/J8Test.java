package com.sree.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class J8Test {

	public static void main(String[] args) {

		List<Integer> numList = Arrays.asList(2, 2, 3, 5, 6, 7, 8, 8);

		List<String> stringList = Arrays.asList("sree", "sree", "pan", "srik", "niu", "ysh", "niu", "ysh", "niu", "ysh",
				"niu", "ysh");
		
		 List<String> cities = Arrays.asList("Delhi","Mumbai","Bhubaneshwar","Kailash");
		 
		 Function<String,Character> getFirstChar=city->{
			 return city.charAt(0);
		 };
		 
		 //getting the first character of a city
		 cities.stream().map(getFirstChar).forEach(System.out::println);

		numList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(x -> x.getValue() > 1).map(x -> x.getKey()).collect(Collectors.toList())
				.forEach(System.out::println);
		
		
		
		
		
		List<Employee> employeesList = EmployeeDao.getAll();

		List<List<Employee>> nestedEmployeesList = EmployeeDao.getAllNested();

		employeesList.stream().sorted(Comparator.comparing(Employee::getAge)).forEach(System.out::println);

		Map<String, Long> map = stringList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		List<Set<Entry<String, Long>>> y = Arrays.asList(map.entrySet());
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

	//	System.out.println(x);

	}

}
