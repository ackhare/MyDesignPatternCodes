package Creational.AbstractFactory.tp.ConcreteColor;

import Creational.AbstractFactory.tp.Color;

/**
 * Created by chetan on 8/11/16.
 */
public class Green implements Color {

   @Override
   public void fill() {
      System.out.println("Inside Green::fill() method.");
   }
}
