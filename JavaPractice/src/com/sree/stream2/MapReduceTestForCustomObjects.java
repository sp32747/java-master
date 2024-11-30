package com.sree.stream2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapReduceTestForCustomObjects {

	public static void main(String[] args) {
		List<Employee> employeeList = EmployeeDAO.getAllEmployees();

		
		System.out.println("**********sum of all the salaries of employess whose grade is A*****************");
		
		employeeList.stream().map(emp->emp.getSalary()).filter(x->x>670000).collect(Collectors.toList()).forEach(System.out::println);
		
		// sum of all the salaries of employess whose grade is A
		
		double sumSal = employeeList.stream().filter(emp->emp.getGrade().equalsIgnoreCase("A")).map(emp->emp.getSalary()).mapToDouble(salary->salary).sum();
		
		System.out.println(sumSal);
		
		
		double sumSal1 = employeeList.stream().filter(emp->emp.getGrade().equalsIgnoreCase("A")).map(emp->emp.getSalary()).reduce(Integer::sum).get();
		System.out.println("with reduce"+sumSal1);
		
		
		
		/*
		 * double x = employeeList.stream().filter(employee ->
		 * employee.getGrade().equalsIgnoreCase("A")) .map(employee ->
		 * employee.getSalary()).mapToDouble(salary -> salary).sum();
		 * System.out.println(x);
		 * 
		 * System.out.
		 * println("**********average of all the salaries of employess whose grade is A*****************"
		 * );
		 * 
		 * double avgSalary = employeeList.stream().filter(employee ->
		 * employee.getGrade().equalsIgnoreCase("E")) .map(employee ->
		 * employee.getSalary()).mapToDouble(salary -> salary).average().getAsDouble();
		 * 
		 * System.out.println(avgSalary);
		 */

	}

}
