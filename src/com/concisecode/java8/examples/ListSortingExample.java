package com.concisecode.java8.examples;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.concisecode.java8.entity.Employee;
import com.concisecode.java8.service.EmployeeService;

public class ListSortingExample implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getSalary() - o2.getSalary();
	}

	public static void main(String[] args) {
		ListSortingExample comparator = new ListSortingExample();

		List<Employee> empList = EmployeeService.empList;
		Collections.sort(empList, comparator);
	}

}
