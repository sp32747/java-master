package com.sree.stream2;

import java.util.List;

public class MapReduceTestForCustomObjects {

	public static void main(String[] args) {
		List<Employee> employeeList = EmployeeDAO.getAllEmployees();

		// sum of all the salaries of employess whose grade is A
		System.out.println("**********sum of all the salaries of employess whose grade is A*****************");

		double x = employeeList.stream().filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
				.map(employee -> employee.getSalary()).mapToDouble(salary -> salary).sum();
		System.out.println(x);

		System.out.println("**********average of all the salaries of employess whose grade is A*****************");

		double avgSalary = employeeList.stream().filter(employee -> employee.getGrade().equalsIgnoreCase("E"))
				.map(employee -> employee.getSalary()).mapToDouble(salary -> salary).average().getAsDouble();
		
		System.out.println(avgSalary);

	}

}
