package Creational.FactoryPatternHFS.pizzas.ConcreteProduct;

import Creational.FactoryPatternHFS.pizzas.AbstractProduct.Pizza;

public class CheesePizza extends Pizza {
	public CheesePizza() {
		name = "Cheese Pizza";
		dough = "Regular Crust";
		sauce = "Marinara Pizza Sauce";
		toppings.add("Fresh Mozzarella");
		toppings.add("Parmesan");
	}
}
