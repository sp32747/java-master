package com.sree.stream2;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
	
	static List<Employee> getAllEmployees(){

		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee("srikant", 45, 10000,"A"));
		employeeList.add(new Employee("snee", 30, 45000,"B"));
		employeeList.add(new Employee("nilu", 35, 670000,"A"));
		employeeList.add(new Employee("pan", 35, 900000,"D"));
		employeeList.add(new Employee("newt", 50, 780000,"A"));
		employeeList.add(new Employee("fwt", 15, 1900000,"C"));
		return employeeList;

	}
}
