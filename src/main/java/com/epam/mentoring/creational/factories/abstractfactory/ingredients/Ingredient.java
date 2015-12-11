package com.epam.mentoring.creational.factories.abstractfactory.ingredients;

public abstract class Ingredient {
	
	private String name;

	@Override
	public String toString() {
		return "Ingredient [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
