package com.epam.mentoring.creational.factories.pizza;

public class CapricciosaPizza extends AbstractPizza {

	public CapricciosaPizza(double weight, String price) {
		super(weight, price);
	}

	@Override
	public void serve() {
		System.out.println("CapricciosaPizza served. " + toString());
	}

	@Override
	public String toString() {
		return "CapricciosaPizza " + super.toString();
	}

}
