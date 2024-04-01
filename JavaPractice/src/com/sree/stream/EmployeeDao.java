package com.sree.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeDao {

	public static List<Employee> getAll() {

		List employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(1, 50, "nilu", "jhkk@fg.com", Arrays.asList("1234", "6789"),"QA",89000));
		employeeList.add(new Employee(2, 60, "Sree", "srik@fg.com", Arrays.asList("1234", "6789"),"DEV",88000));
		employeeList.add(new Employee(3, 230, "pan", "ik@fg.com", Arrays.asList("1234", "6789"),"ADMIN",488000));
		employeeList.add(new Employee(4, 10, "Sriee", "s@fg.com", Arrays.asList("1234", "6789"),"QA",880060));
		employeeList.add(new Employee(3, 230, "pani", "ik@fg.com", Arrays.asList("1234", "6789"),"DEV",880800));
		employeeList.add(new Employee(4, 10, "Sriee", "s@fg.com", Arrays.asList("1234", "6789"),"QA",82000));
		return employeeList;
	}

	public static List<List<Employee>> getAllNested() {
		List nestedList = new ArrayList();

		List employeeList = new ArrayList<Employee>();

		employeeList.add(new Employee(1, 50, "nilu", "jhkk@fg.com", Arrays.asList("1234", "6789"),"QA",89000));
		employeeList.add(new Employee(2, 60, "Sree", "srik@fg.com", Arrays.asList("1234", "6789"),"DEV",88000));
		employeeList.add(new Employee(3, 230, "pan", "ik@fg.com", Arrays.asList("1234", "6789"),"ADMIN",488000));
		employeeList.add(new Employee(4, 10, "Sriee", "s@fg.com", Arrays.asList("1234", "6789"),"QA",880060));
		employeeList.add(new Employee(3, 230, "pani", "ik@fg.com", Arrays.asList("1234", "6789"),"DEV",880800));
		employeeList.add(new Employee(4, 10, "Sriee", "s@fg.com", Arrays.asList("1234", "6789"),"QA",82000));

		nestedList.add(employeeList);

		List employeeList1 = new ArrayList<Employee>();

		employeeList.add(new Employee(1, 50, "nilu", "jhkk@fg.com", Arrays.asList("1234", "6789"),"QA",89000));
		employeeList.add(new Employee(2, 60, "Sree", "srik@fg.com", Arrays.asList("1234", "6789"),"DEV",88000));
		employeeList.add(new Employee(3, 230, "pan", "ik@fg.com", Arrays.asList("1234", "6789"),"ADMIN",488000));
		employeeList.add(new Employee(4, 10, "Sriee", "s@fg.com", Arrays.asList("1234", "6789"),"QA",880060));
		employeeList.add(new Employee(3, 230, "pani", "ik@fg.com", Arrays.asList("1234", "6789"),"DEV",880800));
		employeeList.add(new Employee(4, 10, "Sriee", "s@fg.com", Arrays.asList("1234", "6789"),"QA",82000));
		nestedList.add(employeeList1);

		return nestedList;
	}

}
