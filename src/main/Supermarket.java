package main;

public class Supermarket {
	
	private final static double CLOSING_TIME = 20;

	public Supermarket() {
	}
	
	public void sell() {

		Clock clock = new Clock();

		do {
			Ticket ticket = CountryFactory.instance().createTicket();
			Menu menu = CountryFactory.instance().createMenu();
			menu.execute(ticket);
		} while (!clock.nowOrLater(CLOSING_TIME));
	}
}
