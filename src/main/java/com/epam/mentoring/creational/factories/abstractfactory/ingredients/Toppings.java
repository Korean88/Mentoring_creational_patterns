package com.epam.mentoring.creational.factories.abstractfactory.ingredients;

import java.util.Arrays;

public class Toppings extends Ingredient {
	
	private String[] products;

	public Toppings(String[] products) {
		this.products = products;
	}

	public String[] getProducts() {
		return products;
	}

	public void setProducts(String[] products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Toppings" + Arrays.toString(products);
	}

}
