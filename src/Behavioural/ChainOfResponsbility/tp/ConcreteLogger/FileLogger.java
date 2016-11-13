package Behavioural.ChainOfResponsbility.tp.ConcreteLogger;

import Behavioural.ChainOfResponsbility.tp.AbstractLogger;

/**
 * Created by chetan on 13/11/16.
 */
public class FileLogger extends AbstractLogger {

   public FileLogger(int level){
      this.level = level;
   }

   @Override
   protected void write(String message) {
      System.out.println("File::Logger: " + message);
   }
}


