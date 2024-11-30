package com.sree.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FlatMapCustomObject {

	public static void main(String[] args) {

		List<Employee> employeesList = EmployeeDao.getAll();

		List<List<Employee>> nestedEmployeesList = EmployeeDao.getAllNested();

		// maximum salary
		int maxSalary = employeesList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))).get().getSalary();
		System.out.println("maxSalary  " + maxSalary);

		// minimum salary
		int minSalary = employeesList.stream()
				.collect(Collectors.minBy(Comparator.comparingDouble(Employee::getSalary))).get().getSalary();

		System.out.println("minSalary  " + minSalary);

		// flatmap for phone numbers

		employeesList.stream().flatMap(e -> e.getPhoneNumbers().stream()).collect(Collectors.toList())
				.forEach(System.out::println);

		System.out.println("******************Highest Paid employee from each department**************************");

		Map<String, Optional<Employee>> x = employeesList.stream().collect(Collectors
				.groupingBy(Employee::getDepartment, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));

		System.out.println(x);
	}

}
