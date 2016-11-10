package Creational.AbstractFactory.tp;

/**
 * Created by chetan on 8/11/16.
 */
/*
Create a Factory generator/producer class to get factories
 by passing an information such as Shape or Color
 */
public class FactoryProducer {

    //so here a one more level of abstraction is created
    //via abstract factory impl factories could be obtained
    //but A factory provider is given

    //Now when we think about it
    //suppose we have to get shapefactory

    //Now the only way to get it is by intialiaztion via new or some decoration in shapefactory
    //so that it returns abstract factory by which we can can getshape and use it

    //but it can really produce a more complex issue so we produce a layer to reduce complexity
    //which is this class called FactoryProducer


   public static AbstractFactory getFactory(String choice){

      if(choice.equalsIgnoreCase("SHAPE")){
         return new ShapeFactory();

      }else if(choice.equalsIgnoreCase("COLOR")){
         return new ColorFactory();
      }

      return null;
   }
}