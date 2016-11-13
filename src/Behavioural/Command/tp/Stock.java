package Behavioural.Command.tp;

/**
 * Created by chetan on 13/11/16.
 */
//request class
    //This is an independent class which is used by main clasas
    //It can be termed as a class on which the commands are actually executed
    //This can only be used by composing because neither logically nor conceptually it has a subclass
public class Stock {

   private String name = "ABC";
   private int quantity = 10;

   public void buy(){
      System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
   }
   public void sell(){
      System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
   }
}