package com.example.demo;

public class Product {

	private String id;
	private String name;
	private double price;
	private String model;
	private String productType;

	
	
	
	
	public Product(String id, String name, double price, String model, String productType) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.model = model;
		this.productType = productType;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", model=" + model + ", productType="
				+ productType + "]";
	}

}
