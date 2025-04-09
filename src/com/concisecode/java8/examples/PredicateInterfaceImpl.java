package com.concisecode.java8.examples;

import java.util.function.Predicate;

class PredicateInterfaceImpl implements Predicate<Integer> {

	public boolean test(Integer num) {
		if (num % 2 == 0) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		PredicateInterfaceImpl predicateInterfaceImpl = new PredicateInterfaceImpl();
		
		Boolean isEvenNum = predicateInterfaceImpl.test(6);
		if (isEvenNum)
			System.out.println(" **This is even number.");
		else
			System.out.println(" **This is odd number.");
	}
	
}