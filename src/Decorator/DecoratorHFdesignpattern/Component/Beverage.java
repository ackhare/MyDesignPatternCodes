package Decorator.DecoratorHFdesignpattern.Component;

public abstract class Beverage {
	public enum Size { TALL, GRANDE, VENTI };
	Size size = Size.TALL;
	//Enum is used to giver a common interface and user will have less to remember
	//by default value
	String description = "Unknown Beverage";


	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description=description;
	}
	public void setSize(Size size) {
		this.size = size;
	}
	public Size getSize() {
		return this.size;
	}
 
	public abstract double cost();
}
