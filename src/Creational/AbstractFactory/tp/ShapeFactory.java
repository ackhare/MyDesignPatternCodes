package Creational.AbstractFactory.tp;

import Creational.AbstractFactory.tp.ConcreteShapes.Circle;
import Creational.AbstractFactory.tp.ConcreteShapes.Rectangle;
import Creational.AbstractFactory.tp.ConcreteShapes.Square;

/**
 * Created by chetan on 8/11/16.
 */
/*
Create Factory classes extending AbstractFactory to generate object of concrete
class based on given information.
 */
public class ShapeFactory extends AbstractFactory {

   @Override
   public Shape getShape(String shapeType){

      if(shapeType == null){
         return null;
      }

      if(shapeType.equalsIgnoreCase("CIRCLE")){
         return new Circle();

      }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();

      }else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new Square();
      }

      return null;
   }

   @Override
   Color getColor(String color) {
      return null;
   }
}