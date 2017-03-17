package designPatterns.observer.observerJava;

import java.util.Observable;
import java.util.Observer;

import designPatterns.observer.model.DisplayElement;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private int temp;
	private int humidity;
	private Observable observable;
	
	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Current condition: "+ temp + ", humidity: "+ humidity);
	}

	@Override
	public void update(Observable obs, Object arg) {
		if(obs instanceof WeatherData){
			WeatherData weatherData = (WeatherData) obs;
			this.temp = weatherData.getTemp();
			this.humidity = weatherData.getHumidity();
			display();
		}
		
	}


}
