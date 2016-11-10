package Creational.FactoryPatternHFS.tp.ConcreteShapes;

import Creational.FactoryPatternHFS.tp.Shape;

/**
 * Created by chetan on 8/11/16.
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
