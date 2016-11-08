package Creational.AbstractFactory.AbstractFactoryWithExplanation;

//And one for Mac OSX
    //ConcreteProductA2
    public class MacOSXWindow implements Window{
        public void setTitle(String text){
            //Mac OSX specific behaviour
            System.out.println("I wwill set title");
        }
        public void repaint(){
            //Mac OSX specific behaviour
            System.out.println("I will repaint");
        }
    }
