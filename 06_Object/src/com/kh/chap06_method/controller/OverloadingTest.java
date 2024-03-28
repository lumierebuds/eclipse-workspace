package com.kh.chap06_method.controller;

public class OverloadingTest {

	/*
	 * 메소드 오버로딩
	 * 
	 * - 한 클래스 내에 같은 메서드 명으로 여러개의 메서드를 정의하는 방법 
	 * - 단 매개변수의 자료형의 개수, 순서가 달라야 한다. 
	 */

	public void test() {

	}

	public void test(int a) {

	}

	public void test(int a, String s) {

	}

	public void test(String s, int a) {

	}

	// 메서드 오버로딩이 되지 않는 경우

	// 매개변수명과 오버로딩은 아무상관 없음
	// 즉 매개변수 명과 무관하게 자료형의 개수 및 순서가 달라야함.
	/*
	public void test(String s2, int a2) {
	
	}
	*/

	// 반환형이 다르다고 오버로딩이 적용되지 않느다.
	/*
	public int test(String s, int a) {
		
	}
	*/

	// 접근제한자가 다르다고 오버로딩이 적용되지 않는다.
	/*
	private void test(String s, int a) {
		
	}
	*/
}
