package Creational.FactoryPatternHFS.pizzas.Factory;

import Creational.FactoryPatternHFS.pizzas.AbstractProduct.Pizza;
import Creational.FactoryPatternHFS.pizzas.ConcreteProduct.CheesePizza;
import Creational.FactoryPatternHFS.pizzas.ConcreteProduct.ClamPizza;
import Creational.FactoryPatternHFS.pizzas.ConcreteProduct.PepperoniPizza;
import Creational.FactoryPatternHFS.pizzas.ConcreteProduct.VeggiePizza;

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
