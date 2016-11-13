package Behavioural.ChainOfResponsbility.tp;

import Behavioural.ChainOfResponsbility.tp.ConcreteLogger.ConsoleLogger;
import Behavioural.ChainOfResponsbility.tp.ConcreteLogger.ErrorLogger;
import Behavioural.ChainOfResponsbility.tp.ConcreteLogger.FileLogger;

/**
 * Created by chetan on 13/11/16.
 */
//Create different types of loggers. Assign them error levels and set next logger in each logger.
// Next logger in each logger represents the part of the chain.
public class ChainPatternDemo {

   private static AbstractLogger getChainOfLoggers(){

      AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
      AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
      AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

      errorLogger.setNextLogger(fileLogger);
      fileLogger.setNextLogger(consoleLogger);

      return errorLogger;
   }

   public static void main(String[] args) {
      AbstractLogger loggerChain = getChainOfLoggers();
       System.out.println("The logger class used is "+loggerChain.getClass());

       //here write method is called internally in log message
      loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
      loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");
      loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
   }
}
/*
output

class Behavioural.ChainOfResponsbility.tp.ConcreteLogger.ErrorLogger

Standard Console::Logger: This is an information.
File::Logger: This is an debug level information.
Standard Console::Logger: This is an debug level information.
Error Console::Logger: This is an error information.
File::Logger: This is an error information.
Standard Console::Logger: This is an error information.

Process finished with exit code 0
 */