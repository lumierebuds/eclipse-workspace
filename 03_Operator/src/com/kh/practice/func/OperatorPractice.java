package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {

		System.out.print("인원수: ");
		int people = sc.nextInt();

		System.out.print("사탕 개수: ");
		int candys = sc.nextInt();

		System.out.println("1인당 사탕 개수: " + (candys / people));
		System.out.println("남는 사탕 개수: " + (candys % people));
	}

	public void practice2() {

		System.out.print("이름 : ");
		String name = sc.nextLine();

		System.out.print("학년(숫자만) : ");
		int grade = sc.nextInt();

		System.out.print("반(숫자만) : ");
		int ban = sc.nextInt();

		System.out.print("번호(숫자만) : ");
		int number = sc.nextInt();

		sc.nextLine();

		System.out.print("성별(M/F) : ");
		String gender = (sc.nextLine().charAt(0) == 'M') ? "남학생" : (sc.nextLine().charAt(0) == 'F') ? "여학생" : "잘못입력";

		System.out.print("성적(소수점 아래 둘째 자리까지) : ");
		double score = sc.nextDouble();

		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다", grade, ban, number, name, gender, score);
	}

	public void practice3() {

		System.out.print("나이: ");
		int age = sc.nextInt();
		String check = (age > 19) ? "성인" : (age > 13) ? "청소년" : "어린이";
		System.out.println(check);

	}

	public void practice4() {

		System.out.print("국어 : ");
		int korean = sc.nextInt();

		System.out.print("영어 : ");
		int english = sc.nextInt();

		System.out.print("수학 : ");
		int math = sc.nextInt();

		int sum = korean + english + math;
		double avg = sum / 3.0;

		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);

		// 세 과목 점수가 각각 40 점 이상이면서 평균이 60점 이상일때 합격
		String pass = (korean >= 40 && english >= 40 && math >= 40 && avg >= 60) ? "합격" : "불합격";
		System.out.println(pass);
	}

	public void practice5() {
		// 주민번호를 이용해 남자인지 여자인지 구분해 출력

		System.out.print("주민번호를 입력하세요(- 포함) : ");
		char code = sc.nextLine().charAt(7);
		String gender = (code == '1' || code == '3') ? "남자" : (code == '2' || code == '4') ? "여자" : "식별불가";

		System.out.println(gender);
	}

	public void practice6() {
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();

		System.out.print("정수2 : ");
		int num2 = sc.nextInt();

		System.out.print("입력 : ");
		int another = sc.nextInt();

		// boolean result = (another <= num1 || another > num2) ? true : false;

		boolean result = (another <= num1 || another > num2);

		System.out.println(result);
	}

	public void practice7() {

		System.out.print("입력1 : ");
		int num1 = sc.nextInt();

		System.out.print("입력2 : ");
		int num2 = sc.nextInt();

		System.out.print("입력3 : ");
		int num3 = sc.nextInt();

		// boolean result = (num1 == num2 && num1 == num3) ? true : false;

		boolean result = (num1 == num2 && num1 == num3);

		System.out.println(result);

	}

	public void practice8() {
		System.out.print("A사원의 연봉 : ");
		int aSalary = sc.nextInt();

		System.out.print("B사원의 연봉 : ");
		int bSalary = sc.nextInt();

		System.out.print("C사원의 연봉 : ");
		int cSalary = sc.nextInt();

		double aTotal = aSalary + (aSalary * 0.4);
		double bTotal = bSalary;
		double cTotal = cSalary * 1.15;

		String aResult = (aTotal >= 3000) ? "3000 이상" : "3000 미만";
		String bResult = (bTotal >= 3000) ? "3000 이상" : "3000 미만";
		String cResult = (cTotal >= 3000) ? "3000 이상" : "3000 미만";

		System.out.printf("A사원 연봉/연봉+a : %d/%.1f\n%s\n", aSalary, aTotal, aResult);
		System.out.printf("B사원 연봉/연봉+a : %d/%.1f\n%s\n", bSalary, bTotal, bResult);
		System.out.printf("C사원 연봉/연봉+a : %d/%f\n%s\n", cSalary, cTotal, cResult);

	}
}
