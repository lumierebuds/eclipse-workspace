package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {

	Scanner sc = new Scanner(System.in);

	public void practice1() {
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");

		int menu = sc.nextInt();

		switch (menu) {
		case 1:
			System.out.println("입력메뉴입니다.");
			break;
		case 2:
			System.out.println("수정메뉴입니다.");
			break;
		case 3:
			System.out.println("조회메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제메뉴입니다.");
			break;
		case 7:
			System.out.println("프로그램이 종료됩니다.");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}
	}

	public void practice2() {
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("짝수다");
			} else {
				System.out.println("홀수다");
			}
		} else {
			System.out.println("양수만 입력해주세요.");
		}
	}

	public void practice3() {
		// 국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
		// 합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.

		System.out.print("국어점수 : ");
		int kor = sc.nextInt();

		System.out.print("수학점수 : ");
		int math = sc.nextInt();

		System.out.print("영어점수 : ");
		int eng = sc.nextInt();

		int sum = kor + math + eng;
		double avg = sum / 3.0;

		/*
		if (kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("축하합니다, 합격입니다!");
		} else {
			System.out.println("불합격 입니다.");
		}
		*/

		// if 문 한개만 써서 실행
		if (!(kor >= 40 && eng >= 40 && math >= 40 && avg >= 60)) {
			System.out.println("불합격 입니다.");
			return;
		}
		System.out.println("국어 : " + kor);
		System.out.println("수학 : " + math);
		System.out.println("영어 : " + eng);
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("축하합니다, 합격입니다!");

	}

	public void practice4() {
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();
		switch (month) {

		case 1:
		case 2:
		case 12:
			System.out.println(month + "월은 겨울입니다.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println(month + "월은 봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println(month + "월은 여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println(month + "월은 가을입니다.");
			break;
		default:
			System.out.println(month + "월은 잘못 입력된 달입니다.");
			break;

		}
	}

	public void practice5() {

		String Id = "아이디";
		String Pw = "비밀번호";

		System.out.print("아이디: ");
		String userId = sc.nextLine();

		System.out.print("비밀번호: ");
		String userPw = sc.nextLine();

		if (userId.equals(Id) && userPw.equals(Pw)) {
			System.out.println("로그인 성공");
		} else {
			if (!userPw.equals(Pw)) {
				System.out.println("비밀번호가 틀렸습니다.");
			} else if (!userId.equals(Id)) {
				System.out.println("아이디가 틀렸습니다.");
			}
		}
	}

	public void practice6() {
		System.out.print("권한을 확인하고자 하는 회원 등급: ");
		String grade = sc.nextLine();

		switch (grade) {
		case "관리자":
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
			break;
		case "회원":
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
			break;
		case "비회원":
			System.out.println("게시글 조회");
			break;
		default:
			System.out.println("잘못된 값이 들어왔습니다.");
		}
	}

	public void practice7() {
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();

		/*
			BMI = 몸무게 / (키(m) * 키(m))
			BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
			BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
			BMI가 30이상일 경우 고도 비만
		 
		*/
		double bmi = weight / (height * height);
		System.out.print("BMI 지수 : " + bmi + "\n");

		if (bmi < 18.5) {
			System.out.println("저체중");
		} else if (bmi < 23) {
			System.out.println("정상 체중");
		} else if (bmi < 25) {
			System.out.println("과체중");
		} else if (bmi < 30) {
			System.out.println("비만");
		} else {
			System.out.println("고도 비만");
		}
	}

	public void practice8() {

		System.out.print("피연산자1 입력 :");
		int num1 = sc.nextInt();

		System.out.print("피연산자2 입력 :");
		int num2 = sc.nextInt();

		sc.nextLine();

		System.out.print("연산자를 입력(+,-,*,/,%) : ");
		char op = sc.nextLine().charAt(0);
		double result = 0;

		if (num1 > 0 && num2 > 0) {
			switch (op) {
			case '+':
				result = num1 + num2;
				System.out.println(num1 + " + " + num2 + " = " + result);
				break;
			case '-':
				result = num1 - num2;
				System.out.println(num1 + " - " + num2 + " = " + result);
				break;
			case '*':
				result = num1 * num2;
				System.out.println(num1 + " * " + num2 + " = " + result);
				break;
			case '/':
				result = num1 / (double) num2;
				System.out.println(num1 + " / " + num2 + " = " + result);
				break;
			case '%':
				result = num1 % (double) num2;
				System.out.println(num1 + " % " + num2 + " = " + result);
				break;
			default:
				System.out.println("잘못 입력 하였습니다. 프로그램을 종료합니다.");
			}
		} else {
			System.out.println("양의 정수를 입력해주세요");
		}

	}

	/*
	public void practice9() {
	
		System.out.print("중간 고사 점수: ");
		int mid = sc.nextInt();
	
		System.out.print("기말 고사 점수: ");
		int fin = sc.nextInt();
	
		System.out.print("과제 점수: ");
		int task = sc.nextInt();
	
		System.out.print("출석 회수: ");
		int attend = sc.nextInt();
	
		double midPer = mid * 20 / 100;
		double finPer = fin * 30 / 100;
		double taskPer = task * 30 / 100;
		double attendPer = attend;
	
		double totalPer = (midPer + finPer + taskPer + attendPer);
	
		System.out.println("================= 결과 =================");
	
		if (totalPer < 70 || attendPer < 15) {
			if (totalPer < 70)
				System.out.println("FAIL");
			else
				System.out.printf("FAIL [출석 회수부족 (%d/20)]\n", attend);
	
		} else {
			System.out.println("중간 고사 점수(20): " + midPer);
			System.out.println("기말 고사 점수(30): " + finPer);
			System.out.println("과제 점수(30): " + taskPer);
			System.out.println("출석 점수(20): " + attendPer);
			System.out.println("총점 " + totalPer);
			System.out.println("PASS");
		}
	
	}
	*/

	/* 강사님 코드 */

	public void practice9() {
		System.out.print("중간 고사 점수 :");
		double semiScore = sc.nextInt() * 0.2;

		System.out.print("기말 고사 점수: ");
		double finalScore = sc.nextInt() * 0.3;

		System.out.print("과제점수 : ");
		double homeworkScore = sc.nextInt() * 0.3;

		System.out.print("출석회수 : ");
		int attend = sc.nextInt();
		// 전체강의에서 30% 이상 결석시 fail
		// 20일 * 30/100 => 6일 이상 결석시 fail

		System.out.println("================= 결과 =================");
		if (!(attend > 14)) { // attend가 출석일인데 14일보다 높으면 true / true를 부정연산시에는 false
			System.out.println("FAIL [출석 회수 부족 (" + attend + "/20)]");
			return;
		}

		boolean result = false;
		double sum = semiScore + finalScore + homeworkScore + attend;

		if (sum >= 70) {
			result = true;
		}

		System.out.println("중간 고사 점수(20): " + semiScore);
		System.out.println("기말 고사 점수(30): " + finalScore);
		System.out.println("과제 점수(30): " + homeworkScore);
		System.out.println("출석 점수(20): " + attend);
		System.out.println("총점 " + sum);
		System.out.println(result ? "PASS" : "FAIL");
		// 삼항연산자는 조건을 검사한다.
		// 이때 조건을 검사했을때의 값은 true 또는 false이다.
		// 그렇기 때문에 그냥 boolean 값을 조건에 넣어주게 된다면
		// 이를 값을 확인해서 실행한다.

	}

	public void practice10() {

		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		System.out.print("선택: ");
		int method = sc.nextInt();
		switch (method) {
		case 1:
			System.out.println("================");
			practice1();
			break;
		case 2:
			System.out.println("================");
			practice2();
			break;
		case 3:
			System.out.println("================");
			practice3();
			break;
		case 4:
			System.out.println("================");
			practice4();
			break;
		case 5:
			System.out.println("================");
			practice5();
			break;
		case 6:
			System.out.println("================");
			practice6();
			break;
		case 7:
			System.out.println("================");
			practice7();
			break;
		case 8:
			System.out.println("================");
			practice8();
			break;
		case 9:
			System.out.println("================");
			practice9();
			break;
		default:
			System.out.println("잘못된 입력입니다. 프로그램을 종료합니다.");
			break;
		}
	}

	/*
	public void practice11() {
		System.out.print("비밀번호 입력(1000~9999): ");
		int password = sc.nextInt();
	
		if (password / 10000 > 0 || password / 1000 == 0) {
			System.out.println("자리수 안맞음");
		} else {
	
			int num1 = (password / 1000); // 5421 / 1000 => 5
			int num2 = (password % 1000) / 100; // 421 / 100 =>4
			int num3 = (password % 1000 % 100) / 10; // 21 / 10 => 2
			int num4 = (password % 1000 % 100 % 10); // 1
	
			// 자릿수 별로 서로서로 비교
			if (num1 == num2 || num1 == num3 || num1 == num4) {
				System.out.println("실패");
			} else if (num2 == num1 || num2 == num3 || num2 == num4) {
				System.out.println("실패");
			} else if (num3 == num1 || num3 == num2 || num3 == num4) {
				System.out.println("실패");
			} else {
				System.out.println("성공");
			}
		}
	}
	*/

	public void practice11() {
		System.out.println("비밀번호 입력(1000~9999) : ");
		int pwd = sc.nextInt();

		// 비밀번호가 1000 ~ 9999 사이일때만 비교하도록 한다.
		// 어려운 계산식을 안써도 됨... ㅠㅠ
		if (pwd >= 1000 && pwd <= 9999) {

			int thousand = pwd / 1000; // 9999 -> 9
			int hundread = pwd % 1000 / 100; // 9999 -> 999 / 100
			int tens = pwd % 100 / 10; // 9999 -> 99 / 10 -> 9
			int ones = pwd % 10; // 9999 - 9

			boolean result = (thousand == hundread || thousand == tens || thousand == ones || hundread == tens
					|| hundread == ones || tens == ones);
			if (result) { // 중복값이 하나 이상 존재함
				System.out.println("실패");
			} else { // 중복값이 하나도 없음
				System.out.println("성공");
			}

		} else {
			System.out.println("자리수 안맞음");
		}

	}
}
