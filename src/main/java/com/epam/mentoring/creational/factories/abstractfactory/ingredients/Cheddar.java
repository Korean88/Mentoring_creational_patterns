package com.epam.mentoring.creational.factories.abstractfactory.ingredients;

public class Cheddar extends AbstractCheese {

	public Cheddar(String pizzaType) {
		this.setName("Cheddar for " + pizzaType);
	}

	@Override
	public String toString() {
		return getName();
	}
}
