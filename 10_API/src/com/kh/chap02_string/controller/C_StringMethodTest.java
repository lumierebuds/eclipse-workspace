package com.kh.chap02_string.controller;

public class C_StringMethodTest {

	// 문자열과 관련된 메서드들
	public void method() {
		String str1 = "Hello world";

		// 1. 문자열.charAt(int index) : char
		// 문자열에서 전달받은 index위치의 문자 하나만 뽑아서 리턴
		char ch = str1.charAt(3);
		System.out.println("ch : " + ch);

		// 2. 문자열.concat(String str) : String
		// 문자열과 전달된 다른 문자열을 하나로 합쳐서 리턴.
		String str2 = "!!!".concat(str1).concat("!!!"); // 메서드 체인: 메서드를 연속해서 출력할때
		// str2 = "!!!"+str1+"!!!";
		System.out.println("str2 : " + str2);

		// 3. 문자열.substring(int beginIndex) : String
		// => 문자열의 beginIndex에서 마지막까지의 문자열을 추출하여 반환.
		// 문자열.substring(int beginIndex, int endIndex) : String
		// => 문자열의 beginIndex에서 endIndex까지의 문자열을 추출하여 반환
		// beginIndex <= x <= endIndex

		System.out.println(str1.substring(0, 5).concat("!!!"));

		System.out.println(str1.substring(6));

	}

}
