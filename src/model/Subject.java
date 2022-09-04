package model;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	private static Subject instance;
	
	private List<Observer> observers;
	private int state;
	
	private Subject() {
		this.observers = new ArrayList<>();
		this.state = 0;
	}
	
	public static Subject instance() {
		if(instance == null) {
			instance = new Subject();
		}
		return instance;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		this.notifyObserver();
	}
	
	public void add(Observer observer) {
		observers.add(observer);
	}
	
	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
}
