package com.concisecode.java8.examples;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.concisecode.java8.entity.Employee;
import com.concisecode.java8.service.EmployeeService;

public class StreamAPIFAQ {

	public static void main(String[] args) {
		List<Employee> empList = EmployeeService.empList;

		/* 1. Find out the the list of employees who are staying in Bangalore city */ 
		List<Employee> bangloreCityEmployees = empList.stream()
				.filter(emp -> emp.getCity().equalsIgnoreCase("Bangalore")).collect(Collectors.toList());
		System.out.println(" ***Employees staying in the Bangalore city => " + bangloreCityEmployees);

		System.out.println("===========================================================================================");

		
		/* 2. List the employees who are earning below 50k */
		List<Employee> employeeSalaryBelow50k = empList.stream().filter(emp -> emp.getSalary() < 50000)
				.collect(Collectors.toList());
		System.out.println(" ***Employees list whoes salaries are less than 50k => " + employeeSalaryBelow50k);

		System.out.println("===========================================================================================");

		/* 3. The highest salary of an employee who is working in the HR department. */
		Optional<Integer> highestSalaryInHR = empList.stream().filter(emp -> emp.getDeptName().equalsIgnoreCase("HR"))
				.map(emp -> emp.getSalary()).max(Integer::max);
		System.out.println(" ***Highest salary in HR department => " + highestSalaryInHR.get());

		System.out.println("===========================================================================================");

		/* 4. Find the employee with the second highest salary. */
		Optional<Integer> secHighestSalary = empList.stream()
				.sorted(Comparator.comparing(Employee::getSalary).reversed()).map(emp -> emp.getSalary()).skip(1)
				.max(Integer::max);
		System.out.println(" ***Second highest salary of employees => " + secHighestSalary.get());

		System.out.println("===========================================================================================");

		/* 5. Find the second highest salary in the Finance department. */
		Integer highestSalaryOfFinanceDept = empList.stream()
				.filter(emp -> emp.getDeptName().equalsIgnoreCase("Finance"))
				.sorted(Comparator.comparing(Employee::getSalary).reversed()).map(emp -> emp.getSalary()).skip(1)
				.findFirst().get();
		System.out.println(" ***Second highest salary of employee who is working in Finance department => " + highestSalaryOfFinanceDept);

		System.out.println("===========================================================================================");

		/* 6. The average salary of the IT department. */
		Double averageSalary = empList.stream().filter(emp -> emp.getDeptName().equalsIgnoreCase("IT"))
				.map(Employee::getSalary).mapToInt(sal -> sal).average().getAsDouble();
		System.out.println(" ***Average salary of employees they are working in IT department => " + averageSalary);

		System.out.println("===========================================================================================");

		/*
		 * 7. Contact list of employees who are staying in Bangalore city and working in Finance
		 * department.
		 */

		List<List<String>> contactList = empList.stream()
				.filter(emp -> emp.getCity().equalsIgnoreCase("Bangalore") && emp.getDeptName().equalsIgnoreCase("Finance"))
				.map(emp -> emp.getContacts()).collect(Collectors.toList());
		
		List<String> contacts = empList.stream()
				.filter(emp -> emp.getCity().equalsIgnoreCase("Bangalore") && emp.getDeptName().equalsIgnoreCase("Finance"))
				.flatMap(emp -> emp.getContacts().stream()).collect(Collectors.toList());
		System.out.println(" ***Contact No's of Finance department => " + contacts);

		System.out.println("===========================================================================================");

		/* 8. Find out the list of departments. */
		List<String> deptList = empList.stream().map(emp -> emp.getDeptName()).distinct().collect(Collectors.toList());
		System.out.println(" ***List of departments => " + deptList);
		
		System.out.println("===========================================================================================");
		
		/* 9. Find out the number of employees who are working in each department. */
		Map<String, Long> employeesCount = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDeptName, Collectors.counting()));
		System.out.println(" ***Number of employees in each department => " + employeesCount);

		System.out.println("===========================================================================================");

		/* 10. Find out the maximum salary in each department. */
		Map<String, List<Employee>> list = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName));
		System.out.println(" ***Group the employees departmentwise => " + list);

		System.out.println("===========================================================================================");
		
		Map<String, List<Integer>> listSalary = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,
				Collectors.mapping(Employee::getSalary, Collectors.toList())));
		System.out.println(" ***Extract the salary of each employee departmentwise => " + listSalary);

		System.out.println("===========================================================================================");
		
		Map<String, Optional<Integer>> maxSalaryByDept = empList.stream()
		.collect(Collectors.groupingBy(Employee::getDeptName,
				Collectors.mapping(Employee::getSalary, Collectors.reducing(Integer::max))));
		System.out.println(" ***Maximum salary in each department => "+ maxSalaryByDept);
			
	}

}
