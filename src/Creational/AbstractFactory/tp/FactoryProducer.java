package Creational.AbstractFactory.tp;

/**
 * Created by chetan on 8/11/16.
 */
/*
Create a Factory generator/producer class to get factories
 by passing an information such as Shape or Color
 */
public class FactoryProducer {
   public static AbstractFactory getFactory(String choice){

      if(choice.equalsIgnoreCase("SHAPE")){
         return new ShapeFactory();

      }else if(choice.equalsIgnoreCase("COLOR")){
         return new ColorFactory();
      }

      return null;
   }
}