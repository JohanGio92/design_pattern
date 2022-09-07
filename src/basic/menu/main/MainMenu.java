package basic.menu.main;

import basic.Product;
import basic.devices.DeviceFacade;
import basic.menu.ExitCommand;
import basic.menu.Menu;

public class MainMenu extends Menu {

	private ExitCommand exitCommand;

	public MainMenu() {
		super();
		exitCommand = new ExitCommand();
		this.set();
	}
	
	private void set(){
		System.out.println(DeviceFacade.instance());
		if (DeviceFacade.instance().isActiveVending()){
			this.activeVendingSet();
		} else {
			this.deactiveVendingSet();
		}
	}
	
	private void activeVendingSet() {
		commandList.clear();
		commandList.add(new ProductCommand(new Product("Cafe solo", 1, 1)));
		commandList.add(new ProductCommand(new Product("Cafe con leche", 2, 2)));
		commandList.add(new ProductCommand(new Product("Cafe ole", 3, 3)));
		commandList.add(new ProductCommand(new Product("Cafe capuccino", 4, 4)));
		commandList.add(new ManagerMenuCommand());
		this.commandList.add(exitCommand);
	}
	
	private void deactiveVendingSet() {
		commandList.clear();
		commandList.add(new ManagerMenuCommand());
		this.commandList.add(exitCommand);
	}
	
	public void execute() {
		exitCommand.reset();
		do {
			this.set();
			super.execute();
		} while (!exitCommand.closed());
	}

	public boolean isClosed() {
		return exitCommand.closed();
	}

}
