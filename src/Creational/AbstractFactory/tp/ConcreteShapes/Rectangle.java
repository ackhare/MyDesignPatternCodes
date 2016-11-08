package Creational.AbstractFactory.tp.ConcreteShapes;

import Creational.AbstractFactory.tp.Shape;

/**
 * Created by chetan on 8/11/16.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
