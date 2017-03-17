package designPatterns.observer.main;

import designPatterns.consoleManager.ConsoleManager;
import designPatterns.observer.CurrentConditionsDisplay;
import designPatterns.observer.WeatherData;

public class WeatherStation {

	public static void main(String[] args) {
		ConsoleManager consoleManager = new ConsoleManager();
		
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

		setMeasurements(weatherData, consoleManager);
		setMeasurements(weatherData, consoleManager);
		setMeasurements(weatherData, consoleManager);
	}
	public static void setMeasurements(WeatherData weatherData,ConsoleManager consoleManager){
		weatherData.setMeasurements(consoleManager.getConsoleValueAsInt(), 
				consoleManager.getConsoleValueAsInt(), 
				consoleManager.getConsoleValueAsInt());
	}

}
