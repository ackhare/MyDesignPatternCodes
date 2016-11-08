package Behavioural.Observer.ObserverDesignPatternWithInbuiltObserverClass.ConcreteDisplayElemnt;

import Behavioural.Observer.ObserverDesignPatternWithInbuiltObserverClass.DisplayElement;
import Behavioural.Observer.ObserverDesignPatternWithInbuiltObserverClass.ConcreteSubject.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    Observable observable;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();

            //this is important so that display is called so it gets called as event happens instyead odf calling it seperately
            display();
        }
    }

    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }
}
