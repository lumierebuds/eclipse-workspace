package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {

	public void method1() {
		// 10번 반복하고 싶은 경우?
		for (int i = 0; i < 10; i++) {
			System.out.println("안녕하세요" + i);
		}

		// i 값을 1~5증가시키면서 출력
		for (int i = 1; i < 6; i++) {
			System.out.println(i);
		}

		// 초기, 조건, 증감식이 없어도 돌아간다.
		int i = 1;
		for (;;) {
			if (i < 6)
				System.out.println(i++);
		}
	}

	public void method2() {

		// 숫자를 연속해서 출력하도록 하기 (옆으로 1~5)

		// 1 2 3 4 5
		for (int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
		}

		System.out.println();

		// 5 4 3 2 1
		for (int i = 5; i > 0; i--) {
			System.out.print(i + " ");
		}

		System.out.println();

		// i 값이 1에서부터 10 사이의 홀수만 출력
		// 1 3 5 7 9
		for (int i = 1; i < 11; i++) {
			if (i % 2 != 0) { //
				System.out.print(i + " ");
			}
		}

		System.out.println();

		// 또 다른 방법 - 2씩 더해준다.
		// 1 3 5 7 9
		for (int i = 1; i < 10; i += 2) {
			System.out.print(i + " ");
		}

		System.out.println();

		// 1 2 3 4 5 6 7 8 9 10
		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");
		}

		System.out.println();
	}

	public void method3() {
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum += i;
			// sum += 1;
			// sum += 2;
			// sum += 3;
			// ........
			// sum += 10
			// 10 ++ => 11이 되면 실행 x
		}
		System.out.println("sum = " + sum);

	}

	public void method4() {
		// 스캐너를 활용한 1~n까지의 합을 구하기

		Scanner sc = new Scanner(System.in);
		System.out.print("양수를 입력하시오 : ");
		int num = sc.nextInt();
		int sum = 0;
		// 입력받은 수가 양수인 경우, 1~num 까지의 총합을 구한후 출력
		// 출력형식: 1에서 부터 num까지의 총 합계: xx

		// 입력받은 수가 양수가 아닌 경우: 잘못 입력했습니다.

		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				sum += i; // sum = sum + i;
			}
			System.out.printf("1에서부터 %d까지의 총 합계 : %d", num, sum);

		} else {
			System.out.println("잘못 입력했습니다.");
		}

	}

	public void method5() {
		// 1에서부터 랜덤값 (1~10 사이의 랜덤한 정수) 까지의 총 합계
		/*
		 * 
		 * java.lang.Math 클래스에 정의 되어 있는 random() 메서드를 호출하여 매번 
		 * 다른 랜덤값을 얻어올 수 있음.
		 * 
		 * 0.0 ~ 0.9999999999 사이의 랜덤값 발생 
		 * 0.0 <= 랜덤값 < 1
		 * 0.0 <= 랜덤값 < 45.0
		 * 0.0 <= 랜덤값 < 46.0
		 * 
		 * [표현법]
		 * (int) Math.random() * 출력하고자 하는 갯수 + 시작수
		 * 시작수 ~ (시작수 + 갯수)
		 * 
		 */

		// double random = Math.random(); // 1 ~ 10
		int randInt = (int) (Math.random() * 10 + 1);
		int sum = 0;

		for (int i = 1; i <= randInt; i++) {
			sum += i;
		}
		System.out.println("랜덤값: " + randInt);
		System.out.println("랜덤 까지의 총 합계: " + sum);
	}

	public void method6() {
		String str = "hello";

		/*
		 * h -> str.charAt(0)
		 * e -> str.charAt(1)
		 * l -> str.charAt(2)
		 * l -> str.charAt(3)
		 * o -> str.charAt(4)
		 */

		// 문자열에 글자 한개씩 찾아서 출력하기
		for (int i = 0; i < 5; i++) {
			System.out.print(str.charAt(i));
		}

		System.out.println();

		// 문자열.length(); 문자열의 길이를 반환해부는 함수
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
		}

		System.out.println();

		// 문자열을 거꾸로 출력하기

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}

	}

	public void method7() {
		// 구구단 2단 출력하기
		for (int i = 1; i < 10; i++) {
			// System.out.println("2 X " + i + " = " + (2 * i));
			System.out.printf("2 x %d = %d\n", i, (2 * i));
		}
	}

	public void method8() {
		// 구구단 2~9단 모두 출력 하기
		// 힌트) 중첩 반복문

		for (int i = 2; i < 9; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d x %d = %d\n", i, j, i * j);
			}
			System.out.println("==========");
		}
	}

	public void method9() {

		/*
		 * 1 2 3 4 5
		 * 1 2 3 4 5
		 * 1 2 3 4 5
		 * 1 2 3 4 5
		 * 1 2 3 4 5
		 */

		// 위의 출력을 중첩 반복문으로 출력하기

		for (int i = 0; i < 5; i++) { // 5번 반복시키는 반복문
			for (int j = 1; j < 6; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

	public void method10() {
		/*
		 * 1 * * * *
		 * * 2 * * *
		 * * * 3 * *
		 * * * * 4 *
		 * * * * * 5
		 */

		// 위의 출력을 중첩 반복문으로 출력하기

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				// 외부 반복조건과 내부 반복조건의 값이 같으면 해당 정수 출력
				if (i == j) {
					System.out.print(i + " ");
				}
				// 아닐때는 별표(*) 출력
				else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}

}
