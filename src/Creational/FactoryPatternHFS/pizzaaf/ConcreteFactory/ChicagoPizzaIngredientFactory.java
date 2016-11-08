package Creational.FactoryPatternHFS.pizzaaf.ConcreteFactory;

import Creational.FactoryPatternHFS.pizzaaf.ConcreteProduct.*;
import Creational.FactoryPatternHFS.pizzaaf.Factory.PizzaIngredientFactory;
import Creational.FactoryPatternHFS.pizzaaf.Product.*;

public class ChicagoPizzaIngredientFactory
	implements PizzaIngredientFactory
{

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new BlackOlives(),
		                      new Spinach(),
		                      new Eggplant() };
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FrozenClams();
	}
}
