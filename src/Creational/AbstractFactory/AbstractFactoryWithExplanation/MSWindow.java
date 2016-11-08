package Creational.AbstractFactory.AbstractFactoryWithExplanation;

//ConcreteProductA1
    public class MSWindow implements Window {
        public void setTitle(String text){
        //MS Windows specific behaviour
            System.out.println("I will set title");

        }
        public void repaint(){
            //MS Windows specific behaviour
            System.out.println("I will set title");
        }
    }
