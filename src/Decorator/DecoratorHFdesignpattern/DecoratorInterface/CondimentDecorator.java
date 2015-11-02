package Decorator.DecoratorHFdesignpattern.DecoratorInterface;

import Decorator.DecoratorHFdesignpattern.Component.Beverage;
import Decorator.DecoratorHFdesignpattern.ConcreteComponent.*;

public abstract class CondimentDecorator extends Beverage {
	public Beverage beverage;
	public abstract String getDescription();
	
	public Beverage.Size getSize() {
		return beverage.getSize();
	}
}
