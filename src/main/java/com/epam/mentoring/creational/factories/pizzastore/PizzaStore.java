package com.epam.mentoring.creational.factories.pizzastore;

import com.epam.mentoring.creational.factories.factorymethod.impl.PizzaFactoryMethod;
import com.epam.mentoring.creational.factories.pizza.AbstractPizza;
import com.epam.mentoring.creational.factories.pizza.PizzaSize;

public class PizzaStore {
	
	private PizzaFactoryMethod factory;
	
	public PizzaStore(PizzaFactoryMethod factory) {
		this.factory = factory;
	}

	public void setFactory(PizzaFactoryMethod factory) {
		this.factory = factory;
	}

	public void order() {
		if (factory != null) {
			AbstractPizza smallPizza = factory.cook(PizzaSize.SMALL);
			smallPizza.serve();
			
			AbstractPizza mediumPizza = factory.cook(PizzaSize.MEDIUM);
			mediumPizza.serve();
			
			AbstractPizza largePizza = factory.cook(PizzaSize.LARGE);
			largePizza.serve();
		}
	}

}
