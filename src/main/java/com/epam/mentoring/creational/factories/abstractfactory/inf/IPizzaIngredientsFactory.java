package com.epam.mentoring.creational.factories.abstractfactory.inf;

import com.epam.mentoring.creational.factories.abstractfactory.ingredients.AbstractCheese;
import com.epam.mentoring.creational.factories.abstractfactory.ingredients.AbstractDough;
import com.epam.mentoring.creational.factories.abstractfactory.ingredients.AbstractSauce;
import com.epam.mentoring.creational.factories.abstractfactory.ingredients.Toppings;

public interface IPizzaIngredientsFactory {
	
	AbstractCheese prepareCheese();
	
	AbstractDough prepareDough();
	
	AbstractSauce prepareSauce();
	
	Toppings prepareToppings();

}
