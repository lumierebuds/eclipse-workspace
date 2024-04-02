package com.kh.chap02_string.controller;

public class B_StringBufferAndBuilder {
	// String은 불변클래스 => 저장공간에서 값이 수정되지 않음.
	// StringBuffer, StringBuilder은 가변클래스 => 처음 할당받은 저장공간에서 값을 수정한다.
	// 문자열 연산이 빈번하게 일어나는 알고리즘들에서 메모리부족이슈를 해결하기 위해 나온 클래스.

	/*
	 * StringBuffer와 StringBuilder는 동일한 메서드를 지닌다. 
	 * 차이점은 동기화 여부. 
	 * 
	 * Thread개념이 적용. (추후배울예정)
	 * StringBuffer => 멀티쓰레드환경에서 유용
	 * StringBuilder => 싱글쓰레드환경에서 유용 (성능상 빠름) 
	 * 
	 */

	public void method() {
		String str = "hello";
		str += "World"; // 주소 2개 할당.

		StringBuffer sb = new StringBuffer("Hello");
		sb.append("World");

		StringBuilder sb2 = new StringBuilder("Hello");
		sb2.append("World");

		// StringBuffer, Builder의 메서드들
		sb.deleteCharAt(0);

		int length = sb2.length();
		System.out.println("HelloWorld에서 o의 마지막 위치는 ? " + sb2.lastIndexOf("o"));
		System.out.println("sb2의 길이: " + length);

		StringBuilder sb3 = new StringBuilder("abc123.txt");
		System.out.println("abc123.txt에서 .txt제거하기 " + sb3.delete(sb3.lastIndexOf("."), sb3.length()));

		System.out.println(sb);
		System.out.println(sb2);
		System.out.println(sb3);
	}
}
