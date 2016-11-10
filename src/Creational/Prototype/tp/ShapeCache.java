package Creational.Prototype.tp;

/**
 * Created by chetan on 10/11/16.
 */
import Creational.Prototype.tp.ConcreteShapes.Circle;
import Creational.Prototype.tp.ConcreteShapes.Rectangle;
import Creational.Prototype.tp.ConcreteShapes.Square;

import java.util.Hashtable;

public class ShapeCache {

   private static Hashtable<String, Shape> shapeMap  = new Hashtable<String, Shape>();

   public static Shape getShape(String shapeId) {

       //hashtable are like maps with key and value. Now when get is called via key i=t gives a value
       // which will be a concrete shape say rectangle
      //and then we can call shape method clone

       //A very important note of why abstract class is used is clone method is
      // common to all 3 but abstraction is a good thing
       //Now interface could not give body of clone
       //so in this case abstract class was a good choice
       Shape cachedShape = shapeMap.get(shapeId);
      return (Shape) cachedShape.clone();
   }

   // for each shape run database query and create shape
   // shapeMap.put(shapeKey, shape);
   // for example, we are adding three shapes

   public static void loadCache() {
      Circle circle = new Circle();
      circle.setId("1");
       //key and value through which it could be retrieved afterwards using that key
      shapeMap.put(circle.getId(),circle);

      Square square = new Square();
      square.setId("2");
      shapeMap.put(square.getId(),square);

      Rectangle rectangle = new Rectangle();
      rectangle.setId("3");
      shapeMap.put(rectangle.getId(), rectangle);
   }
}
