package com.concisecode.java8.examples;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.concisecode.java8.entity.Customer;
import com.concisecode.java8.service.CustomerService;

public class StreamAPIFAQ2 {

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

	}

}
