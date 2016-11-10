package Creational.Prototype.tp.ConcreteShapes;


import Creational.Prototype.tp.Shape;

/**
 * Created by chetan on 8/11/16.
 */
public class Square extends Shape {

   public Square(){
     type = "Square";
   }

   @Override
   public void draw() {
      System.out.println("Inside Square::draw() method.");
   }
}
