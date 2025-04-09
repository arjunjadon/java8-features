package com.concisecode.java8.examples;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.concisecode.java8.entity.Employee;

import java.util.TreeMap;

public class MapSortingExample implements Comparator<Entry<Integer, String>> {

	@Override
	public int compare(Entry<Integer, String> o1, Entry<Integer, String> o2) {
		// TODO Auto-generated method stub
		return o1.getKey() - o2.getKey();
	}

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(101, "Peter");
		hashMap.put(202, "Puneet");
		hashMap.put(244, "Amit");
		hashMap.put(100, "Harsh");
		hashMap.put(344, "Vaibhav");

		hashMap.entrySet().stream().sorted((o1, o2) -> o1.getKey() - o2.getKey()).forEach(obj -> System.out.println(obj));
		System.out.println("==========================================================");
		hashMap.entrySet().stream().sorted((o1, o2) -> o1.getValue().compareTo(o2.getValue())).forEach(obj -> System.out.println(obj));
		System.out.println("==========================================================");
		hashMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("==========================================================");
		hashMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

		TreeMap<Employee, String> treeMap = new TreeMap<Employee, String>(new Comparator<Employee>() {
			public int compare(Employee o1, Employee o2) {
				return o1.getSalary() - o2.getSalary();
			};
		});
		treeMap.put(new Employee("105", "Ram", "Admin", 55000, "Delhi"), "Peter");
		treeMap.put(new Employee("106", "Shyam", "Finance", 25000, "Bangalore"), "Puneet");
		treeMap.put(new Employee("110", "Pankaj", "HR", 100000, "Calcutta"), "Amit");
		treeMap.put(new Employee("112", "Peter", "Finance", 44000, "Pune"), "Harsh");
		treeMap.put(new Employee("117", "Monika", "HR", 37000, "Chennai"), "Vaibhav");

		treeMap.forEach((k, v) -> System.out.println("Key :: " + k + ", value" + v));
		System.out.println("==========================================================");
		treeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDeptName).reversed()))
				.forEach(System.out::println);

	}

}
