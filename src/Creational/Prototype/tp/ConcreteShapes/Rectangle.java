package Creational.Prototype.tp.ConcreteShapes;


import Creational.Prototype.tp.Shape;

/**
 * Created by chetan on 8/11/16.
 */
public class Rectangle extends Shape {

   public Rectangle(){
     type = "Rectangle";
   }

   @Override
   public void draw() {
      System.out.println("Inside Rectangle::draw() method.");
   }
}
