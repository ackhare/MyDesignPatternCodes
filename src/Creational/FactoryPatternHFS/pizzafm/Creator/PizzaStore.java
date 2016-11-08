package Creational.FactoryPatternHFS.pizzafm.Creator;

import Creational.FactoryPatternHFS.pizzafm.Product.Pizza;

public abstract class PizzaStore {
 
	abstract public Pizza createPizza(String item);
 
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
