package Behavioural.ChainOfResponsbility.tp;

/**
 * Created by chetan on 13/11/16.
 */
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    //next element in chain or responsibility
    //Important to create any kind of chain you have tocompose yourself always and precisely that is done
    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger){
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message){
        if(this.level <= level){
            //Another important thing is that write is used directly though it is still abstract because this will
            // be given by main to concrete top abstract
            write(message);
        }
        //If be the need of nextlogger , so if setNextLogger is called then it is a indication that nextLogger will be used
        if(nextLogger !=null){
            nextLogger.logMessage(level, message);
        }
    }
//The concrete loggers can write on console or text so it is not present
    abstract protected void write(String message);

}
