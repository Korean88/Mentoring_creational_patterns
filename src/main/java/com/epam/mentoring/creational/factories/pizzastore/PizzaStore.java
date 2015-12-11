package com.epam.mentoring.creational.factories.pizzastore;

import com.epam.mentoring.creational.factories.factorymethod.inf.IPizzaFactoryMethod;
import com.epam.mentoring.creational.factories.pizza.AbstractPizza;
import com.epam.mentoring.creational.factories.pizza.PizzaSize;

public class PizzaStore {
	
	private IPizzaFactoryMethod factory;
	
	public PizzaStore(IPizzaFactoryMethod factory) {
		this.factory = factory;
	}

	public void setFactory(IPizzaFactoryMethod factory) {
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
