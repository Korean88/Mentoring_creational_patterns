package com.epam.mentoring.creational.factories.pizza;

public class BolognesePizza extends AbstractPizza {

	public BolognesePizza(double weight, String price) {
		super(weight, price);
	}

	@Override
	public String toString() {
		return "BolognesePizza " + super.toString();
	}

	@Override
	public void serve() {
		System.out.println("BolognesePizza served. "+ toString());
	}

}
