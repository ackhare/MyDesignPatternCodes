package Creational.AbstractFactory.tp.ConcreteColor;

import Creational.AbstractFactory.tp.Color;

/**
 * Created by chetan on 8/11/16.
 */
public class Blue implements Color {

   @Override
   public void fill() {
      System.out.println("Inside Blue::fill() method.");
   }
}