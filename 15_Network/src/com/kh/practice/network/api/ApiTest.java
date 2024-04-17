package com.kh.practice.network.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class ApiTest {

	// 0) 홈페이지에서 요청주소, 요청변수 확인후 필수값에 해당하는 변수 초기화
	// serviceKey를 제외한 필수데이터는 샘플데이터를 추가한다
	// 1) URL 객체 생성
	// 2)URLConnection 객체 생성
	// 3)입력 스트림 생성
	// 4)전달받은 데이터를 화면에 출력

	public static void main(String[] args) {

		String requestUrl = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMsrstnAcctoRltmMesureDnsty";
		final String serviceKey = "laELPJa353SMwX60MiuJOXfIxYczES/ymWunlXFG/9pgtRMKEOnG3teQMuGNiIGpoljeJ2/w86yWzn2gfUrkzQ==";
		BufferedReader reader = null;

		String line = null;

		try {
			requestUrl += "?serviceKey=" + URLEncoder.encode(serviceKey, "UTF-8");
			requestUrl += "&stationName=" + URLEncoder.encode("종로구", "UTF-8");
			requestUrl += "&dataTerm=DAILY";

			URL url = new URL(requestUrl);
			URLConnection conn = url.openConnection();
			reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
