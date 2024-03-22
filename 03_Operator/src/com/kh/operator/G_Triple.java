package com.kh.operator;

import java.util.Scanner;

public class G_Triple {

	/*	삼항 연산자 
	 * 	- 3개의 항목을 가지고 연산하는 연산자
		- 표현법
		- [조건식] ? [조건의 결과가 true인 경우 결과값] : [false인 경우의 결과값]
	 */
	Scanner sc = new Scanner(System.in);

	public void method1() {

		// 사용자가 입력한 정수값이 양수인지 아닌지 판별
		// 양수라면 "양수입니다."
		// 음수라면 "음수입니다."
		// 문자열을 반환

		System.out.println("정수를 입력해주세요: ");
		int num = sc.nextInt();

		String str = (num > 0) ? "양수입니다." : "음수입니다.";

		System.out.println("입력받은 정수는 양수입니까? " + str);
	}

	public void method2() {

		// 사용자로부터 종료의사여부를 입력받은 후 판별해서 출력

		System.out.println("프로그램을 계속하시려면 y를 눌러주세요");

		char ch = sc.nextLine().charAt(0);

		String str = (ch == 'y' || ch == 'Y') ? "프로그램을 계속 진행하겠습니다." : "프로그램을 종료합니다.";
		System.out.println(str);

	}

	public void method3() {

		// 사용자가 입력한 값이 양수, 0, 음수인지 정확하게 판별
		// method1 보완

		System.out.println("정수값 입력: ");
		int num = sc.nextInt();

		String result = (num > 0) ? "양수입니다." : (num == 0) ? "0 입니다." : "음수입니다.";
		// [중복 3항연산자] : 코드가 지저분해진다.
		// 내부에 조건문이 포함된것이다.
		System.out.println("입력받은 정수 " + num + "은 " + result);

	}

	public void method4() {

		// 두개의 정수값과 + 혹은 -의 문자를 하나 입력 받아서
		// + 일 경우 덧셈, - 일 경우 뺄셈연산된 결과를 출력
		// 둘다 (+,-) 가 아니면 "잘못입력하였습니다" 출력

		System.out.println("첫번째 정수: ");
		int num1 = sc.nextInt();

		System.out.println("두번째 정수: ");
		int num2 = sc.nextInt();

		sc.nextLine();
		System.out.println("연산자 입력(+,-): ");
		char op = sc.nextLine().charAt(0);

		// String result = (op == '+' || op == '-') ? (op == '+') ? (num1 + num2) + "" :
		// (num1 - num2) + "" : "잘못입력하였습니다.";

		String result = (op == '+') ? (num1 + num2) + "" : (op == '-') ? (num1 - num2) + "" : "잘못입력하였습니다.";

		System.out.println(result);

	}
}
