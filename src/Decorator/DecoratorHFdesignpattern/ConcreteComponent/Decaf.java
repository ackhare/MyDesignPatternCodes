package Decorator.DecoratorHFdesignpattern.ConcreteComponent;

import Decorator.DecoratorHFdesignpattern.Component.Beverage;

public class Decaf extends Beverage {
	public Decaf() {
		setDescription("Decaf Coffee");
	}
 
	public double cost() {
		return 1.05;
	}
}

