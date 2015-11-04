package FactoryPatternHFS.pizzafm.ConcreteCreator;

import FactoryPatternHFS.pizzafm.ConcreteProduct.ChicagoStyleCheesePizza;
import FactoryPatternHFS.pizzafm.ConcreteProduct.ChicagoStyleClamPizza;
import FactoryPatternHFS.pizzafm.ConcreteProduct.ChicagoStylePepperoniPizza;
import FactoryPatternHFS.pizzafm.ConcreteProduct.ChicagoStyleVeggiePizza;
import FactoryPatternHFS.pizzafm.Creator.PizzaStore;
import FactoryPatternHFS.pizzafm.Product.Pizza;

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
