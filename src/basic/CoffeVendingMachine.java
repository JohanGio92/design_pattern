package basic;

import basic.devices.DeviceFacade;

public class CoffeVendingMachine {

	private void exec() {
		DeviceFacade.instance().sell();
	}

	public static void main(String[] args) {
		new CoffeVendingMachine().exec();
	}
}
