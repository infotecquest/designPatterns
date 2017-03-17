package designPatterns.observer.observerJava;

import java.util.Observable;

public class WeatherData extends Observable {
	
	private int temp;
	private int humidity;
	private int preasure;

	
	public WeatherData() {}

	public void measerementsChanged(){
		setChanged();
		notifyObservers();
	}
	public void setMeasurements(int temp, int humidity, int preasure){
		this.temp = temp;
		this.humidity = humidity;
		this.preasure = preasure;
		measerementsChanged();
	}

	public int getTemp() {
		return temp;
	}

	public int getHumidity() {
		return humidity;
	}

	public int getPreasure() {
		return preasure;
	}
}
