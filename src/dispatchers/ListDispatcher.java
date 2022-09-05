package dispatchers;

import manager.Server;
import manager.Store;

public class ListDispatcher extends Dispatcher {

	public ListDispatcher(Store store, Server server) {
		super(store, server);
	}

	@Override
	public void dispatch() {
		int[][] result = store.list();
		server.println(result.length);
		for(int[] product : result){
			server.println(product[0]);
			server.println(product[1]);
		}
	}

	@Override
	public Dispatcher clone() {
		return new ListDispatcher(store, server);
	}
}
