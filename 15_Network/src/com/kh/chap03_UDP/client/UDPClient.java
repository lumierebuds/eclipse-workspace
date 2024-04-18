package com.kh.chap03_UDP.client;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPClient {

	public static void main(String[] args) {
		// 서버의 ip 주소와 포트번호 설정
		int serverPort = 30017;

		try {

			// localhost == 127.0.0.1 == 192.168.30.2
			InetAddress serverAddress = InetAddress.getByName("localhost");
			// = InetAddress.getLocalHost();
			// = InetAddress.getByAddress("127.0.0.1".getBytes());

			// UDP 소켓 객체 생성
			DatagramSocket socket = new DatagramSocket(); // 랜덤포트번호 부여.
			String message = "udp 클라이언트에서 데이터 요청 보냄";
			byte[] sendData = message.getBytes();

			DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);

			// 서버로 데이터 전송. 이때 현재 클라이언트의 ip주소와 포트번호도 함께 전달된다.
			socket.send(sendPacket);

			// 서버로부터 데이터 수신 대기
			socket.receive(sendPacket); // 패킷재사용.

			// 수신받은 데이터 처리 String -> byte[] -> String
			String receiveData = new String(sendPacket.getData(), 0, sendPacket.getLength());
			System.out.println("서버로부터 수신받은 데이터 : " + receiveData);

			socket.close();

		} catch (SocketException e) {
			e.printStackTrace();

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
