package com.kh.chap03_UDP.server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPServer {

	/*
	 * UDP? 
	 * - 비연결형 프로토콜로 수신자/발신자가 연결되어 있든 아니든 상관없이 데이터를 송수신함.
	 * - 데이터를 전달받은 쪽에서 제대로 수신이 완료되었는지 확인하지 않음. 
	 *   즉, 데이터가 제대로 전달되지 않을 수 있다. 
	 * 
	 * - 번거로운 확인절차를 모두 없앰으로써 데이터를 신속하게 송수신이 가능하게 만들었음. 
	 *   빠른 데이터 전송이 중요한 실시간 스트리밍이나, 유튜브 혹은 온라인게임에서 사용하는 방식.
	 *   
	 * User Datagram Protocol
	 * 
	 * - Datagram 단위로 데이터를 전송하는 비연결지향형 프로토콜 
	 * - 클라이언트와 서버의 개념이 없다. 즉, 클라이언트의 요청을 받아주는 serversocket이 존재하지 않음.
	 * - 클라이언트와 서버간에 각자 소켓을 생성한 후, 소켓(엔드포인트)를 통해 특정 프로세스 접속하여 데이터를 송수신함.
	 *   이때 연결된 소켓에 프로세스가 작동중이던, 아니던 그저 데이터전송만 한다. 
	 * - 이때 전송시키고자하는 데이터는 DatagramPacket에 담아서 전달한다. 
	 * 
	 * DatagramSocket? 
	 * UDP 통신에서 DatagramPacket을 보내고 받는데 사용하는 클래스.
	 * 일반적으로 발신자/수신자 각각 하나의 DatagramSocket을 생성한후 이를통해 데이터를 송/수신한다.
	 * 
	 * DatagramPacket? 
	 * - UDP 통신시 데이터를 포장할때 사용되는 클래스
	 * - 내부에는 전송할 "데이터"와 발신자의 IP주소 및 포트번호가 포함되어있음. 
	 * - Datagram? 데이터를 전송하는 최소 단위. 
	 * - Packet ? 네트워크에서 데이터를 전송하는데 사용하는 단위. 네트워크상으로 전송하는 모든 데이터는
	 * 			 패킷으로 나뉘어 전송됨. 패킷에는 데이터 전송에 필요한 제어정보(Header), 실제 전송되는
	 * 			 데이터(Payload)가 포함되어 있음. 패킷은 목적지에 도달시 다시 사용가능한 데이터로 재조립된다.
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		// 서버의 포트번호 설정
		int port = 30017;

		// UDP 소켓 생성
		try {
			// 소켓생성시 지정한 포트번호를 통해 클라이언트가 데이터를 전송해줘야함.
			DatagramSocket socket = new DatagramSocket(port);

			// 원래 TCP가 하는 역할.
			System.out.println("서버 시작.. 클라이언트로부터 데이터 수신 대기중...");

			// 클라이언트의 ip정보 , port 정보를 보관하고 있는 패킷 정보 수신
			byte[] receiveData = new byte[1024]; // 전송받은 데이터를 저장할 byte[]
			DatagramPacket clientPacket = new DatagramPacket(receiveData, receiveData.length);
			// 클라이언트가 전송할 데이터 그램패킷

			socket.receive(clientPacket); // 현재 소켓으로 데이터가 들어오길 대기

			System.out.println("클라이언트의 ip주소? " + clientPacket.getAddress().getHostAddress());
			System.out.println("클라이언트의 포트번호? " + clientPacket.getPort());
			// 클라이언트가 보낸 데이터 출력
			System.out.println("클라이언트에서 전달한 데이터 " + receiveData);

			// 클라이언트의 IP주소와 포트번호 설정
			InetAddress clientAddress = clientPacket.getAddress();
			int clientPort = clientPacket.getPort();
			String str = "UDP 서버에서 보내는 데이터";

			// 문자열 -> byte[]
			byte[] data = str.getBytes();

			DatagramPacket packet = new DatagramPacket(data, data.length, clientAddress, clientPort);

			// 상대방이 receive중이라면 내용 받기가 가능.
			socket.send(packet);

			socket.close();

		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
