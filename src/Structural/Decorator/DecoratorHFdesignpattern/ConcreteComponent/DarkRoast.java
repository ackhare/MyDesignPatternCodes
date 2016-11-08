package Structural.Decorator.DecoratorHFdesignpattern.ConcreteComponent;

import Structural.Decorator.DecoratorHFdesignpattern.Component.Beverage;

public class DarkRoast extends Beverage {
	public DarkRoast() {
		setDescription("Dark Roast Coffee");
	}
 
	public double cost() {
		return .99;
	}
}

