package main;

public abstract class CountryFactory {
	
	private static CountryFactory instance;
	protected Menu menu;	
	protected TicketBuilder ticketBuilder;
	
	protected CountryFactory() {
	}
	
	public static CountryFactory instance() {
		return instance == null ? new SpanishFactory(): instance;
	}

	public Ticket createTicket() {
		return ticketBuilder.build();
	}
	
	public Menu createMenu() {
		return menu;
	}
}
