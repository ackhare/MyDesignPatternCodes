package Structural.Decorator.DecoratorHFdesignpattern.ConcreteComponent;

import Structural.Decorator.DecoratorHFdesignpattern.Component.Beverage;

public class Espresso extends Beverage {
  
	public Espresso() {
		setDescription("Espresso");
	}
  
	public double cost() {
		return 1.99;
	}
}

