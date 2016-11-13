package Structural.Decorator.tp;

import Structural.Decorator.tp.Shape;

/**
 * Created by chetan on 13/11/16.
 */

//Like the adapter pattern here we see that as the adapter the decorator is also extending the
// class it has to decorate
//Here we also see that shape has been used as a compostion also which just symbolizes that
//
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;
//created constructor which have no use in instation but can be used when it is inherited as this one is

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }
//This essentially means that somewhere in future when the concrete class(RedShapeDecorator) of this is instantiated
// and this is called via the constructor of concrete class as has been done in main class


    //  Shape redCircle = new RedShapeDecorator(new Circle());
    // redCircle.draw();

    //when this draw is called in main class what java essentially writes i

    //Shape decoratedShape = new Circle()

    //So here we see we need shape at two points for completly diffrent purposes so shape has been used
    //in inheritance and composition
    //
    public void draw(){
        decoratedShape.draw();
    }
}