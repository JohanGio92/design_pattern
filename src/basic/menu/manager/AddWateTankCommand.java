package basic.menu.manager;

import basic.devices.DeviceFacade;
import basic.menu.Command;
import basic.utils.LimitedIntDialog;

public class AddWateTankCommand extends Command {

	public AddWateTankCommand() {
		super("Añadir agua");
	}

	@Override
	public void execute() {
		int amount = LimitedIntDialog.instance().read("Cantidad de azucar? ", 100);
		DeviceFacade.instance().addWater(amount);
	}


}
