package basic.menu.sugar;

import basic.Product;
import basic.menu.Command;

public class SugarCommand extends Command{

	private int sugarConsumption;
	
	private Product product;
	
	public SugarCommand(String description, int sugarConsumption, Product product) {
		super(description);
		this.sugarConsumption = sugarConsumption;
		this.product = product;
	}

	@Override
	public void execute() {
		product.setSugarConsumption(sugarConsumption);
	}

}
