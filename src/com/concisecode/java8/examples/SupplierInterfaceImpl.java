package com.concisecode.java8.examples;

import java.util.function.Supplier;

public class SupplierInterfaceImpl {
	
	public String get() {
		return "Welcome to Techlogy";
	}
	
	public static void main(String[] args) {
		SupplierInterfaceImpl supplierInterfaceImpl = new SupplierInterfaceImpl();
		String outcome = supplierInterfaceImpl.get();
		
		System.out.println("Return value :: "+ outcome);
		
		Supplier supplier = () -> Math.random();
		System.out.println("Returned output :: "+ supplier.get());
		
	}

}
