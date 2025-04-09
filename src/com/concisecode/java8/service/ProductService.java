package com.concisecode.java8.service;

import java.util.ArrayList;
import java.util.List;

import com.concisecode.java8.entity.Product;

public class ProductService {
	
    public static List<Product> getProduct(){
    	List<Product> productList = new ArrayList<Product>();
    	productList.add(new Product(1001, "T-Shirt", "Monte Carlo", "Casual", 1199.00, "Party wear"));
    	productList.add(new Product(1005, "Pant", "Van Heusen", "Formal", 2399.00, "Formal wear"));
    	productList.add(new Product(1009, "Capri", "Allen Solly", "Casual", 1499.00, "Casual wear"));
    	productList.add(new Product(1011, "Tousers", "Levis", "Formal", 2999.00, "Formal wear"));
    	productList.add(new Product(1015, "Shirt", "Peter England", "Formals", 3999.00, "Formal wear"));
    	productList.add(new Product(1017, "Jeans", "Pepe Jeans", "Casual", 2599.00, "Casual wear"));
    	productList.add(new Product(1022, "Sweatshirt", "Monte Carlo", "Casual", 3999.00, "Casual wear"));
    	productList.add(new Product(1016, "Kurta", "Manyawar", "Party", 4999.00, "Party wear"));
    	productList.add(new Product(1031, "F/Sleave Shirt", "Van Heusen", "Cloths", 2250.00, "Party wear"));
    	productList.add(new Product(1033, "T-Shirt", "Monte Carlo", "Cloths", 1999.00, "Party wear"));
    	
    	return productList;
    	
    }
}
