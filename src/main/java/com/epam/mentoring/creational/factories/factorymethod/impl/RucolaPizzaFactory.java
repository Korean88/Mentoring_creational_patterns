package com.epam.mentoring.creational.factories.factorymethod.impl;

import com.epam.mentoring.creational.factories.abstractfactory.impl.RucolaIngredientsFactory;
import com.epam.mentoring.creational.factories.abstractfactory.inf.IPizzaIngredientsFactory;
import com.epam.mentoring.creational.factories.factorymethod.inf.IPizzaFactoryMethod;
import com.epam.mentoring.creational.factories.pizza.AbstractPizza;
import com.epam.mentoring.creational.factories.pizza.PizzaSize;
import com.epam.mentoring.creational.factories.pizza.RucolaPizza;

public class RucolaPizzaFactory implements IPizzaFactoryMethod {
	
	private IPizzaIngredientsFactory rucolaIngredientsFactory = new RucolaIngredientsFactory();

	public AbstractPizza cook(PizzaSize size) {
		switch (size) {
		case SMALL:
			return new RucolaPizza(0.2d, "$5.99", rucolaIngredientsFactory);
		case MEDIUM:
			return new RucolaPizza(0.4d, "$7.99", rucolaIngredientsFactory);
		case LARGE:
			return new RucolaPizza(0.6d, "$9.99", rucolaIngredientsFactory);
		default:
			return null;
		}
	}
	
	

}
