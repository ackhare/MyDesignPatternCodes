package Structural.Decorator.tp;

import Structural.Decorator.tp.ConcreteShapes.Circle;
import Structural.Decorator.tp.ConcreteShapes.Rectangle;

/**
 * Created by chetan on 13/11/16.
 */
public class DecoratorPatternDemo {
    public static void main(String[] args) {

        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
/*
Circle with normal border
Inside Circle::draw() method.

Circle of red border
Inside Circle::draw() method.
Border Color: Red

Rectangle of red border
Inside Rectangle::draw() method.
Border Color: Red

 */