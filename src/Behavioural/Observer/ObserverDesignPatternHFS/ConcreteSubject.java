package Behavioural.Observer.ObserverDesignPatternHFS;

/**
 * Created by chetan on 2/11/15.
 */
import java.util.*;

class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    //collection of observer that needs to be called
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
        //obserevers are given concrete
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        //remove observer at index i
        if (i >= 0) {
            observers.remove(i);
        }
    }

    public void notifyObservers() {
        //all the observers are updated as per definition , so the properties values are changed
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }
//will be iused in the main class
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

}
