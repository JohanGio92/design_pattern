package view;

import model.Observer;
import model.Subject;

public class ObserverMexicanDollar extends Observer{
	
	private double valorCambio = 19.07;
	
	public ObserverMexicanDollar(Subject subject) {
		this.subject = subject;
		this.subject.add(this);
	}
	
	@Override
	public void update() {		
		System.out.println("MX: " + (subject.getState() * valorCambio));
	}

}