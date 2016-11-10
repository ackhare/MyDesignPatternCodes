package Creational.Builder.tp.ItemConcreteAbstract;

import Creational.Builder.tp.Item;
import Creational.Builder.tp.Packing;
import Creational.Builder.tp.PackingConcrete.Bottle;

/**
 * Created by chetan on 10/11/16.
 */
public abstract class ColdDrink implements Item {
    // Packing is associated with burger at highest possible abstract ness(ITEM interface)
    // level so that decoupling is best achieved
    //here it is to be noted that composition is used very effectively instead of interface
    //so a combination of composition and inheritance  is used
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}