package Structural.Decorator.tp;

/**
 * Created by chetan on 13/11/16.
 */
public class RedShapeDecorator extends ShapeDecorator {

   public RedShapeDecorator(Shape decoratedShape) {
      super(decoratedShape);
   }

   @Override
   public void draw() {
       //This is coming from the constructor of abstract class ShapeDecorator
      decoratedShape.draw();

      //when this draw will be called in main class like
      //Shape redCircle = new RedShapeDecorator(new Circle());
      //redCircle.draw()
      //Here for like number 14 the circle will be placed in decoratedShape as the definition in abstract type
      //and circle's draw will be called
      //so till line number 14 no decoration has taken place and it tyakes place at below line

      //generally decoratror are implemented via setters
     //real decoration line
      setRedBorder(decoratedShape);
   }

   private void setRedBorder(Shape decoratedShape){
      System.out.println("Border Color: Red");
   }
}