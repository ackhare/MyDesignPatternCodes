package Structural.Decorator.DecoratorHFdesignpattern.DecoratorInterface;

import Structural.Decorator.DecoratorHFdesignpattern.Component.Beverage;

public abstract class CondimentDecorator extends Beverage {
	public Beverage beverage;
	public abstract String getDescription();
	
	public Beverage.Size getSize() {
		return beverage.getSize();
	}
}
