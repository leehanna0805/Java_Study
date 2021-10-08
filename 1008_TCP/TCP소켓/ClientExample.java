/*
 * 먼저 server example부터 실행 후 client example 실행
 */

package TCP소켓;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SocketChannel;

public class ClientExample {

	public static void main(String[] args) {
		SocketChannel socketChannel = null;
		try {
			socketChannel = SocketChannel.open();
			socketChannel.configureBlocking(true);
			System.out.println("[연결 요청]");
			socketChannel.connect(new InetSocketAddress("localhost",5001));
			System.out.println("[연결 성공]");
		}catch(Exception e) {}
	
		
		if(socketChannel.isOpen()) {
			try {
				socketChannel.close();
			}catch(IOException e1) {}
		}
	}

}
