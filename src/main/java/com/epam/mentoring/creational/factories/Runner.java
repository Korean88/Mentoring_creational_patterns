package com.epam.mentoring.creational.factories;

import com.epam.mentoring.creational.factories.factorymethod.impl.BolognesePizzaFactory;
import com.epam.mentoring.creational.factories.factorymethod.impl.CapricciosaPizzaFactory;
import com.epam.mentoring.creational.factories.factorymethod.impl.MargheritaPizzaFactory;
import com.epam.mentoring.creational.factories.factorymethod.impl.PizzaFactoryMethod;
import com.epam.mentoring.creational.factories.factorymethod.impl.RucolaPizzaFactory;
import com.epam.mentoring.creational.factories.pizzastore.PizzaStore;

public class Runner {
	
	public static void main(String[] args) {
		PizzaFactoryMethod bologneseFactory = new BolognesePizzaFactory();
		PizzaFactoryMethod capricciosaFactory = new CapricciosaPizzaFactory();
		PizzaFactoryMethod margheritaFactory = new MargheritaPizzaFactory();
		PizzaFactoryMethod rucolaFactory = new RucolaPizzaFactory();
		
		PizzaStore pizzaStore = new PizzaStore(bologneseFactory);
		pizzaStore.order();
		
		pizzaStore.setFactory(capricciosaFactory);
		pizzaStore.order();
		
		pizzaStore.setFactory(margheritaFactory);
		pizzaStore.order();
		
		pizzaStore.setFactory(rucolaFactory);
		pizzaStore.order();
	}

}
