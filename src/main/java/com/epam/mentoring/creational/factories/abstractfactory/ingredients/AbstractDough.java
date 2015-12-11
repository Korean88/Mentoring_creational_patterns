package com.epam.mentoring.creational.factories.abstractfactory.ingredients;

public abstract class AbstractDough extends Ingredient {
	
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
