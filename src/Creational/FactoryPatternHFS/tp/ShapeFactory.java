package Creational.FactoryPatternHFS.tp;

import Creational.AbstractFactory.tp.AbstractFactory;
import Creational.AbstractFactory.tp.Color;
import Creational.FactoryPatternHFS.tp.ConcreteShapes.Circle;
import Creational.FactoryPatternHFS.tp.ConcreteShapes.Rectangle;
import Creational.FactoryPatternHFS.tp.ConcreteShapes.Square;

/**
 * Created by chetan on 8/11/16.
 */
/*

 */
public class ShapeFactory {
//Create a Factory to generate object of concrete class based on given information.
   //use getShape method to get object of type shape
   public Shape getShape(String shapeType){
      if(shapeType == null){
         return null;
      }
      if(shapeType.equalsIgnoreCase("CIRCLE")){
         return new Circle();

      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();

      } else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new Square();
      }

      return null;
   }
}