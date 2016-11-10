package Creational.Builder.tp;

import Creational.Builder.tp.ItemsConcrete.ChickenBurger;
import Creational.Builder.tp.ItemsConcrete.Coke;
import Creational.Builder.tp.ItemsConcrete.Pepsi;
import Creational.Builder.tp.ItemsConcrete.VegBurger;

public class MealBuilder {


    //here a step0 by step approach is used
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
