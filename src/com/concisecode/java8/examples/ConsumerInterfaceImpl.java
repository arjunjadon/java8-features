package com.concisecode.java8.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterfaceImpl implements Consumer<String>{

	@Override
	public void accept(String t) {
		System.out.println("Entered input parameter :: " + t);
	}

	public static void main(String[] args) {
//		ConsumerInterfaceImpl consumerInterface = new ConsumerInterfaceImpl();
//		consumerInterface.accept("Apple");
		
		// Implementation of consumer function interface by using Lambda expression.
		Consumer consumer = (t) -> System.out.println("Entered input parameter :: " + t);
		consumer.accept("Orange");
 
		List<Integer> intList = Arrays.asList(1,4,6,8,9);
		intList.forEach(consumer);
		
		
	}

}
