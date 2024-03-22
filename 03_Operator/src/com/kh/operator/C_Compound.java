package com.kh.operator;

public class C_Compound {

	/*
	 * 복합 대입 연산자 : 산술연산자와 대입 연산자를 함께 사용하는 연산자
	 * 
	 * +=, -=, *=, /=, %= 
	 * a = a +3;  => a+=3;
	 * 
	 * 기존의 a값에 +-*n을 계싼해서 다시 a에 대입해주겠다. 
	 */
	public void method() {

		int num = 12;

		num += 3; // num = num +3 = 12 + 3 = 15;

		num -= 5; // num = num -5 = 15 - 5 = 10;

		num *= 6; // num = num * 6 = 10 * 6 = 60;

		num /= 2; // num = num / 2 = 60 / 2 = 30;

		num %= 4; // num = num % 4 = 30 % 4 = 2;

		// ** +=의 경우 문자열 접합도 가능하다.

		String str = "Hello";
		str += " World";
		System.out.println(str);

	}

}
