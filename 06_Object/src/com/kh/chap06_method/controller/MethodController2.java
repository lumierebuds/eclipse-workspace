package com.kh.chap06_method.controller;

public class MethodController2 {

	/*
	 * static 메서드
	 * 
	 * 접근제한 static [예약어] 반환명 메서드명 ([매개변수]){
	 * 		수행 내용
	 * 		[return 반환값] 
	 * }
	 * 
	 * - 호출시 객체 생성할 필요가 없음 
	 * - 클래스명.메서드명 
	 */

	static int count = 0;
	int count2 = 0;

	public static int multiply(int num1, int num2) {
		System.out.println("static 메서드 ");

		// 매개변수 2개로 연산시 문제 없다.
		// return num1 * num2;

		// 같은 범위에서 연산 가능
		// count는 프로그램 시작과 동시에 저장공간 할당
		// num1은 multiply 함수 호출시 할당
		// return count * num1;

		// count2는 인스턴스 생성시 저장공간 할당 (힙에 할당)
		// multiply 함수는 현재 객체를 생성하지 않더라도 호출이 가능함.

		// return count2 * num1;

		return num1 * num2;

	}
}
