package com.concisecode.java8.entity;

public class Product {

	private Integer Id;
	private String name;
	private String brand;
	private String category;
	private Double price;
	private String description;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(Integer id, String name, String brand, String category, Double price, String description) {
		super();
		Id = id;
		this.name = name;
		this.brand = brand;
		this.category = category;
		this.price = price;
		this.description = description;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "\nProduct [Id=" + Id + ", name=" + name + ", brand=" + brand + ", category=" + category + ", price=" + price + ", description="
				+ description + "]";
	}

}
