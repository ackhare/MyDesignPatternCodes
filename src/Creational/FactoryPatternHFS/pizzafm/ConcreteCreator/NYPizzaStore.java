package Creational.FactoryPatternHFS.pizzafm.ConcreteCreator;

import Creational.FactoryPatternHFS.pizzafm.Creator.PizzaStore;
import Creational.FactoryPatternHFS.pizzafm.ConcreteProduct.NYStyleCheesePizza;
import Creational.FactoryPatternHFS.pizzafm.ConcreteProduct.NYStyleClamPizza;
import Creational.FactoryPatternHFS.pizzafm.ConcreteProduct.NYStylePepperoniPizza;
import Creational.FactoryPatternHFS.pizzafm.ConcreteProduct.NYStyleVeggiePizza;
import Creational.FactoryPatternHFS.pizzafm.Product.Pizza;

public class NYPizzaStore extends PizzaStore {

	public Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new NYStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else return null;
	}
}
