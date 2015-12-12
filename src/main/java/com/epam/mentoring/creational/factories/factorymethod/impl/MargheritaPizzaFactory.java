package com.epam.mentoring.creational.factories.factorymethod.impl;

import com.epam.mentoring.creational.factories.abstractfactory.impl.MargheritaIngredientsFactory;
import com.epam.mentoring.creational.factories.pizza.AbstractPizza;
import com.epam.mentoring.creational.factories.pizza.MargheritaPizza;
import com.epam.mentoring.creational.factories.pizza.PizzaSize;

public class MargheritaPizzaFactory extends PizzaFactoryMethod {

	public MargheritaPizzaFactory() {
		this.setAbstractFactory(new MargheritaIngredientsFactory());
	}

	@Override
	public AbstractPizza prepareBase(PizzaSize size) {
		switch (size) {
		case SMALL:
			return new MargheritaPizza(0.3d, "$5.99");
		case MEDIUM:
			return new MargheritaPizza(0.5d, "$8.99");
		case LARGE:
			return new MargheritaPizza(0.8d, "$12.99");
		default:
			return null;
		}
	}

}
