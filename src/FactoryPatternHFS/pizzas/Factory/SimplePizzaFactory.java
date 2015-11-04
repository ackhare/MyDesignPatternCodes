package FactoryPatternHFS.pizzas.Factory;

import FactoryPatternHFS.pizzas.AbstractProduct.Pizza;
import FactoryPatternHFS.pizzas.ConcreteProduct.CheesePizza;
import FactoryPatternHFS.pizzas.ConcreteProduct.ClamPizza;
import FactoryPatternHFS.pizzas.ConcreteProduct.PepperoniPizza;
import FactoryPatternHFS.pizzas.ConcreteProduct.VeggiePizza;

public class SimplePizzaFactory {

	public Pizza createPizza(String type) {
		Pizza pizza = null;

		if (type.equals("cheese")) {
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza();
		} else if (type.equals("clam")) {
			pizza = new ClamPizza();
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza();
		}
		return pizza;
	}
}
