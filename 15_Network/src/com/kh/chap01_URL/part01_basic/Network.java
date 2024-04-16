package com.kh.chap01_URL.part01_basic;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class Network {

	/*
	 * InetAddress
	 * IP주소에 대한 정보를 가진 클래스.
	 * 
	 * - ip : 10.10.10.10 4바이트로 이루어진 실제 주소 
	 * - hostname : naver.com, daum.net, google.com == 도메인명 
	 * 
	 * InetAddress 내부 메서드는 모두 static : 자주 사용하기 때문
	 */

	public void iNetTest() {
		try {
			InetAddress name = InetAddress.getByName("naver.com");
			System.out.println(name.getHostAddress());
			InetAddress[] arr = InetAddress.getAllByName("google.com");
			for (InetAddress ip : arr) {
				System.out.println(ip.getHostAddress());
			}

			// 내 컴퓨터의 ip 주소 192.168.30.193 == localhost == 127.0.0.1 . // 112.221.47.69
			InetAddress localhost = InetAddress.getLocalHost();
			System.out.println(localhost.getHostAddress());

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/* 
	 * URL : 인터넷상에 존재하는 서버들의 자원(html, css, 이미지, xml, json) 등에 접근할 수 있는 주소를 다루는 클래스. 
	 * 		 실제 URL 자원에 대한 객체를 생성하여 자원에 연결하거나 데이터를 읽어올 수 있음(i/o 가능)
	 * 		 로컬자원에 접근할때 사용하는 클래스가 File이였다면 
	 * 		 원격자원에 접근할때 사용하는 클래스가 URL이다. 
	 * 
	 * (FILE은 객체 생성시 로컬상의 디렉토리명 + 파일명을 제시) 
	 * URL은 객체 생성시 접근하고자 하는 URL 주소값을 제시해야함.
	 * URL 주소 : protocol + hostname + port + 자원 경로(path) 
	 * 
	 * 프로토콜 ? : 통신규약 http, https, ftp, smtp, .....
	 * 			  네트워크환경에서 서버와 클라이언트간에 데이터 송수신을 어떤 식으로 할지 미리 표준화한 규칙들의 집합
	 * 
	 * 
	 * 포트번호 ? : 서비스 번호로 불린다. 컴퓨터 서버내엣 특정 프로그램을 가리키는 논리적인 번호.
	 *            이 포트번호를 통해 각각 다른 프로그램을 제공해줄 수 있다. 
	 *            
	 * 자원경로 : 도메인상의 서버에서 실제로 자원이 존재하는 경로 
	 */
	public void urlTest() {
		try {
			URL url = new URL(
					"https://www.queenspider.co.kr/product/detail.html?product_no=14981&cafe_mkt=nvs_hot01&NaPm=ct%3Dlv23201k%7Cci%3Deb5edf6637eb6eb9df8a98ac2dd229929511f405%7Ctr%3Dsbsh%7Csn%3D4576642%7Cic%3D%7Chk%3D4a6eef463f3d1ff73612ee1cbc4aa274d8906f1d");
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			;
			System.out.println(url.getPort() != -1 ? url.getPort() : url.getDefaultPort());
			System.out.println(url.getPath());
			System.out.println(url.getQuery());

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
