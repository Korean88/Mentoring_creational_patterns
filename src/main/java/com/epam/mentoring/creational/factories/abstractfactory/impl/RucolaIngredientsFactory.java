package com.epam.mentoring.creational.factories.abstractfactory.impl;

import com.epam.mentoring.creational.factories.abstractfactory.inf.IPizzaIngredientsFactory;
import com.epam.mentoring.creational.factories.abstractfactory.ingredients.AbstractCheese;
import com.epam.mentoring.creational.factories.abstractfactory.ingredients.AbstractDough;
import com.epam.mentoring.creational.factories.abstractfactory.ingredients.AbstractSauce;
import com.epam.mentoring.creational.factories.abstractfactory.ingredients.Cheddar;
import com.epam.mentoring.creational.factories.abstractfactory.ingredients.Pesto;
import com.epam.mentoring.creational.factories.abstractfactory.ingredients.ThinCrust;
import com.epam.mentoring.creational.factories.abstractfactory.ingredients.Toppings;

public class RucolaIngredientsFactory implements IPizzaIngredientsFactory {

	private static final String PIZZA_NAME = "Rucola Pizza";
	
	public AbstractCheese prepareCheese() {
		System.out.println("Preparing Cheddar cheese for " + PIZZA_NAME);
		return new Cheddar(PIZZA_NAME);
	}

	public AbstractDough prepareDough() {
		System.out.println("Preparing ThinCrust for " + PIZZA_NAME);
		return new ThinCrust(PIZZA_NAME);
	}

	public AbstractSauce prepareSauce() {
		System.out.println("Preparing Pesto sauce for " + PIZZA_NAME);
		return new Pesto(PIZZA_NAME);
	}

	public Toppings prepareToppings() {
		System.out.println("Prepare toppings for " + PIZZA_NAME);
		String[] products = new String[] {"cherry tomato", "rucola"};
		return new Toppings(products);
	}

}
