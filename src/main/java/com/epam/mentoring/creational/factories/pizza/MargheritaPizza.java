package com.epam.mentoring.creational.factories.pizza;

import com.epam.mentoring.creational.factories.abstractfactory.inf.IPizzaIngredientsFactory;

public class MargheritaPizza extends AbstractPizza {

	public MargheritaPizza(double weight, String price, IPizzaIngredientsFactory abstractFactory) {
		setWeight(weight);
		setPrice(price);
		prepareIngredients(abstractFactory);
	}

	public MargheritaPizza() {
	}
	
	@Override
	public String toString() {
		return "MargheritaPizza " + super.toString();
	}

	@Override
	public void serve() {
		System.out.println("MargheritaPizza served. " + toString());

	}

}
