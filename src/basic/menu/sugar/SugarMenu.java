package basic.menu.sugar;

import basic.Product;
import basic.menu.Menu;

public final class SugarMenu extends Menu {

	protected Product product;
	
	public SugarMenu(Product product) {
		super();
		this.product = product;
		commandList.add(new SugarCommand("Nada", 0, product));
		commandList.add(new SugarCommand("Algo", 5, product));
		commandList.add(new SugarCommand("Medio", 10, product));
		commandList.add(new SugarCommand("Bastante", 15, product));
		commandList.add(new SugarCommand("Mucho", 20, product));
	}
	
}
