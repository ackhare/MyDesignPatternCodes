package Creational.Builder.tp.ItemsConcrete;

import Creational.Builder.tp.ItemConcreteAbstract.ColdDrink;

/**
 * Created by chetan on 10/11/16.
 */
public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
}
