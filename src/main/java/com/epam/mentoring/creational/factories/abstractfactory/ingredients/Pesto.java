package com.epam.mentoring.creational.factories.abstractfactory.ingredients;

public class Pesto extends AbstractSauce {

	public Pesto(String pizzaName) {
		this.setName("Pesto for " + pizzaName);
	}

	@Override
	public String toString() {
		return getName();
	}

}
