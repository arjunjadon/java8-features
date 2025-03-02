package com.techlogy.java8.examples;

import java.util.function.Function;

public class FunctionInterfaceExample implements Function<String, String>{
	
	
	@Override
	public String apply(String empName) {
		return empName.toUpperCase();
	}
	
	public static void main(String[] args) {
		FunctionInterfaceExample functionInterfaceExample =new FunctionInterfaceExample();
		String smallCase = functionInterfaceExample.apply("Peter");
		System.out.println(smallCase);
		
		
		
	}

}
