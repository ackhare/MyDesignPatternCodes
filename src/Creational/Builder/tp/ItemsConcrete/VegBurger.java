package Creational.Builder.tp.ItemsConcrete;

import Creational.Builder.tp.ItemConcreteAbstract.Burger;

/**
 * Created by chetan on 10/11/16.
 */
public class VegBurger extends Burger {

   @Override
   public float price() {
      return 25.0f;
   }

   @Override
   public String name() {
      return "Veg Burger";
   }
}