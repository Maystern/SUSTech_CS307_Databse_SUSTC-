package cn.edu.sustech.dbms2.client.packet.client;

import cn.edu.sustech.dbms2.client.packet.Packet;

public class CityCountPacket extends Packet {
	
	private String cookie;
	
	public CityCountPacket(String cookie) {
		this.cookie = cookie;
	}
	
	public String getCookie() {
		return this.cookie;
	}
	
	@Override
	public String getContext() {
		return cookie;
	}

	@Override
	public int getCode() {
		return getStaticCode();
	}
	
	public static int getStaticCode() {
		return 5;
	}
}
