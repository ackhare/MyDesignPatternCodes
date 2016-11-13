package Structural.Facade.tp;

/**
 * Created by chetan on 13/11/16.
 */
public class FacadePatternDemo {
   public static void main(String[] args) {
      ShapeMaker shapeMaker = new ShapeMaker();
//here call is directly delegated to the facade which calls the concrete Shape class directly
      shapeMaker.drawCircle();
      shapeMaker.drawRectangle();
      //shapeMaker.drawSquare();
   }
}
/*
Inside Circle::draw() method.
Inside Rectangle::draw() method.

 */