package dispatchers;

import java.util.HashMap;
import java.util.Map;

import manager.Server;
import manager.Store;
import store.FrameType;

public class DispatcherPrototype {

	private Map<FrameType, Dispatcher> dispatcherMap;
	
	public DispatcherPrototype(Store store, Server server) {
		dispatcherMap = new HashMap<FrameType, Dispatcher>();
		dispatcherMap.put(FrameType.ADD, new AddDispatcher(store, server));
		dispatcherMap.put(FrameType.REMOVE, new RemoveDispatcher(store, server));
		dispatcherMap.put(FrameType.EXIST, new ExistDispatcher(store, server));
		dispatcherMap.put(FrameType.LIST, new ListDispatcher(store, server));
	}
	
	public void dispatch(FrameType frameType) {
		dispatcherMap.get(frameType).clone().dispatch();
	}

}
