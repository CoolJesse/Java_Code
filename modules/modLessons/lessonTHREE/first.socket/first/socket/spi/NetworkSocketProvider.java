
package first.socket.spi;

import first.socket.NetworkSocket;

public abstract class NetworkSocketProvider {
	protected NetworkSocketProvider() { }
		public abstract NetworkSocket openNetworkSocket();
}