package com.epam.mentoring.creational.factories.abstractfactory.ingredients;


public class ThickCrust extends AbstractDough {

	public ThickCrust(String pizzaName) {
		this.setDescription("Thick crust for " + pizzaName);
	}

	@Override
	public String toString() {
		return getDescription();
	}

}
