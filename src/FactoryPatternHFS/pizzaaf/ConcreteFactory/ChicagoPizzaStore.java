package FactoryPatternHFS.pizzaaf.ConcreteFactory;

import FactoryPatternHFS.pizzaaf.ConcreteProduct.CheesePizza;
import FactoryPatternHFS.pizzaaf.ConcreteProduct.ClamPizza;
import FactoryPatternHFS.pizzaaf.ConcreteProduct.PepperoniPizza;
import FactoryPatternHFS.pizzaaf.ConcreteProduct.VeggiePizza;
import FactoryPatternHFS.pizzaaf.Product.Pizza;
import FactoryPatternHFS.pizzaaf.Factory.PizzaIngredientFactory;
import FactoryPatternHFS.pizzaaf.Factory.PizzaStore;


public class ChicagoPizzaStore extends PizzaStore {

	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory =
		new ChicagoPizzaIngredientFactory();

		if (item.equals("cheese")) {

			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");

		} else if (item.equals("veggie")) {

			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Chicago Style Veggie Pizza");

		} else if (item.equals("clam")) {

			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago Style Clam Pizza");

		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("Chicago Style Pepperoni Pizza");

		}
		return pizza;
	}
}
