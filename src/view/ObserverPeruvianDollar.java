package view;

import model.Observer;
import model.Subject;

public class ObserverPeruvianDollar extends Observer{
	
	private double valorDeCambio = 3.25;
	
	public ObserverPeruvianDollar() {
		Subject.instance().add(this);
	}

	@Override
	public void update() {
		System.out.println("PEN: " + (Subject.instance().getState() * valorDeCambio ));
	}
	
}
