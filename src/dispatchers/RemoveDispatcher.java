package dispatchers;

import manager.Server;
import manager.Store;

public class RemoveDispatcher extends Dispatcher {

	public RemoveDispatcher(Store store, Server server) {
		super(store, server);
	}

	@Override
	public void dispatch() {
		try {
			int code = Integer.parseInt(server.readLine());
			int amount = Integer.parseInt(server.readLine());
			store.remove(code, amount);
		} catch (NumberFormatException ex) {
			ex.printStackTrace();
		} 
	}

	@Override
	public Dispatcher clone() {
		return new RemoveDispatcher(store, server);
	}
}
