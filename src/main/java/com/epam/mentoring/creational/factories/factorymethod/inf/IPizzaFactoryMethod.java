package com.epam.mentoring.creational.factories.factorymethod.inf;

import com.epam.mentoring.creational.factories.pizza.AbstractPizza;
import com.epam.mentoring.creational.factories.pizza.PizzaSize;

public interface IPizzaFactoryMethod {
	
	AbstractPizza cook(PizzaSize size);

}
