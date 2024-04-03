package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {

	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();

	public void mainMenu() {
		System.out.println("1. 지정 문자열");
		System.out.println("2. 입력 문자열");
		System.out.println("3. 프로그램 끝내기");
		System.out.print("메뉴 번호: ");
		int menu = sc.nextInt();
		sc.nextLine();

		switch (menu) {
		case 1:
			tokenMenu();
			break;
		case 2:
			inputMenu();
			break;
		case 3:
			System.out.println("프로그램을 종료합니다.");
			return;
		default:
			System.out.println("다시 입력해주세요.");
		}

	}

	public void tokenMenu() {
		String str = "J a v a P r o g r a m"; // 고정 문자열

		// 토큰 처리 전 글자, 토큰 처리 전 개수 출력
		System.out.println("토큰 처리 전 글자 : " + str);
		System.out.println("토큰 처리 전 개수 : " + str.length());

		// TokenController의 afterToken 함수 호출후 반환값을 가지고

		// 토큰 처리 후 글자, 토큰 처리 후 개수

		String st = tc.afterToken(str);
		System.out.println("토큰 처리 후 글자 : " + st);
		System.out.println("토큰 처리 후 개수 : " + st.length());
		// 모든 글자를 대문자로 변환하는 것을 출력
		System.out.println("모두 대문자로 변환 : " + st.toUpperCase());
	}

	public void inputMenu() {
		System.out.print("문자열을 입력하세요 : ");
		String str = sc.nextLine();

		String joinString = tc.firstCap(str);
		System.out.println("첫 글자 대문자 : " + joinString);

		System.out.print("찾을 문자 하나를 입력하세요 : ");
		char ch = sc.nextLine().charAt(0);
		int count = tc.findChar(joinString, ch);
		System.out.println(ch + " 문자가 들어간 개수 : " + count);

	}
}
