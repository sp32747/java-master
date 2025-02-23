package com.sree.stream;

import java.util.List;

public class Employee {

	private int id;
	private int age;
	private String name;
	private String email;
	private List<String> phoneNumbers;
	private String department;
	private int salary;

	public Employee(int id, int age, String name, String email, List<String> phoneNumbers, String department ,int salary) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.email = email;
		this.phoneNumbers = phoneNumbers;
		this.department = department;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<String> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", name=" + name + ", email=" + email + ", phoneNumbers="
				+ phoneNumbers + ", department=" + department + ", salary=" + salary + "]";
	}



}
