package Structural.Decorator.DecoratorHFdesignpattern.ConcreteComponent;

import Structural.Decorator.DecoratorHFdesignpattern.Component.Beverage;

public class HouseBlend extends Beverage {
	public HouseBlend() {
		setDescription("House Blend Coffee");



	}
 
	public double cost() {
		return .89;
	}
}

