package com.epam.mentoring.creational.factories.pizza;

import com.epam.mentoring.creational.factories.abstractfactory.inf.IPizzaIngredientsFactory;

public class BolognesePizza extends AbstractPizza {

	public BolognesePizza(double weight, String price, IPizzaIngredientsFactory abstractFactory) {
		setWeight(weight);
		setPrice(price);
		prepareIngredients(abstractFactory);
	}
	
	public BolognesePizza() {
	}

	@Override
	public String toString() {
		return "BolognesePizza " + super.toString();
	}

	@Override
	public void serve() {
		System.out.println("BolognesePizza served. "+ toString());
	}

}
