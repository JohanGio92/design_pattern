package model;

public abstract class Observer {
	
	public Observer() {
		Subject.instance().add(this);
		System.out.println(this);
	}
	
	public abstract void update();

}
