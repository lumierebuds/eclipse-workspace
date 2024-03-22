package com.kh.chap02.branch;

import java.util.Scanner;

public class A_Break {

	/*
	 * break: 반복문 내부에서 break 문을 만나는 순간 현재 속해있는 반복문을 빠져 나감
	 * 
	 * "주의점"
	 * switch 문안의 break는 switch 문만 빠져나가는 역할을 함. 
	 */

	public void method1() {

		// 매번 반복적으로 랜덤값을 출력(1~100)
		// 단 랜덤값이 13의 배수일 경우 반복문 탈출
		while (true) {
			int random = (int) (Math.random() * 100 + 1);

			if (random % 13 == 0) {
				System.out.println("랜덤값 " + random + "은 13의 배수입니다");
				break;
			} else {
				System.out.println("랜덤값: " + random);
			}
		}
	}

	public void method2() {

		Scanner sc = new Scanner(System.in);
		// 매번 사용자에게 문자열을 입력받은 후, 문자열의 길이를 출력한다. - 무한반복
		// 단, 입력된 문자열이 “exit”이라면 반복을 종료한다.

		while (true) {
			System.out.print("문자열을 입력해주세여(종료하려면 exit을 입력해주세요) : ");
			String str = sc.nextLine();

			System.out.println("문자열의 길이 : " + str.length());
			if (str.equals("exit")) {
				System.out.println("exit이 입력되었습니다. 프로그램을 종료합니다.");
				break;
			}
		}

	}

}
