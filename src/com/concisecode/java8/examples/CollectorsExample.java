package com.concisecode.java8.examples;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.concisecode.java8.entity.Product;
import com.concisecode.java8.service.ProductService;

public class CollectorsExample {

	public static void main(String[] args) {
		List<Product> products = ProductService.getProduct();

		/**
		 * 1. What is this partitioningBy or groupingBy terms? 
		 * 2. Why should we use Collectors.partitioningBy() or Collectors.groupingBy() methods? 
		 * 3. How to use Collectors.partitioningBy() or Collectors.groupingBy() methods?
		 */

		/* Collectors.partitioningBy() */
		Map<Boolean, List<Product>> pationingByData = products.stream()
				.collect(Collectors.partitioningBy(prod -> prod.getCategory().equalsIgnoreCase("Casual")));
		pationingByData.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));

		System.out.println("====================================================================================");
		
		/* Collectors.groupingBy() */
		Map<Object, Long> groupingByData = products.stream()
				.collect(Collectors.groupingBy(Product::getCategory, Collectors.counting()));
		groupingByData.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));
		
	}

}
