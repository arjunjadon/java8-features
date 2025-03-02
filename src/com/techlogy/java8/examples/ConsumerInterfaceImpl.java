package com.techlogy.java8.examples;

import java.util.function.Consumer;

public class ConsumerInterfaceImpl implements Consumer<String> {
	
	@Override
	public void accept(String t) {
		System.out.println("Entered input parameter :: " + t);
	}

	public static void main(String[] args) {
		ConsumerInterfaceImpl consumerInterface = new ConsumerInterfaceImpl();
		consumerInterface.accept("Apple");
	}

}
