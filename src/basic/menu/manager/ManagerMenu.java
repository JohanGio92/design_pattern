package basic.menu.manager;

import basic.menu.Menu;

public class ManagerMenu extends Menu {

	public ManagerMenu() {
		commandList.add(new AddCartridgeChargetCommand());
		commandList.add(new AddSugarDepositCommand());
		commandList.add(new AddWateTankCommand());	
	}

}
