package com.epam.mentoring.creational.factories.factorymethod.impl;

import com.epam.mentoring.creational.factories.abstractfactory.impl.CapricciosaIngredientsFactory;
import com.epam.mentoring.creational.factories.pizza.AbstractPizza;
import com.epam.mentoring.creational.factories.pizza.CapricciosaPizza;
import com.epam.mentoring.creational.factories.pizza.PizzaSize;

public class CapricciosaPizzaFactory extends PizzaFactoryMethod {

	public  CapricciosaPizzaFactory() {
		this.setAbstractFactory(new CapricciosaIngredientsFactory());
	}

	@Override
	public AbstractPizza prepareBase(PizzaSize size) {
		switch (size) {
		case SMALL:
			return new CapricciosaPizza(0.3d, "$7.99");
		case MEDIUM:
			return new CapricciosaPizza(0.6d, "$12.99");
		case LARGE:
			return new CapricciosaPizza(0.9d, "$14.99");
		default:
			return null;
		}
	}

}
