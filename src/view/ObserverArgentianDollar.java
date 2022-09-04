package view;

import model.Observer;
import model.Subject;

public class ObserverArgentianDollar extends Observer {
	private double valorCambio = 29.86;

	public ObserverArgentianDollar(Subject subject) {
		this.subject = subject;
		this.subject.add(this);
	}

	@Override
	public void update() {		
		System.out.println("ARG: " + (subject.getState() * valorCambio));
	}
}
