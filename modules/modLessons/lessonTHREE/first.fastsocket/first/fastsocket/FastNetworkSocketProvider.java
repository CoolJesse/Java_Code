

package first.fastsocket;

import first.socket.NetworkSocket;
import first.socket.spi.NetworkSocketProvider;

public class FastNetworkSocketProvider extends NetworkSocketProvider {
	public FastNetworkSocketProvider() { }
	
	@Override
	public NetworkSocket openNetworkSocket() {
		return new FastNetworkSocket();
	}
}