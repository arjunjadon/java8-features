package com.techlogy.java8.examples;

import java.util.function.Supplier;

public class SupplierInterfaceImpl implements Supplier<String> {
	
	public String get() {
		return "Welcome to Techlogy";
	}
	
	public static void main(String[] args) {
		SupplierInterfaceImpl supplierInterfaceImpl = new SupplierInterfaceImpl();
		String outcome = supplierInterfaceImpl.get();
		
		System.out.println("Return value :: "+ outcome);
	}

}
