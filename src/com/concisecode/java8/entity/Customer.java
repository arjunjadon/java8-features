package com.concisecode.java8.entity;

import java.util.List;

public class Customer {
	
	private long id;
	private String name;
	private String product;
	private double price;
	private String city;
	private String address;
	private List<String> contacts;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(long id, String name, String product, double price, String city, String address,
			List<String> contacts) {
		super();
		this.id = id;
		this.name = name;
		this.product = product;
		this.price = price;
		this.city = city;
		this.address = address;
		this.contacts = contacts;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<String> getContacts() {
		return contacts;
	}

	public void setContacts(List<String> contacts) {
		this.contacts = contacts;
	}

	@Override
	public String toString() {
		return "\nCustomer [id=" + id + ", name=" + name + ", product=" + product + ", price=" + price + ", address="
				+ address + ", city=" + city + ", contacts=" + contacts + "]";
	}

}
