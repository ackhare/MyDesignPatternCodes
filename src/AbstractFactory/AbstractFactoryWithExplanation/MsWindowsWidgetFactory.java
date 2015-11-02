package AbstractFactory.AbstractFactoryWithExplanation;

//ConcreteFactory1
public class MsWindowsWidgetFactory{
    //this factory creates an MSWindow object which is our concrete product object which is an entity in real //world that is a MS os,
    public Window createWindow(){
        MSWindow window = new MSWindow();
        return window;
    }
}
