package Behavioural.Observer.ObserverDesignPatternHFS;
//Concrete observer
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private Subject weatherData;
	//so in main if we call it with the weather data  which is a subject(when called setMeasurment)
	// and it will get changed as we see in main setmeasiurment
	//So by this.weatherData we change to current subject to call so that we can registr the observer sop that further things could be done
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}
}
