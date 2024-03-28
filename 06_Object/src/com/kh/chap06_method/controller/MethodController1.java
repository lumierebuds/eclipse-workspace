package com.kh.chap06_method.controller;

public class MethodController1 {

	/*
	 * 메서드
	 * 
	 * 접근제한자 [예약어] 반환형 메서드명([매개변수]) {
	 * 		수행할 코드; 
	 * 		[return 반환할 값;] // 반환형이 void일 경우 생략 가능.
	 * }
	 * 
	 */

	// 1. 매개변수가 없고, 반환형이 없는 메서드

	public void method1() {
		System.out.println("매개변수와 반환값이 둘다 없는 메서드입니다.");
		sum(10);
		// return; // jvm이 리턴을 자동으로 생성해서 넣어줌. 지금은 명시해서 넣어줬다.
	}

	// 2. 매개변수는 없고 반환값이 있는 메서드

	public int random() {
		System.out.println("매개변수는 없고 반환값이 있는 메서드입니다.");
		return (int) (Math.random() * 100 + 1);

	}

	// 3. 매개변수는 있고, 반환형이 없는 메서드

	public void sum(int num) {

		// 1~num 까지 총 합계 구하기
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}

		System.out.print("1부터 " + num + "까지 ");
		System.out.println("총 합계 : " + sum);

	}

	// 4. 매개변수 있고, 반환형도 있는 메서드

	public int multiply(int a, int b) {
		System.out.println("매개변수 있고, 반환형도 있는 메서드입니다.");
		return a * b;
	}

}
