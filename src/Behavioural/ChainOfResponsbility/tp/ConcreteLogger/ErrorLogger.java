package Behavioural.ChainOfResponsbility.tp.ConcreteLogger;

import Behavioural.ChainOfResponsbility.tp.AbstractLogger;

/**
 * Created by chetan on 13/11/16.
 */
public class ErrorLogger extends AbstractLogger {

   public ErrorLogger(int level){
      this.level = level;
   }

   @Override
   protected void write(String message) {
      System.out.println("Error Console::Logger: " + message);
   }
}
