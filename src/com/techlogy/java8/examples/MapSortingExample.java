package com.techlogy.java8.examples;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.techlogy.java8.entity.Employee;

public class MapSortingExample {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(101, "Peter");
		hashMap.put(202, "Puneet");
		hashMap.put(244, "Amit");
		hashMap.put(100, "Harsh");
		hashMap.put(344, "Vaibhav");

		hashMap.entrySet().stream().sorted((o1, o2) -> o1.getKey() - o2.getKey()).forEach(obj -> System.out.println(obj));
		System.out.println("========================================");
		hashMap.entrySet().stream().sorted((o1, o2) -> o1.getValue().compareTo(o2.getValue())).forEach(obj -> System.out.println(obj));
		System.out.println("========================================");

		hashMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(obj -> System.out.println(obj));
		hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(obj -> System.out.println(obj));

		TreeMap<Employee, String> treeMap = new TreeMap<Employee, String>(new Comparator<Employee>() {
			public int compare(Employee o1, Employee o2) {
				return o2.getSalary() - o1.getSalary();
			};
		});
		treeMap.put(new Employee("105", "Ram", "Admin", 55000, "Delhi"), "Peter");
		treeMap.put(new Employee("106", "Shyam", "Finance", 25000, "Bangalore"), "Puneet");
		treeMap.put(new Employee("110", "Pankaj", "HR", 100000, "Calcutta"), "Amit");
		treeMap.put(new Employee("112", "Peter", "Finance", 44000, "Pune"), "Harsh");
		treeMap.put(new Employee("117", "Monika", "HR", 37000, "Chennai"), "Vaibhav");
		
		System.out.println("========================================");
		treeMap.forEach((k, v) -> System.out.println("Key :: " + k + " Value :: " + v));
		System.out.println("========================================");
		treeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary))).forEach(System.out::println);
		System.out.println("========================================");
		treeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getCity))).forEach(System.out::println);
		System.out.println("========================================");
		treeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getCity).reversed())).forEach(System.out::println);
		
		
	}

}
