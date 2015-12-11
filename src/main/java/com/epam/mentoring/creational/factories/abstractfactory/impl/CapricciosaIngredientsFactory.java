package com.epam.mentoring.creational.factories.abstractfactory.impl;

import com.epam.mentoring.creational.factories.abstractfactory.inf.IPizzaIngredientsFactory;
import com.epam.mentoring.creational.factories.abstractfactory.ingredients.AbstractCheese;
import com.epam.mentoring.creational.factories.abstractfactory.ingredients.AbstractDough;
import com.epam.mentoring.creational.factories.abstractfactory.ingredients.AbstractSauce;
import com.epam.mentoring.creational.factories.abstractfactory.ingredients.Cheddar;
import com.epam.mentoring.creational.factories.abstractfactory.ingredients.Salsa;
import com.epam.mentoring.creational.factories.abstractfactory.ingredients.ThickCrust;
import com.epam.mentoring.creational.factories.abstractfactory.ingredients.Toppings;

public class CapricciosaIngredientsFactory implements IPizzaIngredientsFactory {

	private static final String PIZZA_NAME = "Capricciosa Pizza";

	public AbstractCheese prepareCheese() {
		System.out.println("Preparing Cheddar cheese for " + PIZZA_NAME);
		return new Cheddar(PIZZA_NAME);
	}

	public AbstractDough prepareDough() {
		System.out.println("Preparing ThickCrust for " + PIZZA_NAME);
		return new ThickCrust(PIZZA_NAME);
	}

	public AbstractSauce prepareSauce() {
		System.out.println("Preparing Salsa sauce for " + PIZZA_NAME);
		return new Salsa(PIZZA_NAME);
	}

	public Toppings prepareToppings() {
		System.out.println("Prepare toppings for " + PIZZA_NAME);
		String[] products = new String[] { "ham", "mushrooms", "eggs", "artichokes", "rucola" };
		return new Toppings(products);
	}

}
