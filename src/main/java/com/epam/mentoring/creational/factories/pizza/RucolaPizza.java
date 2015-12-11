package com.epam.mentoring.creational.factories.pizza;

import com.epam.mentoring.creational.factories.abstractfactory.inf.IPizzaIngredientsFactory;

public class RucolaPizza extends AbstractPizza {

	public RucolaPizza(double weight, String price, IPizzaIngredientsFactory abstractFactory) {
		setWeight(weight);
		setPrice(price);
		prepareIngredients(abstractFactory);
	}

	public RucolaPizza() {
	}
	
	@Override
	public String toString() {
		return "RucolaPizza " + super.toString();
	}

	@Override
	public void serve() {
		System.out.println("RucolaPizza served. " + toString());

	}

}
