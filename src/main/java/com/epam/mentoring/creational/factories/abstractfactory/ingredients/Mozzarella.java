package com.epam.mentoring.creational.factories.abstractfactory.ingredients;

public class Mozzarella extends AbstractCheese {

	public Mozzarella(String pizzaType) {
		this.setName("Mozzarella for " + pizzaType);
	}
	
	@Override
	public String toString() {
		return getName();
	}
	
}
