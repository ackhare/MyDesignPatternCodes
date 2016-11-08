package Creational.AbstractFactory.tp.ConcreteColor;

import Creational.AbstractFactory.tp.Color;

/**
 * Created by chetan on 8/11/16.
 */
public class Red implements Color {

   @Override
   public void fill() {
      System.out.println("Inside Red::fill() method.");
   }
}
