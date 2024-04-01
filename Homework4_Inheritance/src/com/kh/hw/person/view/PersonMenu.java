package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonMenu {

	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();

	public void mainMenu() {
		while (true) {
			System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
			int[] person = pc.PersonCount();
			System.out.println("현재 저장된 학생은 " + person[0] + "명입니다.");
			System.out.println("사원은 최대 10명까지 저장할 수 있습니다.");
			System.out.println("현재 저장된 사원은 " + person[1] + "명입니다.");
			// M과 N에 들어가는 숫자는 PersonController(pc)클래스에 있는
			// personCount()메소드의 반환 값을 이용하여 출력

			System.out.println();
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9. 끝내기");
			System.out.print("메뉴 번호 :");
			int menuNum = sc.nextInt();
			// 잘못 입력했을 경우 “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복
			sc.nextLine();

			switch (menuNum) {
			case 1:
				studentMenu();
				break;
			case 2:
				employeeMenu();
				break;
			case 9:
				System.out.println("종료합니다.");
				return;

			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

	public void studentMenu() {
		int personNum = pc.PersonCount()[0];
		if (personNum != 3) {
			System.out.println("1. 학생 추가");
		} else {
			System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가 메뉴는 더 이상 활성화 되지 않습니다.");
		}

		System.out.println("2. 학생 보기");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 :");
		int menuNum = sc.nextInt();
		sc.nextLine(); // 개행문자 날림

		switch (menuNum) {
		case 2:
			printStudent();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			return;
		case 1:
			if (personNum != 3) {
				insertStudent();
				break;
			}
		default:
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		}
	}

	public void employeeMenu() {
		int personNum = pc.PersonCount()[1];
		if (personNum != 10) {
			System.out.println("1. 사원 추가");
		} else {
			System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가 메뉴는 더 이상 활성화 되지 않습니다.");
		}

		System.out.println("2. 사원 보기");
		System.out.println("9. 메인으로");
		System.out.print("메뉴 번호 :");
		int menuNum = sc.nextInt();
		sc.nextLine();

		switch (menuNum) {
		case 2:
			printEmployee();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다.");
			return;
		case 1:
			if (personNum != 10) {
				insertEmployee();
				break;
			}
		default:
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		}

	}

	public void insertStudent() {

		while (true) {
			System.out.print("학생 이름 :");
			String name = sc.nextLine();

			System.out.print("학생 나이 : ");
			int age = sc.nextInt();

			System.out.print("학생 키 : ");
			double height = sc.nextDouble();

			System.out.print("학생 몸무게 : ");
			double weight = sc.nextDouble();

			System.out.print("학생 학년 : ");
			int grade = sc.nextInt();

			System.out.print("학생 전공 : ");
			String major = sc.nextLine();
			sc.nextLine();

			int studentNum = pc.PersonCount()[0];
			if (studentNum == 3) {
				System.out.println("학생을 담을 수 있는 공간이 꽉 찼기 때문에 학생 추가를 종료하고 학생 메뉴로 돌아갑니다.");
				return;
			}

			pc.insertStudent(name, age, height, weight, grade, major);

			System.out.print("그만 하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 :");
			char ch = sc.nextLine().charAt(0);
			if (ch == 'n' || ch == 'N') {
				break;
			}
		}

	}

	public void printStudent() {
		Student[] arr = pc.printStudent();
		for (Student std : arr) {
			if (std != null) {
				System.out.println(std);
			}
		}

	}

	public void insertEmployee() {

		while (true) {
			System.out.print("사원 이름 :");
			String name = sc.nextLine();

			System.out.print("사원 나이 : ");
			int age = sc.nextInt();

			System.out.print("사원 키 : ");
			double height = sc.nextDouble();

			System.out.print("사원 몸무게 : ");
			double weight = sc.nextDouble();

			System.out.print("사원 급여 : ");
			int salary = sc.nextInt();

			System.out.print("사원 부서 : ");
			String dept = sc.nextLine();
			sc.nextLine();

			int employeeNum = pc.PersonCount()[1];
			if (employeeNum == 10) {
				System.out.println("사원을 담을 수 있는 공간이 꽉 찼기 때문에 사원 추가를 종료하고 사원 메뉴로 돌아갑니다.");
				return;
			}

			pc.insertEmployee(name, age, height, weight, salary, dept);

			System.out.print("그만 하시려면 N(또는 n), 이어하시려면 아무 키나 누르세요 :");
			char ch = sc.nextLine().charAt(0);
			if (ch == 'n' || ch == 'N') {
				break;
			}
		}
	}

	public void printEmployee() {
		Employee[] arr = pc.printEmployee();
		for (Employee emp : arr) {
			if (emp != null) {
				System.out.println(emp);
			}
		}
	}
}
