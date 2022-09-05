package manager;

import store.StoreImplementation;

public class StandaloneManager extends Manager {

	@Override
	protected Store createStore() {
		return new StoreImplementation();
	}
	
	public static void main(String[] args) {
		new StandaloneManager().manage();
	}
	
}
