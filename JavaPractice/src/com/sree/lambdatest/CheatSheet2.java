package com.sree.lambdatest;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CheatSheet2 {

	public static void main(String[] args) {
		List<Employee2> employees = EmployeeDataBase.getAllEmployees();

	     employees.stream().sorted(Comparator.comparing(e->e.getSalary())).collect(Collectors.toList()).forEach(System.out::println);
		
	     	Map<String, List<String>> x = employees.stream().collect(Collectors.groupingBy(Employee2::getGender,Collectors.mapping(Employee2::getName, Collectors.toList())));
		
		System.out.println(x);
		
		
		//count the male female
		
		Map<String, Long> grpCountMap = employees.stream().collect(Collectors.groupingBy(Employee2::getGender,Collectors.counting()));
		System.out.println(grpCountMap);
		
		//employees.stream().map(emp->emp.getName().toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);
		
	
		employees.stream().sorted(Comparator.comparing(Employee2::getSalary).reversed()).collect(Collectors.toList()).forEach(System.out::println);
		
		//only top 3 employees
		System.out.println("//only top 3 employees");
		employees.stream().sorted(Comparator.comparing(Employee2::getSalary).reversed()).limit(3).collect(Collectors.toList()).forEach(System.out::println);
		
		
		Map<String, List<String>> top3SalMap = employees.stream().sorted(Comparator.comparing(Employee2::getSalary).reversed())
		.limit(3).collect(Collectors.toList()).stream()
		.collect(Collectors.groupingBy(Employee2::getGender,Collectors.mapping(Employee2::getName, Collectors.toList())));
		
		System.out.println("*****************************top3 salary map \n "+top3SalMap );
	}

}
