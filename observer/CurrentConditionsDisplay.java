package designPatterns.observer;

import designPatterns.observer.model.DisplayElement;
import designPatterns.observer.model.Observer;
import designPatterns.observer.model.Subject;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private int temp;
	private int humidity;
	private Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void display() {
		System.out.println("Current condition: "+ temp + ", humidity: "+ humidity);
	}

	@Override
	public void update(int temp, int humidity, int preasure) {
		this.temp = temp;
		this.humidity = humidity;
		display();
	}

}
