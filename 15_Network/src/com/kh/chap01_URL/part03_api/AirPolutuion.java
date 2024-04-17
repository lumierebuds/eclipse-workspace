package com.kh.chap01_URL.part03_api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

// 대기오염지수를 받아오기 
public class AirPolutuion {

	/*
	 * URLConnection 활용 예시
	 * 1) 웹 크롤링 -> 자주사용하진않음
	 * 2) API서버로 데이터 요청
	 * 	- API 서버 ? 쉽게 말하면 내가 URL로 데이터에 대한 요청을 보내면 응답데이터를 반환해주는 서버
	 * 				단 누구나 데이터 요청을 할 수 는 없고, 데이터 요청을 보내기 위해선 API 서버에서 
	 * 				정한 "규칙"을 지켜서 요청해야함. 
	 *	
	 * 	자바 API ? 자바 애플리케이션 개발을 도와주는 클래스들 
	 * 	API(Application Programming Interface) 
	 *   - 애플리케이션간에 상호작용을 위한 인터페이스.
	 *   - 애플리케이션들중 데이터나 서비스를 제공하는 역할의 애플리케이션을 API 서버라고 부름.
	 *   - 대표적인 API 서버 역할을 하는 애플리케이션은 카카오, 구글, 네이버등.(sns로그인할때 많이 사용한다.)
	 *   - 이러한 api서버로 데이터나 서비스를 요청하기 위해서는 "규칙"을 지켜서 데이터 요청을 보내야함. 
	 *    
	 * API 요청보내기
	 * 1) 공공데이터포탈 회원가입
	 * 2) 한국환경공단_에어코리아_대기오염정보 검색
	 * 3) 활용신청
	 * 4) 마이페이지에서 개인 API인증키 발급여부 확인
	 * 5) 한국환경공단_에어코리아_대기오염정보 상세페이지로 이동 
	 * 6) 상세기능 아래에 목록 선택후 "시도별 실시간 측정정보" 선택후 조회버튼 클릭(얻고자 하는 데이터 취사선택)
	 * 7) 요청주소, 요청변수, 출력결과 정보 확인 
	 * 8) 요청주소와 요청변수를 작성후 API서버로 요청(request) 
	 * 9) API 서버로부터 응답결과를 돌려받기(response) 
	 * 10) 응답데이터를 바탕으로 프로그래밍.
	 * 
	 */

	public static void main(String[] args) {

		String requestUrl = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty";
		final String serviceKey = "laELPJa353SMwX60MiuJOXfIxYczES%2FymWunlXFG%2F9pgtRMKEOnG3teQMuGNiIGpoljeJ2%2Fw86yWzn2gfUrkzQ%3D%3D";
		BufferedReader reader = null;
		// 요청주소와 요청변수 묶어주기

		try {
			requestUrl += "?serviceKey=" + serviceKey;
			requestUrl += "&sidoName=" + URLEncoder.encode("서울", "UTF-8");
			URL url = new URL(requestUrl);

			URLConnection conn = url.openConnection();

			reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line = null;

			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}

		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

		}

	}
}
