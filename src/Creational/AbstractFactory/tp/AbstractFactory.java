package Creational.AbstractFactory.tp;

/**
 * Created by chetan on 8/11/16.
 */
/*
Create an Abstract class to get factories for Color and Shape Objects.
 */
public abstract class AbstractFactory {
    //here an interface is passed to asectain that any thing implementing this can be taken
   abstract Color getColor(String color);
   abstract Shape getShape(String shape) ;
}
