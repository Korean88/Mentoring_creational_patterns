package com.epam.mentoring.creational.factories.factorymethod.impl;

import com.epam.mentoring.creational.factories.abstractfactory.inf.IPizzaIngredientsFactory;
import com.epam.mentoring.creational.factories.abstractfactory.ingredients.Ingredient;
import com.epam.mentoring.creational.factories.pizza.AbstractPizza;
import com.epam.mentoring.creational.factories.pizza.PizzaSize;

public abstract class PizzaFactoryMethod {
	
	private IPizzaIngredientsFactory abstractFactory;

	public IPizzaIngredientsFactory getAbstractFactory() {
		return abstractFactory;
	}

	public void setAbstractFactory(IPizzaIngredientsFactory abstractFactory) {
		this.abstractFactory = abstractFactory;
	}

	public AbstractPizza cook(PizzaSize size) {
		AbstractPizza pizza = prepareBase(size);
		Ingredient[] ingredients = new Ingredient[] { 
				abstractFactory.prepareDough(), 
				abstractFactory.prepareCheese(),
				abstractFactory.prepareSauce(), 
				abstractFactory.prepareToppings() 
		};
		pizza.setIngredients(ingredients);
		return pizza;
	}
	
	public abstract AbstractPizza prepareBase(PizzaSize size);

}
