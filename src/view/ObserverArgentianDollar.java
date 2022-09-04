package view;

import model.Observer;
import model.Subject;

public class ObserverArgentianDollar extends Observer {
	private double valorCambio = 29.86;

	public ObserverArgentianDollar() {
		Subject.instance().add(this);
	}

	@Override
	public void update() {		
		System.out.println("ARG: " + (Subject.instance().getState() * valorCambio));
	}
}
