package com.techlogy.java8.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.techlogy.java8.entity.Employee;

public class EmployeeService {
	
	public static List<Employee> empList = Stream
			.of(new Employee("101", "Neeraj", "Finance", 25000, "Bangalore"),
					new Employee("105", "Ram", "Admin", 55000, "Delhi"),
					new Employee("106", "Shyam", "Finance", 25000, "Bangalore"),
					new Employee("110", "Pankaj", "HR", 100000, "Calcutta"),
					new Employee("112", "Peter", "Finance", 44000, "Pune"),
					new Employee("114", "Amit", "Finance", 60000, "Bangalore"),
					new Employee("117", "Monika", "HR", 37000, "Chennai"),
					new Employee("118", "Monu", "IT", 33000, "Delhi"),
					new Employee("103", "Aarti", "Finance", 50000, "Bangalore"),
					new Employee("104", "Rohan", "IT", 57000, "Chennai"),
					new Employee("119", "Manish", "IT", 75000, "Delhi"))
			.collect(Collectors.toList());
	

}
