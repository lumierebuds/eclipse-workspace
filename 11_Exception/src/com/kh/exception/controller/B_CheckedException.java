package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException {

	/*
	 * CheckedException은 반드시 예외처리를 해줘야 되는 예외들
	 * (즉, 예측 불가능한 곳에서 에러가 발생할 가능성이 있는 에러들)
	 * => 따라서 예외처리가 필수이며, 주로 알수없는 외부매체와의 입출력시 발생.
	 * 
	 */

	public void method1() {
		try {
			method2();
		} catch (IOException e) {
			System.out.println();
		}

	}

	public void method2() throws IOException {
		// Scanner sc = new Scanner(System.in);

		// Scanner와 같이 키보드로 값을 입력받을 수 있는 객체(성능 빠름)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("아무 문자열이나 입력해주십쇼. ");
		/*
		try {
			String string = br.readLine();
			// 이 메서드를 호출할거라면, 반드시 IOException
			// 예외를 처리해줘야한다.
		
			System.out.println("문자열의 길이 : " + string.length());
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		*/

		// 예외처리방법 1. try~catch() ⇒ 발생한 예외를 직접 처리

		// 예외처리방법 2. throws : 발생한 예외를 그자리에서 해결하지 않고, 현재 메서드를 호출하는 곳으로 예외를 넘기는 방법.

		String string = br.readLine();

	}

	/*
	 * 예외발생시점														예외처리
	 * RuntimeException 프로그램 실행 도중 => 런타임에러(컴파일에러x)			필수가 아님. (조건식으로 처리)
	 * IOException      그 외 => 컴파일 에러   								필수(반드시 예외처리해줘야함)
	 * 
	 */

}
