package basic.menu.manager;

import basic.devices.DeviceFacade;
import basic.menu.Command;
import basic.utils.LimitedIntDialog;

public class AddSugarDepositCommand extends Command {

	public AddSugarDepositCommand() {
		super("Añadir azucar");
	}

	@Override
	public void execute() {
		int amount = LimitedIntDialog.instance().read("Cantidad de azucar? ", 100);
		DeviceFacade.instance().addSugar(amount);
	}

}
