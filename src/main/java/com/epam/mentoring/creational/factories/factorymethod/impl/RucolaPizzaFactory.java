package com.epam.mentoring.creational.factories.factorymethod.impl;

import com.epam.mentoring.creational.factories.abstractfactory.impl.RucolaIngredientsFactory;
import com.epam.mentoring.creational.factories.pizza.AbstractPizza;
import com.epam.mentoring.creational.factories.pizza.PizzaSize;
import com.epam.mentoring.creational.factories.pizza.RucolaPizza;

public class RucolaPizzaFactory extends PizzaFactoryMethod {

	public RucolaPizzaFactory() {
		this.setAbstractFactory(new RucolaIngredientsFactory());
	}

	@Override
	public AbstractPizza prepareBase(PizzaSize size) {
		switch (size) {
		case SMALL:
			return new RucolaPizza(0.2d, "$5.99");
		case MEDIUM:
			return new RucolaPizza(0.4d, "$7.99");
		case LARGE:
			return new RucolaPizza(0.6d, "$9.99");
		default:
			return null;
		}
	}
	
	

}
