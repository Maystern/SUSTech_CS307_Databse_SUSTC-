package main.packet.server;

import main.packet.Packet;

public class CourierCountInfoPacket extends Packet {

	private String context;
	
	public CourierCountInfoPacket(int count) {
		this.context = "" + count;
	}
	
	@Override
	public String getContext() {
		return this.context;
	}

	@Override
	public int getCode() {
		return getStaticCode();
	}
	
	public static int getStaticCode() {
		return 8;
	}
	
}
