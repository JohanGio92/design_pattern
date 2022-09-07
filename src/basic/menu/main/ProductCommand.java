package basic.menu.main;

import basic.Product;
import basic.devices.DeviceFacade;
import basic.menu.Command;
import basic.menu.sugar.SugarMenu;

public class ProductCommand extends Command {

	protected Product product;
	
	protected ProductCommand(Product product) {
		super("Comprar un " + product.getDescription());
		this.product = product;
	}

	@Override
	public void execute() {
		SugarMenu sugarMenu = new SugarMenu(product);
		sugarMenu.execute();
		DeviceFacade.instance().removeCoffe(product.getCoffeConsumption());
		DeviceFacade.instance().removeSugar(product.getSugarConsumption());
		DeviceFacade.instance().removeWater(product.getWaterConsumption());
	}

}
