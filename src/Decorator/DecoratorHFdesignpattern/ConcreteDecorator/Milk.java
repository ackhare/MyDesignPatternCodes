package Decorator.DecoratorHFdesignpattern.ConcreteDecorator;


import Decorator.DecoratorHFdesignpattern.Component.Beverage;
import Decorator.DecoratorHFdesignpattern.DecoratorInterface.CondimentDecorator;

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
