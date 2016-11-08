package Creational.AbstractFactory.AbstractFactoryWithExplanation;

//And for MacOSX:
    //ConcreteFactory2
    public class MacOSXWidgetFactory{
        //create a MacOSXWindow
        public Window createWindow(){
            MacOSXWindow window = new MacOSXWindow();
            return window;
        }
    }
