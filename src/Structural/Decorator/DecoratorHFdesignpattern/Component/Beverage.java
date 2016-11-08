package Structural.Decorator.DecoratorHFdesignpattern.Component;

public abstract class Beverage {
	public enum Size { TALL, GRANDE, VENTI };
	Size size = Size.TALL;
	//Enum is used to giver a common interface and user will have less to remember
	//by default value
	String description = "Unknown Beverage";


	public String getDescription() {
		return description;
	}
	//yu need to use a method here as setDescription because in a
	// abstract class variable is not getting inherited but method gets inherited
	public void setDescription(String description) {
		this.description=description;
	}
	public void setSize(Size size) {
		this.size = size;
	}
	public Size getSize() {
		return this.size;
	}
 //abstract keyword needs to be given
	public abstract double cost();
}
