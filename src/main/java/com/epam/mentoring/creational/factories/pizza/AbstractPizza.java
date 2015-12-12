package com.epam.mentoring.creational.factories.pizza;

import java.util.Arrays;

import com.epam.mentoring.creational.factories.abstractfactory.ingredients.Ingredient;

public abstract class AbstractPizza {

	private double weight;
	private String price;
	private Ingredient[] ingredients;
	
	public AbstractPizza() {
	}
	
	public AbstractPizza(double weight, String price) {
		this.weight = weight;
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Ingredient[] getIngredients() {
		return ingredients;
	}

	public void setIngredients(Ingredient[] ingredients) {
		this.ingredients = ingredients;
	}

	@Override
	public String toString() {
		return "[weight=" + weight + ", price=" + price + ", ingredients=" + Arrays.toString(ingredients) + "]";
	}

	public abstract void serve();

}
