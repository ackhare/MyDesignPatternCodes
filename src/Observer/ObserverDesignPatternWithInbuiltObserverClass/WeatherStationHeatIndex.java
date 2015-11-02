package Observer.ObserverDesignPatternWithInbuiltObserverClass;

import Observer.ObserverDesignPatternWithInbuiltObserverClass.ConcreteDisplayElemnt.CurrentConditionsDisplay;
import Observer.ObserverDesignPatternWithInbuiltObserverClass.ConcreteDisplayElemnt.ForecastDisplay;
import Observer.ObserverDesignPatternWithInbuiltObserverClass.ConcreteDisplayElemnt.HeatIndexDisplay;
import Observer.ObserverDesignPatternWithInbuiltObserverClass.ConcreteDisplayElemnt.StatisticsDisplay;
import Observer.ObserverDesignPatternWithInbuiltObserverClass.ConcreteSubject.WeatherData;

public class WeatherStationHeatIndex {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
