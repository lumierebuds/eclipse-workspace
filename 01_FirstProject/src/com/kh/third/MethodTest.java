package com.kh.third;

public class MethodTest {
	
	// 순환 의존성 문제(맛보기) 
	
	public void testA() {
		System.out.println("testA 메서드 호출됨!");
		testB();
	}

	public void testB() {
		System.out.println("testB 메서드 호출됨!");
		testC();
	}
	
	public void testC() {
		System.out.println("testC 메서드 호출됨!");
		
	}
	
	public static void main(String[] args) {
		
		// 현재 클래스의 객체를 생성하여서 메서드를 호출
		MethodTest mt = new MethodTest();
		mt.testA();
		
	}
	
}
