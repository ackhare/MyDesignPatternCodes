package Creational.AbstractFactory.AbstractFactoryWithExplanation;

//Now we need to provide our factories. First we'll define our Creational.AbstractFactory. For this example, let's say they just create Windows:


// Next we need to provide ConcreteFactory implementations of these factories for our two operating systems. First for MS Windows:

//Finally we need a client to take advantage of all this functionality.
    //Client
    class GUIBuilder{
        //Here abstractwidgetfactory is actually abstract factory
        public void buildWindow(AbstractWidgetFactory widgetFactory){
            Window window = widgetFactory.createWindow();
            window.setTitle("New Window");
        }
    }
    //Of course, we need some way to specify which type of AbstractWidgetFactory to our GUIBuilder. This is usually done with a switch statement similar to the code below:
    public class AbstractFactoryWithExplanation{
        public static void main(String[] args){
            GUIBuilder builder = new GUIBuilder();
            AbstractWidgetFactory widgetFactory = null;
            //check what platform we're on
//            if(Platform.currentPlatform()=="MACOSX"){
//                widgetFactory  = new MacOSXWidgetFactory();
//            } else {
//                widgetFactory  = new MsWindowsWidgetFactory();
//            }
//buildwindow was  a methodd of client
            builder.buildWindow(widgetFactory);
        }
    }

//}
