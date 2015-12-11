package com.epam.mentoring.creational.factories.factorymethod.impl;

import com.epam.mentoring.creational.factories.abstractfactory.impl.MargheritaIngredientsFactory;
import com.epam.mentoring.creational.factories.abstractfactory.inf.IPizzaIngredientsFactory;
import com.epam.mentoring.creational.factories.factorymethod.inf.IPizzaFactoryMethod;
import com.epam.mentoring.creational.factories.pizza.AbstractPizza;
import com.epam.mentoring.creational.factories.pizza.MargheritaPizza;
import com.epam.mentoring.creational.factories.pizza.PizzaSize;

public class MargheritaPizzaFactory implements IPizzaFactoryMethod {

	private IPizzaIngredientsFactory margheritaIngredientsFactory = new MargheritaIngredientsFactory();

	public AbstractPizza cook(PizzaSize size) {
		switch (size) {
		case SMALL:
			return new MargheritaPizza(0.3d, "$5.99", margheritaIngredientsFactory);
		case MEDIUM:
			return new MargheritaPizza(0.5d, "$8.99", margheritaIngredientsFactory);
		case LARGE:
			return new MargheritaPizza(0.8d, "$12.99", margheritaIngredientsFactory);
		default:
			return null;
		}
	}

}
