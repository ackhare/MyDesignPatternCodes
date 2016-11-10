package Creational.Builder.tp.ItemsConcrete;

import Creational.Builder.tp.ItemConcreteAbstract.Burger;

/**
 * Created by chetan on 10/11/16.
 */
public class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 50.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}