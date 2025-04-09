package com.concisecode.java8.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.concisecode.java8.entity.Employee;

public class EmployeeService {

	public static List<Employee> empList = Stream.of(
			new Employee("101", "Neeraj", "Finance", 25000, "Bangalore", Arrays.asList("080-45565688", "+91-9868586633")),
			new Employee("105", "Ram", "Admin", 55000, "Delhi", Arrays.asList("011-44346789", "+91-9755686633")),
			new Employee("106", "Shyam", "Finance", 25000, "Bangalore", Arrays.asList("0120-34234277", "+91-9893324989")),
			new Employee("110", "Pankaj", "HR", 100000, "Calcutta", Arrays.asList("011-3423488888", "+91-9968586533")),
			new Employee("112", "Peter", "Finance", 44000, "Pune", Arrays.asList("020-34234243", "+91-9358322333")),
			new Employee("114", "Amit", "Finance", 60000, "Bangalore", Arrays.asList("080-34234243", "+91-9358322111")),
			new Employee("117", "Monika", "HR", 37000, "Chennai", Arrays.asList("044-58424324", "+91-9358322333")),
			new Employee("118", "Monu", "IT", 33000, "Delhi", Arrays.asList("011-36856443", "+91-9366622333")),
			new Employee("103", "Aarti", "Finance", 50000, "Bangalore", Arrays.asList("080-34567433", "+91-9868555533")),
			new Employee("104", "Rohan", "IT", 57000, "Chennai", Arrays.asList("044-68975324", "+91-9768586633")),
			new Employee("119", "Manish", "IT", 75000, "Delhi", Arrays.asList("011-55656443", "+91-9867586633")))
			.collect(Collectors.toList());
	
	}
