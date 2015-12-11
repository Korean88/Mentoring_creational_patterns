package com.epam.mentoring.creational.factories.abstractfactory.ingredients;

public class Salsa extends AbstractSauce {

	public Salsa(String pizzaName) {
		this.setName("Salsa for " + pizzaName);
	}

	@Override
	public String toString() {
		return getName();
	}

}
