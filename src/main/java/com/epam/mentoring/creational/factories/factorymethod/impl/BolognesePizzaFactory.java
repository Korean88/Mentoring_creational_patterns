package com.epam.mentoring.creational.factories.factorymethod.impl;

import com.epam.mentoring.creational.factories.abstractfactory.impl.BologneseIngredientsFactory;
import com.epam.mentoring.creational.factories.abstractfactory.inf.IPizzaIngredientsFactory;
import com.epam.mentoring.creational.factories.factorymethod.inf.IPizzaFactoryMethod;
import com.epam.mentoring.creational.factories.pizza.AbstractPizza;
import com.epam.mentoring.creational.factories.pizza.BolognesePizza;
import com.epam.mentoring.creational.factories.pizza.PizzaSize;

public class BolognesePizzaFactory implements IPizzaFactoryMethod {
	
	private IPizzaIngredientsFactory bologneseIngredientsFactory = new BologneseIngredientsFactory();

	public AbstractPizza cook(PizzaSize size) {
		switch (size) {
		case SMALL:
			return new BolognesePizza(0.3d, "$8.99", bologneseIngredientsFactory);
		case MEDIUM:
			return new BolognesePizza(0.5d, "$12.99", bologneseIngredientsFactory);
		case LARGE:
			return new BolognesePizza(0.8d, "$15.99", bologneseIngredientsFactory);
		default:
			return null;
		}
	}

}
