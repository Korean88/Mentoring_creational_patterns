package com.epam.mentoring.creational.factories.pizza;

public class RucolaPizza extends AbstractPizza {
	
	public RucolaPizza(double weight, String price) {
		super(weight, price);
	}

	@Override
	public String toString() {
		return "RucolaPizza " + super.toString();
	}

	@Override
	public void serve() {
		System.out.println("RucolaPizza served. " + toString());

	}

}
