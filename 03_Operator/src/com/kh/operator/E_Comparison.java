package com.kh.operator;

public class E_Comparison {

	/*
	 * 비교연산자: 데이터가 같은지, 다른지 비교할때 쓰이며 항상 논리값
	 * 이 결과값임 (true, false) 
	 * 
	 * 크고 같은지 비교 
	 * < , > , <=, >=
	 * 
	 * 일치함을 비교 - 동일성 비교
	 * a == b : a는 b와 일치할까?
	 * a != b : a는 b와 일치하지 않을까?
	 * 
	 * equals() - 동일성 비교  
	 */
	public void method() {
		int a = 10;
		int b = 25;

		System.out.println("a > b? " + (a > b));
		// a > b ? false 출력

		boolean result = (a == b); // false 저장

		// 산술연산 + 비교연산
		System.out.println(a - b < 0); // 10 - 25 < 0
		// true 출력

		System.out.println(a * 2 > b / 5); // 20 > 5
		// true 출력

		boolean result1 = (a % 2 == 0); // 0 == 0
		// true 저장

		boolean result2 = (a % 2 != 0); // 0 != 0
		// false 저장

		boolean result3 = !(a % 2 == 0); // !true
		// false 저장

		boolean result4 = (a % 2 == 1); // 0 == 1
		// false 저장

	}

}
