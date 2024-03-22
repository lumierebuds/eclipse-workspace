package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {

		while (true) {
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			if (num >= 1) {
				for (int i = 1; i <= num; i++) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				continue;
			}
		}
	}

	public void practice2() {

		while (true) {
			System.out.print("1 이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			if (num >= 1) {
				for (int i = num; i >= 1; i--) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				continue;
			}
		}
	}

	public void practice3() {
		// 1부터 사용자에게 입력받은 수까지의 정수들의 합을 출력

		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		int sum = 0;

		for (int i = 1; i <= num; i++) {
			System.out.print(i);
			sum += i;
			// i 가 num이랑 같으면
			// 피연산자가 8개 있으면 총 7개의 + 를 붙여주고
			// 마지막에 (i==8)이면 '='을 붙여준다.
			if (i == num) {
				System.out.print(" = ");
			} else {
				System.out.print(" + ");
			}
		}
		System.out.println(sum);
	}

	public void practice4() {

		while (true) {
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();

			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();

			if (num1 >= 1 && num2 >= 1) {

				// 첫번째 입력한 수가 더 클때
				if (num1 > num2) {
					for (int i = num2; i <= num1; i++) {
						System.out.print(i + " ");
					}

				}
				// 두번째 입력한 수가 더 클때
				else {
					for (int i = num1; i <= num2; i++) {
						System.out.print(i + " ");
					}
				}
				System.out.println();

			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
				continue;
			}
		}
	}

	public void practice5() {

		while (true) {
			System.out.print("숫자: ");
			int dan = sc.nextInt();

			if (dan > 9) {
				System.out.println("9 이하의 숫자만 입력해주세요.");
				continue;
			} else {
				for (int i = dan; i <= 9; i++) {
					System.out.printf("===== %d단 =====\n", i);
					for (int j = 1; j <= 9; j++) {
						System.out.printf("%d x %d = %d\n", i, j, (i * j));
					}
				}
				break;
			}
		}
	}

	public void practice6() {
		System.out.print("시작 숫자 :");
		int first = sc.nextInt();

		System.out.print("공차 : ");
		int differ = sc.nextInt();

		for (int i = 0; i < 10; i++) {
			System.out.print(first + " ");
			first = first + differ;
		}
	}

	public void practice7() {

		// 계산기
		while (true) {

			System.out.print("연산자(+, -, *, /, %) : ");
			String ch = sc.nextLine();

			System.out.print("정수1 : ");
			int num1 = sc.nextInt();

			System.out.print("정수2 : ");
			int num2 = sc.nextInt();

			// 연산자가 아닐때
			if (!(ch.charAt(0) == '+' || ch.charAt(0) == '-' || ch.charAt(0) == '*' || ch.charAt(0) == '/'
					|| ch.charAt(0) == '%')) {
				System.out.println("없는 연산자입니다. 다시 입력해주세요.");
				continue;
			} else if (ch.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				switch (ch.charAt(0)) {
				case '+':
					System.out.printf("%d + %d = %d", num1, num2, (num1 + num2));
					break;
				case '-':
					System.out.printf("%d - %d = %d", num1, num2, (num1 - num2));
					break;
				case '*':
					System.out.printf("%d * %d = %d", num1, num2, (num1 * num2));
					break;
				case '/':
					if (num2 == 0) {
						System.out.println("0으로 나누면 안됩니다. 다시 해주세요");
						break;
					} else {
						System.out.printf("%d / %d = %d", num1, num2, (num1 / num2));
						break;
					}

				case '%':
					System.out.printf("%d % %d = %d", num1, num2, (num1 % num2));
					break;

				}
			}
		}

	}
}
