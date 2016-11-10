package Creational.Builder.tp.PackingConcrete;

import Creational.Builder.tp.Packing;

/**
 * Created by chetan on 10/11/16.
 */
public class Wrapper implements Packing {

    @Override
    public String pack() {
        return "Wrapper";
    }
}