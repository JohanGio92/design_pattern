package view;

import model.Observer;
import model.Subject;

public class ObserverMexicanDollar extends Observer{
	
	private double valorCambio = 19.07;
	
	public ObserverMexicanDollar() {
		Subject.instance().add(this);
	}
	
	@Override
	public void update() {		
		System.out.println("MX: " + (Subject.instance().getState() * valorCambio));
	}

}