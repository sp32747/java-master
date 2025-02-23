package com.sree.stream2;

import java.util.Comparator;
import java.util.List;

public class GroupByComparatorStream {

	public static void main(String[] args) {
		List<Employee> employeeList = EmployeeDAO.getAllEmployees();

		Comparator<Employee> grpByComp = Comparator.comparing(Employee::getName).thenComparing(Employee::getAge);

		employeeList.sort(grpByComp);
		
		employeeList.forEach(System.out::println);
	}

}
