package Creational.Builder.tp.ItemsConcrete;

import Creational.Builder.tp.ItemConcreteAbstract.ColdDrink;

/**
 * Created by chetan on 10/11/16.
 */
public class Coke extends ColdDrink {

   @Override
   public float price() {
      return 30.0f;
   }

   @Override
   public String name() {
      return "Coke";
   }
}
