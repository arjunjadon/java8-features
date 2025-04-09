package com.concisecode.java8.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.concisecode.java8.entity.Employee;
import com.concisecode.java8.service.EmployeeService;

public class MapFunctionExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Apple", "Orange", "mango", "Pine Apple");
		list.stream().map(item -> item.toUpperCase()).forEach(System.out::println);
		System.out.println("=========================================================");

		List<Integer> intList = Arrays.asList(1, 5, 8, 9, 7);
		List<Double> doubleList = intList.stream().mapToDouble(item -> item).boxed().collect(Collectors.toList());
		System.out.println("List of doubles :: " + doubleList);

		System.out.println("=========================================================");

		List<Employee> empList = EmployeeService.empList;
		List<String> empNames = empList.stream().map(emp -> emp.getEmpName()).collect(Collectors.toList());
		System.out.println("List of employee names :: " + empNames);

		System.out.println("=========================================================");

		List<String> empNameAndSalary = empList.stream()
				.map(emp -> "Name: " + emp.getEmpName() + ", Salary: " + emp.getSalary()).collect(Collectors.toList());
		System.out.println("List of employee salary along with names :: " + empNameAndSalary);

		System.out.println("=========================================================");

		List<List<String>> listOfContactList = empList.stream().map(emp -> emp.getContacts())
				.collect(Collectors.toList());
		System.out.println("List of contact no list :: " + listOfContactList);

		System.out.println("=========================================================");

		List<String> contactList = empList.stream().flatMap(cust -> cust.getContacts().stream())
				.collect(Collectors.toList());
		System.out.println("List of contact numbers :: " + contactList);

	}
}