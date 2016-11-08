package Structural.Decorator.DecoratorHFdesignpattern.ConcreteDecorator;

import Structural.Decorator.DecoratorHFdesignpattern.Component.Beverage;
import Structural.Decorator.DecoratorHFdesignpattern.DecoratorInterface.CondimentDecorator;

public class Mocha extends CondimentDecorator {
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
 
	public double cost() {
		return beverage.cost() + .20;
	}
}
