package com.epam.mentoring.creational.factories.pizza;

import com.epam.mentoring.creational.factories.abstractfactory.inf.IPizzaIngredientsFactory;

public class CapricciosaPizza extends AbstractPizza {

	public CapricciosaPizza() {
	}

	public CapricciosaPizza(double weight, String price, IPizzaIngredientsFactory abstractFactory) {
		setWeight(weight);
		setPrice(price);
		prepareIngredients(abstractFactory);
	}

	@Override
	public void serve() {
		System.out.println("CapricciosaPizza served. " + toString());
	}

	@Override
	public String toString() {
		return "CapricciosaPizza " + super.toString();
	}

}
