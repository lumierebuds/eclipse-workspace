package com.kh.chap02_TCP.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClient {

	/*
	 * 클라이언트용 TCP 소켓 프로그래밍 순서 
	 * 
	 * 1) 서버의 IP주소와 서버가 정한 포트번호를 매개변수로 하는 소켓 객체 생성. 
	 * 	  => 서버로 연결요청 보내는 코드 
	 * 
	 * 2) 서버와의 입출력 스트림 오픈 
	 * 
	 * 3) 보조스트림을 통해 성능개선
	 * 
	 * 4) 입출력 코드 작성(i/o)
	 * 
	 * 5) 통신종료(스트림 및 소켓 close)
	 * 
	 * 
	 */

	public static void main(String[] args) {

		// 1) 서버의 IP주소와 서버가 정한 포트번호를 매개변수로 하는 소켓 객체
		int serverPort = 30027; // 서버의 포트번호
		String str = ""; // 요청을 보낼 문자열
		String serverIp = null /*"192.168.30.193"*/ ; // 서버 ip, cmd에서 찾거나, InetAddress의 메서드로 찾음
		Socket socket = null;

		try {
			serverIp = InetAddress.getLocalHost().getHostAddress(); // InetAddress로 찾은 ip주소
			// serverIp = "192.168.30.4";
			// 서버에 연결요청보내기 == Socket 객체 생성
			socket = new Socket(serverIp, serverPort);
			// 서버는 accept() 함수가 호출되면서 대기상태가 종료, accept()의 반환값으로 클라이언트의 정보가 담긴 소켓객체 반환
			// 클라이언트에서 소켓객체가 생성되면 서버에서 accept() 호출된다.

			// 서버와 연결실패시 null값 반환.

			if (socket != null) {
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);

				Scanner sc = new Scanner(System.in);

				while (true) {
					System.out.print("서버에 보낼 내용: ");
					str = sc.nextLine();

					pw.println(str);

					if (str.equals("exit")) {
						System.out.println("연결 종료");
						break;
					}

					String responseMessage = br.readLine();
					System.out.println("응답 받은 메시지 : " + responseMessage);
				}

				// 5) 통신 종료
				pw.close();
				br.close();
				socket.close();
			}

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
