package Decorator.DecoratorHFdesignpattern.ConcreteComponent;

import Decorator.DecoratorHFdesignpattern.Component.Beverage;

public class Espresso extends Beverage {
  
	public Espresso() {
		setDescription("Espresso");
	}
  
	public double cost() {
		return 1.99;
	}
}

