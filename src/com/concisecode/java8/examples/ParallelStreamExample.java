package com.concisecode.java8.examples;

import java.util.List;

import com.concisecode.java8.entity.Employee;
import com.concisecode.java8.service.EmployeeService;

public class ParallelStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> empList = EmployeeService.empList;
		long currentTime = System.currentTimeMillis();
		readWithoutParellelStream(empList);
		long timeTaken = System.currentTimeMillis() - currentTime;
		System.out.println(" ***Total time taken in case without parellel stream => " + timeTaken);
		
		long parellelStreamTime = System.currentTimeMillis();
		readWithParellelStream(empList);
		parellelStreamTime = System.currentTimeMillis() - parellelStreamTime; 
		System.out.println(" ***Total time taken in case with parellel stream => " + parellelStreamTime);
		
	}

	public static void readWithoutParellelStream(List<Employee> empList) {
		empList.stream().forEach(System.out::println);

	}

	public static void readWithParellelStream(List<Employee> empList) {
		empList.parallelStream().forEach(System.out::println);

	}
	
	public static void readRandomData() {
		long currentTime = System.currentTimeMillis();
		for(int i=0; i<=1000; i++) {
			System.out.println(" ***Next Random Value => " + Math.random());
		}
		long totalTaken = currentTime = System.currentTimeMillis() - currentTime;
		System.out.println(" ***Total time taken to read random numbers: " + totalTaken);
	}

}
