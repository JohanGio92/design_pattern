package dispatchers;

import manager.Server;
import manager.Store;

public class AddDispatcher extends Dispatcher {

	public AddDispatcher(Store store, Server server) {
		super(store, server);
	}

	@Override
	public void dispatch() {
		try {
			int code = Integer.parseInt(server.readLine());
			int amount = Integer.parseInt(server.readLine());
			store.add(code, amount);
		} catch (NumberFormatException ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public Dispatcher clone() {
		return new AddDispatcher(store, server);
	}

}
