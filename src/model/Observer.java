package model;

public abstract class Observer {
	
	protected Subject subject;

	public Observer() {
		subject = new Subject();
	}
	
	public abstract void update();

}
