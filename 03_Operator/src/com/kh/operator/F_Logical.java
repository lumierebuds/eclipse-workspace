package com.kh.operator;

import java.util.Scanner;

public class F_Logical {
	/*
	 * 논리 연산자: 논리값 두개를 비교하는 연산자 
	 * 
	 * AND && : A && B
	 * 논리값 두개가 모두 true여야 true
	 * 둘중 하나라도 false면 false
	 * 
	 * OR || : A || B
	 * 논리값 둘중 하나라도 true여도 true 
	 * 둘다 false면 false 
	 */

	Scanner sc = new Scanner(System.in);

	public void method1() {

		System.out.print("정수값을 입력해주세요 : ");
		int num = sc.nextInt();

		// 사용자가 입력한 값이 양수이면서 짝수인지 판단한다

		boolean result = (num > 0) && (num % 2 == 0);
		// if. num - 2,4 넣음
		// (2 > 0) && ( 2 % 2 == 0) => true && true => true
		// (4 > 0) && ( 4 % 2 == 0) => true && true => true

		// else if. num - 3, (-2)
		// (3 > 0 ) && ( 3 % 2 == 0) => true && false => false
		// (-2 > 0) && ( -2 % 2 == 0) ==> false && true => false

		System.out.println("사용자가 입력한 수는 양수이면서 짝수입니까? " + result);

	}

	public void method2() {
		System.out.println("정수값을 입력해주세요 : ");
		int num = sc.nextInt();

		// 사용자가 입력한 값이 1에서부터 100 사이의 값인지 확인

		boolean result = (num >= 1) && (num <= 100);
		System.out.println("사용자가 입력한 수는 1에서 부터 100 사이의 값입니까? " + result);

	}

	public void method3() {

		System.out.println("알파벳 A~Z 까지의 문자를 입력해주세요");
		char ch = sc.nextLine().charAt(0);

		// 사용자가 입력한 값이 알파벳 A~Z 까지의 문자인지 확인

		// boolean result = (ch >= 'A') && (ch <= 'Z');
		// boolean result = ((int) ch >= (int) 'A') && ((int) ch <= (int) 'Z');
		boolean result = (ch >= 65) && (ch <= 90);

		System.out.println("사용자가 입력한 값이 알파벳 A~Z 까지의 문자입니까? " + result);
	}

	public void method4() {
		System.out.println("계속하시려면 y를 입력하세요. ");
		char ch = sc.nextLine().charAt(0);

		// 사용자가 입력한 값이 y인지 확인(대문자 Y도 가능)

		boolean result = (ch == 'y') || (ch == 'Y');
		System.out.println("사용자가 입력한 값이 y이나 Y가 입력되었습니까? " + result);

	}

	public void method5() {

		int num1 = 10;
		boolean result1 = (num1 < 5) && (++num1 > 0);
		// (10 < 5) && (++num1 > 0);
		// (10 < 5) 가 false가 나오면 그다음 조건에 대한 연산은 '무시'
		// 따라서 num1은 10
		// [단락회로평가]

		System.out.println("result1? " + result1);
		System.out.println("num1? " + num1);

		int num2 = 10;
		boolean result2 = (num2 < 20) || (++num2 > 0);
		// (10 < 20) || (++num1 > 0);
		// (10 < 20) 이 true 가 나오면 그다음 조건에 대한 연산을 '무시'
		// 따라서 num2는 10
		// [단락회로평가]

		System.out.println("result2? " + result2);
		System.out.println("num2? " + num2);

	}

}
