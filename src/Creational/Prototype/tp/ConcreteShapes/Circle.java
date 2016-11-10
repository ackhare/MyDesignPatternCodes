package Creational.Prototype.tp.ConcreteShapes;


import Creational.Prototype.tp.Shape;

/**
 * Created by chetan on 8/11/16.
 */
public class Circle extends Shape {


   public Circle(){
     type = "Circle";
   }

   @Override
   public void draw() {
      System.out.println("Inside Circle::draw() method.");
   }
}
