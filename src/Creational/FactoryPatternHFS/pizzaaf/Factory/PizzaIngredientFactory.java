package Creational.FactoryPatternHFS.pizzaaf.Factory;

import Creational.FactoryPatternHFS.pizzaaf.Product.*;

public interface PizzaIngredientFactory {
 
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
 
}
