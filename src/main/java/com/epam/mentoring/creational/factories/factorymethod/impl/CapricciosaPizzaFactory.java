package com.epam.mentoring.creational.factories.factorymethod.impl;

import com.epam.mentoring.creational.factories.abstractfactory.impl.CapricciosaIngredientsFactory;
import com.epam.mentoring.creational.factories.abstractfactory.inf.IPizzaIngredientsFactory;
import com.epam.mentoring.creational.factories.factorymethod.inf.IPizzaFactoryMethod;
import com.epam.mentoring.creational.factories.pizza.AbstractPizza;
import com.epam.mentoring.creational.factories.pizza.CapricciosaPizza;
import com.epam.mentoring.creational.factories.pizza.PizzaSize;

public class CapricciosaPizzaFactory implements IPizzaFactoryMethod {
	
	private IPizzaIngredientsFactory capricciosaIngredientsFactory = new CapricciosaIngredientsFactory();

	public AbstractPizza cook(PizzaSize size) {
		switch (size) {
		case SMALL:
			return new CapricciosaPizza(0.3d, "$7.99", capricciosaIngredientsFactory);
		case MEDIUM:
			return new CapricciosaPizza(0.6d, "$12.99", capricciosaIngredientsFactory);
		case LARGE:
			return new CapricciosaPizza(0.9d, "$14.99", capricciosaIngredientsFactory);
		default:
			return null;
		}
	}

}
