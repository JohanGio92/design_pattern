package basic.menu.main;

import basic.menu.Command;
import basic.menu.manager.ManagerMenu;

public class ManagerMenuCommand extends Command {
	
	public ManagerMenuCommand() {
		super("Gestión");
	}
	
	@Override
	public void execute() {
		ManagerMenu managerMenu = new ManagerMenu();
		managerMenu.execute();
	}

}
