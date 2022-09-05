package dispatchers;

import manager.Server;
import manager.Store;

public class ExistDispatcher extends Dispatcher {

	public ExistDispatcher(Store store, Server server) {
		super(store, server);
	}

	@Override
	public void dispatch() {
		try {
			int code = Integer.parseInt(server.readLine());
			int amount = Integer.parseInt(server.readLine());
			server.println(store.exist(code, amount));
		} catch (NumberFormatException ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public Dispatcher clone() {
		return new ExistDispatcher(store, server);
	}
}
