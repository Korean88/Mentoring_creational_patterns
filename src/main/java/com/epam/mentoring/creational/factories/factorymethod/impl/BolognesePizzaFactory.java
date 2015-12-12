package com.epam.mentoring.creational.factories.factorymethod.impl;

import com.epam.mentoring.creational.factories.abstractfactory.impl.BologneseIngredientsFactory;
import com.epam.mentoring.creational.factories.pizza.AbstractPizza;
import com.epam.mentoring.creational.factories.pizza.BolognesePizza;
import com.epam.mentoring.creational.factories.pizza.PizzaSize;

public class BolognesePizzaFactory extends PizzaFactoryMethod {

	public BolognesePizzaFactory() {
		this.setAbstractFactory(new BologneseIngredientsFactory());
	}

	@Override
	public AbstractPizza prepareBase(PizzaSize size) {
		switch (size) {
		case SMALL:
			return new BolognesePizza(0.3d, "$8.99");
		case MEDIUM:
			return new BolognesePizza(0.5d, "$12.99");
		case LARGE:
			return new BolognesePizza(0.8d, "$15.99");
		default:
			return null;
		}
	}

}
