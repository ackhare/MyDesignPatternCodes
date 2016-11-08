package Creational.FactoryPatternHFS.pizzaaf.ConcreteFactory;

import Creational.FactoryPatternHFS.pizzaaf.ConcreteProduct.CheesePizza;
import Creational.FactoryPatternHFS.pizzaaf.ConcreteProduct.ClamPizza;
import Creational.FactoryPatternHFS.pizzaaf.ConcreteProduct.PepperoniPizza;
import Creational.FactoryPatternHFS.pizzaaf.ConcreteProduct.VeggiePizza;
import Creational.FactoryPatternHFS.pizzaaf.Product.Pizza;
import Creational.FactoryPatternHFS.pizzaaf.Factory.PizzaIngredientFactory;
import Creational.FactoryPatternHFS.pizzaaf.Factory.PizzaStore;


public class NYPizzaStore extends PizzaStore {
 
	protected Pizza createPizza(String item) {
		Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory =
			new NYPizzaIngredientFactory();
 
		if (item.equals("cheese")) {
  
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
  
		} else if (item.equals("veggie")) {
 
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("New York Style Veggie Pizza");
 
		} else if (item.equals("clam")) {
 
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
 
		} else if (item.equals("pepperoni")) {

			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");
 
		} 
		return pizza;
	}
}
