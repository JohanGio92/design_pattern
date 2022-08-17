package main;

import java.util.ArrayList;
import java.util.List;

import command.Command;
import command.ExitCommand;

public abstract class Menu {
	
	protected List<Command> commandList;
	private ExitCommand exitCommand;
	
	public Menu() {
		this.commandList = new ArrayList<>();
		this.exitCommand = new ExitCommand();
		this.commandList.add(exitCommand);
	}
	
	protected abstract void setCommand();
	
	protected setTicket(Ticket ticket);

	public void execute(Ticket ticket) {
		
		boolean exit = true;

		do {
			
			
		} while (!exit);
		
	}

}
