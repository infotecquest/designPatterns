package designPatterns.observer;

import java.util.ArrayList;

import designPatterns.observer.model.Observer;
import designPatterns.observer.model.Subject;

public class WeatherData implements Subject {
	
	private int temp;
	private int humidity;
	private int preasure;

	private ArrayList<Observer> observersList;
	
	public WeatherData() {
		observersList = new ArrayList<Observer>();
	}
	
	public ArrayList<Observer> getObserversList() {
		return observersList;
	}

	public void setObserversList(ArrayList<Observer> observersList) {
		this.observersList = observersList;
	}

	@Override
	public void registerObserver(Observer observer) {
		observersList.add(observer);		
	}

	@Override
	public void removeObserver(Observer observer) {
		observersList.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observersList) {
			observer.update(temp, humidity, preasure);
		}
	}
	
	public void measerementsChanged(){
		notifyObservers();
	}
	public void setMeasurements(int temp, int humidity, int preasure){
		this.temp = temp;
		this.humidity = humidity;
		this.preasure = preasure;
		measerementsChanged();
	}
	
}
