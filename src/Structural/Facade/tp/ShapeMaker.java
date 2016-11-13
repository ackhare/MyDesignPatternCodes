package Structural.Facade.tp;


import Structural.Facade.tp.ConcreteShapes.Circle;
import Structural.Facade.tp.ConcreteShapes.Rectangle;

/**
 * Created by chetan on 13/11/16.
 */

//Important thing is that shapemaker is not a sub class but an independent class
// where the interfase which is to be made simple is plugged
//  This is the facade class
public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    //private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
       // square = new Square();
    }

    public void drawCircle(){
        //delegating calls
        //uses the instantiated object which is important
        //Here early instantion is used instead of instantiating in main as we saw in previous desgin pattern
        circle.draw();
    }
    public void drawRectangle(){
        rectangle.draw();
    }
//    public void drawSquare(){
//        square.draw();
//    }
}