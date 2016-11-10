package Creational.AbstractFactory.tp;

import Creational.AbstractFactory.tp.AbstractFactory;
import Creational.AbstractFactory.tp.Color;
import Creational.AbstractFactory.tp.ConcreteColor.Blue;
import Creational.AbstractFactory.tp.ConcreteColor.Green;
import Creational.AbstractFactory.tp.ConcreteColor.Red;
import Creational.AbstractFactory.tp.Shape;

/**
 * Created by chetan on 8/11/16.
 */
/*
/*
Create Factory classes extending AbstractFactory to generate object of concrete
class based on given information.
 */

public class ColorFactory extends AbstractFactory {

    //because it is a colorfactory it should not really go to the extent of cgetting object of Shape
   @Override
   public Shape getShape(String shapeType){
      return null;
   }

   @Override
   //Now any color can be fitted
   public Color getColor(String color) {

      if(color == null){
         return null;
      }

      if(color.equalsIgnoreCase("RED")){
         return new Red();

      }else if(color.equalsIgnoreCase("GREEN")){
         return new Green();

      }else if(color.equalsIgnoreCase("BLUE")){
         return new Blue();
      }

      return null;
   }
}
