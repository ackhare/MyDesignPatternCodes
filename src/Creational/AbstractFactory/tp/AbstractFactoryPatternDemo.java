package Creational.AbstractFactory.tp;

/**
 * Created by chetan on 8/11/16.
 */
/*
Use the FactoryProducer to get AbstractFactory in order to get
factories of concrete classes by passing an information such as type.

AbstractFactoryPatternDemo, our demo class uses FactoryProducer to get a AbstractFactory object.
 It will pass
information (CIRCLE / RECTANGLE / SQUARE for Shape) to AbstractFactory to get the type of object
 it needs. It also
passes information (RED / GREEN / BLUE for Color) to AbstractFactory to get the type of object
it needs.
 */
public class AbstractFactoryPatternDemo {
   public static void main(String[] args) {

      //get shape factory
      AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
//Because of the extra layer added by AbstractFactory we do not have use new in above line and
//and we can see that we get an object of abstract AbstractFactory


/*
So here RHS of above produces an instance of ShapeFactory which can be fitted into LHS which is abstract
but the point is to note
that abstract container takes the information with in a context and keeps it and it decides which getShapo has to be called
 */

      //get an object of Shape Circle
      Shape shape1 = shapeFactory.getShape("CIRCLE");

      //call draw method of Shape Circle
      shape1.draw();

      //get an object of Shape Rectangle
      Shape shape2 = shapeFactory.getShape("RECTANGLE");

      //call draw method of Shape Rectangle
      shape2.draw();

      //get an object of Shape Square
      Shape shape3 = shapeFactory.getShape("SQUARE");

      //call draw method of Shape Square
      shape3.draw();

      //get color factory
      AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

      //get an object of Color Red
      Color color1 = colorFactory.getColor("RED");

      //call fill method of Red
      color1.fill();

      //get an object of Color Green
      Color color2 = colorFactory.getColor("Green");

      //call fill method of Green
      color2.fill();

      //get an object of Color Blue
      Color color3 = colorFactory.getColor("BLUE");

      //call fill method of Color Blue
      color3.fill();
   }
}

/*

output is

Inside Circle::draw() method.
Inside Rectangle::draw() method.
Inside Square::draw() method.
Inside Red::fill() method.
Inside Green::fill() method.
Inside Blue::fill() method.

 */