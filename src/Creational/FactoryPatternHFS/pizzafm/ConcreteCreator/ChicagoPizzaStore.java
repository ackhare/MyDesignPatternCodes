package Creational.FactoryPatternHFS.pizzafm.ConcreteCreator;

import Creational.FactoryPatternHFS.pizzafm.ConcreteProduct.ChicagoStyleCheesePizza;
import Creational.FactoryPatternHFS.pizzafm.ConcreteProduct.ChicagoStyleClamPizza;
import Creational.FactoryPatternHFS.pizzafm.ConcreteProduct.ChicagoStylePepperoniPizza;
import Creational.FactoryPatternHFS.pizzafm.ConcreteProduct.ChicagoStyleVeggiePizza;
import Creational.FactoryPatternHFS.pizzafm.Creator.PizzaStore;
import Creational.FactoryPatternHFS.pizzafm.Product.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

	public Pizza createPizza(String item) {
        	if (item.equals("cheese")) {
            		return new ChicagoStyleCheesePizza();
        	} else if (item.equals("veggie")) {
        	    	return new ChicagoStyleVeggiePizza();
        	} else if (item.equals("clam")) {
        	    	return new ChicagoStyleClamPizza();
        	} else if (item.equals("pepperoni")) {
            		return new ChicagoStylePepperoniPizza();
        	} else return null;
	}
}
