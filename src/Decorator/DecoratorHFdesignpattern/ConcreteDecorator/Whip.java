package Decorator.DecoratorHFdesignpattern.ConcreteDecorator;

import Decorator.DecoratorHFdesignpattern.Component.Beverage;
import Decorator.DecoratorHFdesignpattern.DecoratorInterface.CondimentDecorator;

public class Whip extends CondimentDecorator {
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
 
	public double cost() {
		return beverage.cost() + .10;
	}
}
