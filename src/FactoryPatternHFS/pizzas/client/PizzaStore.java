package FactoryPatternHFS.pizzas.client;

import FactoryPatternHFS.pizzas.Factory.SimplePizzaFactory;
import FactoryPatternHFS.pizzas.AbstractProduct.Pizza;

public class PizzaStore {
	SimplePizzaFactory factory;
 
	public PizzaStore(SimplePizzaFactory factory) { 
		this.factory = factory;
	}
 
	public Pizza orderPizza(String type) {
		Pizza pizza;
 
		pizza = factory.createPizza(type);
 
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

}
