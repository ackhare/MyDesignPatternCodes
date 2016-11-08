package Creational.FactoryPatternHFS.pizzas.ConcreteProduct;

import Creational.FactoryPatternHFS.pizzas.AbstractProduct.Pizza;

public class VeggiePizza extends Pizza {
	public VeggiePizza() {
		super();
		name = "Veggie Pizza";
		dough = "Crust";
		sauce = "Marinara sauce";
		toppings.add("Shredded mozzarella");
		toppings.add("Grated parmesan");
		toppings.add("Diced onion");
		toppings.add("Sliced mushrooms");
		toppings.add("Sliced red pepper");
		toppings.add("Sliced black olives");
	}
}
