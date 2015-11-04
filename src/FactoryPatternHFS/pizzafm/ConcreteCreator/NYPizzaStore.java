package FactoryPatternHFS.pizzafm.ConcreteCreator;

import FactoryPatternHFS.pizzafm.Creator.PizzaStore;
import FactoryPatternHFS.pizzafm.ConcreteProduct.NYStyleCheesePizza;
import FactoryPatternHFS.pizzafm.ConcreteProduct.NYStyleClamPizza;
import FactoryPatternHFS.pizzafm.ConcreteProduct.NYStylePepperoniPizza;
import FactoryPatternHFS.pizzafm.ConcreteProduct.NYStyleVeggiePizza;
import FactoryPatternHFS.pizzafm.Product.Pizza;

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
