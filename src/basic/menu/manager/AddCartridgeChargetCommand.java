package basic.menu.manager;

import basic.devices.DeviceFacade;
import basic.menu.Command;
import basic.utils.LimitedIntDialog;

public class AddCartridgeChargetCommand extends Command {
	
	public AddCartridgeChargetCommand() {
		super("Añadir cartuchos de café");
	}

	@Override
	public void execute() {
		int amount = LimitedIntDialog.instance().read("Cantidad de azucar? ", 100);
		DeviceFacade.instance().addCoffe(amount);
	}

}
