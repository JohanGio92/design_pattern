package model;

public abstract class Observer {
	
	protected Subject subject;

	public Observer() {
	}
	
	public abstract void update();

}
