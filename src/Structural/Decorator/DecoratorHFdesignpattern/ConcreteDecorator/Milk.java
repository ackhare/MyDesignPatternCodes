package Structural.Decorator.DecoratorHFdesignpattern.ConcreteDecorator;


import Structural.Decorator.DecoratorHFdesignpattern.Component.Beverage;
import Structural.Decorator.DecoratorHFdesignpattern.DecoratorInterface.CondimentDecorator;

public class Milk extends CondimentDecorator {
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	public double cost() {
		return beverage.cost() + .10;
	}
}
