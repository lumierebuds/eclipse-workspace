package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Switch {

	Scanner sc = new Scanner(System.in);

	public void method1() {

		// 1~3 사이의 정수값을 입력받아
		// 1 이면 "빨간불입니다"
		// 2 파란
		// 3 초록

		// 잘못입력시 "잘못입력했습니다."

		System.out.print("1~3 사이의 정수를 입력해주세요: ");
		int number = sc.nextInt();

		switch (number) {
			case 1:
				System.out.println("빨간불입니다.");
				break;
			case 2:
				System.out.println("파란불입니다.");
				break;
			case 3:
				System.out.println("초록불입니다.");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
		}
		
		
		
	}
}
