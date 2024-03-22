package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	/*
	 * 선택적으로 특정 코드만 실행시키고자 할때 
	 * => 제어문(조건문)
	 * 
	 * 특정 코드만 반복시키고 싶을때 
	 * => 제어문(반복문)
	 * 
	 * 반복문 내부에서 흐름을 제어할때
	 * => 분기문 
	 */

	Scanner sc = new Scanner(System.in);

	// 삼항 연산자를 조건문 형식으로 변경
	public void method1() {

		/*
		 * 단독 if문 
		 * 
		 * if(조건식){ 
		 * 	조건식의 결과가 true일 경우 실행되는 코드
		 * }
		 * 
		 */

		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();

		String result = "양수입니다.";
		/*
		if (num > 0) {
		
			result = "양수입니다.";
		}
		*/

		if (num < 0) {
			result = "양수가 아닙니다.";
		}

		System.out.println(result);

	}

	public void method2() {

		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("양수입니다.");
		} else {
			System.out.println("양수가 아니다. ");
		}
	}

	public void method3() {

		/*
		 * if ~ else if
		 * 같은 비교대상으로 여러개의 조건을 제시해야 하는 경우 사용
		 *
		 */
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();

		if (num > 0) {
			System.out.println("양수다.");
		} else if (num == 0) {
			System.out.println("0 이다.");

		} else {
			System.out.println("음수다.");
		}
	}

	public void method4() {

		// 실습문제를 통해 푼 문제를 if-else if문으로 고침

		// 사용자가 입력한 나이값을 가지고 어린이/청소년/성인
		// if ~ else if
		System.out.print("나이 입력: ");
		int age = sc.nextInt();

		// age가 13세 이하면 어린이
		// age가 13세 초과 19세 이하라면 청소년

		if (age <= 13) {
			System.out.println("어린이");
		} else if (age > 13 && age <= 19) {
			System.out.println("청소년");
		} else {
			System.out.println("성인");

		}
	}

	public void method5() {

		// 사용자에게 이름, 성별을 입력받아 남자인지 여자인지 출력

		System.out.print("이름: ");
		String name = sc.nextLine();

		System.out.println("성(M/F) : ");
		char gender = sc.nextLine().charAt(0);

		String result;

		if (gender == 'M' || gender == 'm') {
			result = "남학생";
		} else if (gender == 'F' || gender == 'f') {
			result = "여학생";
		} else {
			// result = ""; 1) else에도 무의미한 값 추가하기
			result = "성별을 잘못 입력하셨습니다.";
			return;
		}

		System.out.println(name + "님은 " + result);
	}

	public void method6() {
		// 문자열 간의 동등 비교

		System.out.println("이름: ");
		String name = sc.nextLine();

		if (name == "김지훈") {
			System.out.println(name + "님 반갑습니다!");
		} else {
			System.out.println("누구세요?");
		}

		// 문자열.equals("문자열")
		// 주소값 안에 저장된 실제 문자열을 비교해서 값이 맞으면 true, 틀리면 false 반환

		if (name.equals("김지훈")) {
			System.out.println(name + "님 반갑습니다!");
		}
	}

	public void method7() {

		// 양수를 입력받고, 입력받은 값이 짝수인지 홀수인지 판별하는 프로그램
		// 만약 양수가 아닌 경우, 양수가 아닙니다를 출력

		System.out.print("정수(양수) 입력 : ");
		int num = sc.nextInt();

		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("짝수입니다.");
			} else {
				System.out.println("홀수입니다.");
			}
		} else {
			System.out.println("양수가 아닙니다.");
		}
	}
}
