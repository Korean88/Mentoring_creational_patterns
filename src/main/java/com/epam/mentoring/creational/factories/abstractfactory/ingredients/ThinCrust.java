package com.epam.mentoring.creational.factories.abstractfactory.ingredients;


public class ThinCrust extends AbstractDough {

	public ThinCrust(String pizzaName) {
		this.setDescription("Thin crust for " + pizzaName);
	}

	@Override
	public String toString() {
		return getDescription();
	}
	
}
