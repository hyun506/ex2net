package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
	public static void main(String[] args) throws UnknownHostException{
		InetAddress local = InetAddress.getLocalHost();
		System.out.println(local.getHostAddress());
	}
}
