package com.concisecode.java8.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReduceFunctionExample {

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(3, 5, 6, 7, 8, 2, 3);

		int total = 0;
		for (int i : intList) {
			total = total + i;
		}
		System.out.println("Sum of numbers :: " + total);

		System.out.println("=========================================================");
		Integer sum = intList.stream().reduce(0, (a, b) -> a * b);
		System.out.println(" **Sum of item list: " + sum);

		Integer sum1 = intList.stream().mapToInt(i -> i).sum();
		System.out.println(" **Sum of arraylist items: " + sum1);

		long count = intList.stream().count();
		System.out.println(" Count: " + count);
		System.out.println("=========================================================");

		int min = intList.stream().mapToInt(i -> i).reduce((a, b) -> a < b ? a : b).getAsInt();
		int minimum = intList.stream().mapToInt(i -> i).min().getAsInt();
		int minimum1 = intList.stream().mapToInt(i -> i).reduce(Integer::min).getAsInt();
		System.out.println(" **Smallest number: " + minimum1);

		System.out.println("=========================================================");

		int max = intList.stream().mapToInt(i -> i).max().getAsInt();
		System.out.println(" **Maximum number: " + max);

		System.out.println("=========================================================");

		double average = intList.stream().mapToInt(i -> i).average().getAsDouble();
		System.out.println("Average of list of numbers: " + average);
		
		System.out.println("=========================================================");

		List<String> strList = Arrays.asList("Krishna", "Vivek", "Yash", "Puneet", "Vinay", "Peter", "Harsh", "Deepak");

		// Find the name of employee which has longest name.
		String maxEmpName = strList.stream().reduce((o1, o2) -> o1.length() > o2.length() ? o1 : o2).get();
		System.out.println(" **Maximum Lenght :: " + maxEmpName);

		System.out.println("=========================================================");

        // List down all the strings which starts with P character.  
		List<String> filteredList = strList.stream().filter(str -> str.startsWith("P")).collect(Collectors.toList());
		System.out.println(" **Employee names start with P char :: " + filteredList);

		System.out.println("=========================================================");

		// List down all the strings which does not contain more than 5 characters.
		List<String> filteredList1 = strList.stream().filter(str -> (str.chars().count() <= 5))
				.collect(Collectors.toList());
		System.out.println(" **Employee names consists max 5 charactors: " + filteredList1);

	}

}
