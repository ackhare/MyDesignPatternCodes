package Behavioural.StrategyDP.tp.Context;
import Behavioural.StrategyDP.tp.StrategyI;

/**
 * Created by chetan on 8/11/16.
 */
public class Context {
   private StrategyI strategy;

   public Context(StrategyI strategy){
      this.strategy = strategy;
   }

   /*
   So in context we through composition had the object of an interface
   so as it is an interface when context is called in main method where

   the core is happening of changing algorithm at run thime
   WE pass the desired concrete implementation of startegy
    */


   public int executeStrategy(int num1, int num2){
      return strategy.doOperation(num1, num2);
   }
}
