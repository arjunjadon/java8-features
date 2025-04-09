package com.concisecode.java8.examples;

import java.util.function.Function;

public class FunctionInterfaceImpl implements Function<String, String>{
	
	
	@Override
	public String apply(String empName) {
		return empName.toUpperCase();
	}
	
	public static void main(String[] args) {
		FunctionInterfaceImpl functionInterfaceExample =new FunctionInterfaceImpl();
		String smallCase = functionInterfaceExample.apply("Peter");
		System.out.println(smallCase);
		
		
		
	}

}
