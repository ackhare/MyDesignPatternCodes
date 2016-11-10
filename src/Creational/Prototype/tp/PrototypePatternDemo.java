package Creational.Prototype.tp;

/**
 * Created by chetan on 10/11/16.
 */
public class PrototypePatternDemo {
   public static void main(String[] args) {
       //in loadcache we put the records in a hashtable(map) as the hashmap was static it can be accessed
       // even from other method
       //Now hashmap ahs used as value Shape so it can be directly obtained
       //Hashtable<String, Shape> shapeMap  = new Hashtable<String, Shape>();

       ShapeCache.loadCache();

      Shape clonedShape = (Shape) ShapeCache.getShape("1");
      System.out.println("Shape : " + clonedShape.getType());

      Shape clonedShape2 = (Shape) ShapeCache.getShape("2");
      System.out.println("Shape : " + clonedShape2.getType());

      Shape clonedShape3 = (Shape) ShapeCache.getShape("3");
      System.out.println("Shape : " + clonedShape3.getType());
   }
}


/*
Creational.Prototype.tp.ConcreteShapes.Circle@1e69dff6
Shape : Circle
Creational.Prototype.tp.ConcreteShapes.Square@38ee9f13
Shape : Square
Creational.Prototype.tp.ConcreteShapes.Rectangle@3a0db598
Shape : Rectangle
 */