package Creational.FactoryMethod;

/**
 * Created by chetan on 26/9/15.
 */
//interface (Product)
interface Logger {
    public void log(String message);
}
//Next we'll create one ConcreteProduct named XMLLogger. Obviously, we would have many different loggers

//concrete implementation of the Logger (Product)
class XMLLogger implements Logger {
    public void log(String message) {
//log to xml
System.err.println("logging");
    }
}
//Next,we'll create our Creator, as a class with an abstract method that the concrete creator subclasses need to implement:

//the abstract Creator
abstract class AbstractLoggerCreator {
    //the factory method
    public abstract Logger createLogger();

    //the operations that are implemented for all LoggerCreators
//like anOperation() in our diagram
    public Logger getLogger() {
//depending on the subclass, we'll get a particular logger.
        Logger logger = createLogger();
//could do other operations on the logger here
        return logger;
    }
}

//The XMLLoggerCreator is our ConcreteCreator
//Concrete Creator
class XMLLoggerCreator extends AbstractLoggerCreator {

    public Logger createLogger() {
        XMLLogger logger = new XMLLogger();
        return logger;
    }
}

//        Here 's the client code to test drive our implementation of the pattern:
public class Main {
    private void someMethodThatLogs(AbstractLoggerCreator logCreator) {
        Logger logger = logCreator.createLogger();
        logger.log("message");
    }

    public static void main(String[] args) {
        //for the purposes of this example, create an XMLLoggerCreator directly
        //but this would normally be passed to constructor for use.
        AbstractLoggerCreator creator = new XMLLoggerCreator();
        Main client = new Main();
        client.someMethodThatLogs(creator);
    }
}

