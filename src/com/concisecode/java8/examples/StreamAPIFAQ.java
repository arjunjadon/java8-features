package com.concisecode.java8.examples;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.concisecode.java8.entity.Customer;
import com.concisecode.java8.entity.Employee;
import com.concisecode.java8.service.CustomerService;
import com.concisecode.java8.service.EmployeeService;

public class StreamAPIFAQ {

	public static void main(String[] args) {
		List<Customer> customers = CustomerService.getCustomer();

		/* List all the customers who are selling laptops. */
		List<Customer> laptopCustomers = customers.stream().filter(cust -> cust.getProduct().equalsIgnoreCase("Laptop"))
				.collect(Collectors.toList());
		System.out.println(" **Customers who are selling laptops. " + laptopCustomers);

		System.out.println("===============================================================");

		/* What is cheapest laptop among all the customer. */
		Customer cheapestLaptop = customers.stream().filter(cust -> cust.getProduct().equalsIgnoreCase("Laptop"))
				.sorted(Comparator.comparing(Customer::getPrice)).findFirst().get();
		System.out.println(cheapestLaptop);

		System.out.println("===============================================================");

		/* All the branches of Dell in India */
		List<String> hitachiBranches = customers.stream().filter(cust -> cust.getName().equalsIgnoreCase("Hitachi"))
				.map(cust -> cust.getCity()).collect(Collectors.toList());
		System.out.println(" **Hitachi Branches: " + hitachiBranches);

		System.out.println("===============================================================");

		/* All the different products are available */
		List<String> products = customers.stream().map(cust -> cust.getProduct()).distinct()
				.collect(Collectors.toList());
		System.out.println(" **Product Listing: " + products);

		System.out.println("===============================================================");

		/* All the product list of each customer */
		Map<String, List<Customer>> customerProduct = customers.stream()
				.collect(Collectors.groupingBy(Customer::getProduct));
		System.out.println(" **Product list of each customer: " + customerProduct);

		System.out.println("===============================================================");

		Map<String, List<String>> customerProducts = customers.stream().collect(Collectors.groupingBy(Customer::getName,
				Collectors.mapping(Customer::getProduct, Collectors.toList())));
		System.out.println(" **Product list of each customer: " + customerProducts);

		System.out.println("===============================================================");

		Map<String, Long> customerProductCount = customers.stream()
				.collect(Collectors.groupingBy(Customer::getName, Collectors.counting()));
		System.out.println(" **Count of products of each customer: " + customerProductCount);

		System.out.println("===============================================================");

		System.out.println("===============================================================");

		List<Employee> empList = EmployeeService.empList;
		/* Find out the the list employees who lives in Bangalore */
		empList.stream().filter(emp -> emp.getCity().equalsIgnoreCase("Bangalore")).forEach(System.out::println);

		System.out.println("===============================================================");

		/* List the employees they are earning below 50k */
		empList.stream().filter(emp -> emp.getSalary() < 50000).forEach(System.out::println);

		System.out.println("===============================================================");

		/* Highest salary of employee who is working in HR department */
		Optional<Integer> highestSalaryInHR = empList.stream().filter(emp -> emp.getDeptName().equalsIgnoreCase("HR")).map(emp -> emp.getSalary())
				.max(Integer::max);
		System.out.println(" **Highest salary in HR department: "+ highestSalaryInHR.get());

		System.out.println("===============================================================");

		/* Find the second highest salary of employees */
		Optional<Integer> secHighestSalary = empList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
				.map(emp -> emp.getSalary()).skip(1).max(Integer::max);
		System.out.println(" **Second highest salary of employees: "+ secHighestSalary.get());
		
		System.out.println("===============================================================");

		/* Find the second highest salary of Finance department */

		System.out.println("===============================================================");

		/* Average salary of Finance department */

		/*
		 * Contact list of employees who are working in HR department and based out of
		 * Bangalore city.
		 */
		
		List<List<String>> contactList = empList.stream().filter(emp -> emp.getDeptName().equalsIgnoreCase("HR"))
				.map(emp -> emp.getContacts()).collect(Collectors.toList());
		List<String> contacts = empList.stream().filter(emp -> emp.getDeptName().equalsIgnoreCase("HR"))
				.flatMap(emp -> emp.getContacts().stream()).collect(Collectors.toList());
		System.out.println(" **Contact No's of HR department: "+ contacts);
		
		// Find the maximum salary of each department.
		Map<String, List<Employee>>  list = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName));
		System.out.println(" ***" + list);
		Map<String, List<Integer>>  listSalary = empList.stream().collect(Collectors.groupingBy(Employee::getDeptName,
				Collectors.mapping(Employee::getSalary, Collectors.toList())));
		System.out.println("***********" + listSalary);
		empList.stream()
				.collect(Collectors.groupingBy(Employee::getDeptName,
						Collectors.mapping(Employee::getSalary, Collectors.toList())))
				.entrySet().forEach(obj -> System.out.println("Department: " + obj.getKey() + ", Salary: "
						+ obj.getValue().stream().mapToInt(salary -> salary.valueOf(salary)).max().getAsInt()));
		
		Map<String,Integer> salaryes = new HashMap<String, Integer>();
		empList.stream()
				.collect(Collectors.groupingBy(Employee::getDeptName,
						Collectors.mapping(Employee::getSalary, Collectors.toList())))
				.entrySet().stream().map(k -> salaryes.put(k.getKey(),
						k.getValue().stream().mapToInt(salary -> salary.valueOf(salary)).max().getAsInt()));
		System.out.println("**********************************************************");
		salaryes.forEach((k,v) -> System.out.println("Key: "+k+", Salary: "+v));

	}

}
