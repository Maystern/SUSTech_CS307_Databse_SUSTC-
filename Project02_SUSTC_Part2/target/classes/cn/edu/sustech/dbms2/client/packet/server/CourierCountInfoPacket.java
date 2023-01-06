package cn.edu.sustech.dbms2.client.packet.server;

import cn.edu.sustech.dbms2.client.packet.Packet;

public class CourierCountInfoPacket extends Packet {
	
	private String context;
	private int count;
	
	public CourierCountInfoPacket(String context) {
		this.context = context;
		this.count = Integer.parseInt(context);
	}
	
	public int getCount() {
		return this.count;
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
