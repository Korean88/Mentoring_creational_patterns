package com.epam.mentoring.creational.factories.abstractfactory.impl;

import com.epam.mentoring.creational.factories.abstractfactory.inf.IPizzaIngredientsFactory;
import com.epam.mentoring.creational.factories.abstractfactory.ingredients.AbstractCheese;
import com.epam.mentoring.creational.factories.abstractfactory.ingredients.AbstractDough;
import com.epam.mentoring.creational.factories.abstractfactory.ingredients.AbstractSauce;
import com.epam.mentoring.creational.factories.abstractfactory.ingredients.Mozzarella;
import com.epam.mentoring.creational.factories.abstractfactory.ingredients.Salsa;
import com.epam.mentoring.creational.factories.abstractfactory.ingredients.ThinCrust;
import com.epam.mentoring.creational.factories.abstractfactory.ingredients.Toppings;

public class MargheritaIngredientsFactory implements IPizzaIngredientsFactory {
	
	private static final String PIZZA_NAME = "Margherita Pizza";

	public AbstractCheese prepareCheese() {
		System.out.println("Preparing Mozzarella cheese for " + PIZZA_NAME);
		return new Mozzarella(PIZZA_NAME);
	}

	public AbstractDough prepareDough() {
		System.out.println("Preparing ThinCrust for " + PIZZA_NAME);
		return new ThinCrust(PIZZA_NAME);
	}

	public AbstractSauce prepareSauce() {
		System.out.println("Preparing Salsa sauce for " + PIZZA_NAME);
		return new Salsa(PIZZA_NAME);
	}

	public Toppings prepareToppings() {
		System.out.println("Prepare toppings for " + PIZZA_NAME);
		String[] products = new String[] { "garlic", "tomato", "basil", "pepper" };
		return new Toppings(products);
	}

}
