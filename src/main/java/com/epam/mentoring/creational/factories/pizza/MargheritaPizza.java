package com.epam.mentoring.creational.factories.pizza;

public class MargheritaPizza extends AbstractPizza {
	
	public MargheritaPizza(double weight, String price) {
		super(weight, price);
	}

	@Override
	public String toString() {
		return "MargheritaPizza " + super.toString();
	}

	@Override
	public void serve() {
		System.out.println("MargheritaPizza served. " + toString());

	}

}
