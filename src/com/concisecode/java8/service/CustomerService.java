package com.concisecode.java8.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.concisecode.java8.entity.Customer;

public class CustomerService {
	
	public static List<Customer> getCustomer() {
		
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer(101, "Hitachi", "Air Conditioner", 50000.00, "Banglore", "Electronic Market",
				Arrays.asList("+91-3423424324", "+91-4324324989", "+91-4324326765")));
		customers.add(new Customer(102, "Samsung", "Washing Machine", 25600.00, "Banglore", "Electronic Market",
				Arrays.asList("+91-3423424324", "+91-4324324989")));
		customers.add(new Customer(103, "IFB", "Microwave", 12000.00, "Noida", "DLF Mall",
				Arrays.asList("+91-3423427777", "+91-4324324989")));
		customers.add(new Customer(104, "Hitachi", "Refrigerator", 30000.00, "Pune", "Pimpri",
				Arrays.asList("+91-3423488888", "+91-4324329999")));
		customers.add(new Customer(105, "Hitachi", "Microwave", 17000.00, "Noida", "Sector-63",
				Arrays.asList("+91-3423424324", "+91-4324328678")));
		customers.add(new Customer(106, "LG", "Monitor", 15000.00, "Chennai", "Mall Road",
				Arrays.asList("+91-3423424324", "+91-4324324989")));
		customers.add(new Customer(107, "Dell", "Laptop", 70000.00, "Delhi", "Gaphaar Market",
				Arrays.asList("+91-3423424324", "+91-432433333")));
		customers.add(new Customer(108, "Acer", "Laptop", 55000.00, "Delhi", "Gaphaar Market",
				Arrays.asList("+91-3423424324", "+91-4324324989")));
		customers.add(new Customer(109, "Whirlpool", "Washing Machine", 20000.00, "Banglore", "Electronic Market",
				Arrays.asList("+91-3423477777", "+91-432436666")));
		customers.add(new Customer(110, "Samsung", "Refrigerator", 29000.00, "Chennai", "Mall Road",
				Arrays.asList("+91-3423424324", "+91-4324324989")));

		return customers;

	}

}
