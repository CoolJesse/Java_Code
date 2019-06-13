module first.fastsocket {
	requires first.socket;
	provides first.socket.spi.NetworkSocketProvider
		with first.fastsocket.FastNetworkSocketProvider;
}