package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {

	private Scanner sc = new Scanner(System.in);
	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();

	/*
	public void inputMenu() {
		boolean isProgress = true;
		while (isProgress) {
			System.out.println("===== 도형 프로그램 =====");
			System.out.println("3. 삼각형");
			System.out.println("4. 사각형");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			switch (menuNum) {
			case 3:
				triangleMenu();
				break;
			case 4:
				squareMenu();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다. ");
				isProgress = false;
				break;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				continue;
			}
		}
	}
	
	public void triangleMenu() {
		boolean isProgress = true;
		while (isProgress) {
			System.out.println("===== 삼각형 =====");
			System.out.println("1. 삼각형 면적");
			System.out.println("2. 삼각형 색칠");
			System.out.println("3. 삼각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			switch (menuNum) {
			case 1:
				inputSize(3, menuNum);
				break;
			case 2:
				inputSize(3, menuNum);
				break;
			case 3:
				printInformation(3);
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				isProgress = false;
				break;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				continue;
			}
		}
	
	}
	
	public void squareMenu() {
		boolean isProgress = true;
		while (isProgress) {
			System.out.println("===== 사각형 =====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 면적");
			System.out.println("3. 사각형 색칠");
			System.out.println("4. 사각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			switch (menuNum) {
			case 1:
				inputSize(4, menuNum);
				break;
			case 2:
				inputSize(4, menuNum);
				break;
			case 3:
				inputSize(4, menuNum);
				break;
			case 4:
				printInformation(4);
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				isProgress = false;
				break;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
				continue;
			}
		}
	
	}
	
	public void inputSize(int type, int menuNum) {
		switch (type) {
		// 삼각형일때
		case 3:
			if (menuNum == 1) {
				System.out.print("높이 : ");
				double height = sc.nextDouble();
	
				System.out.print("너비 : ");
				double width = sc.nextDouble();
	
				double area = tc.calcArea(height, width);
				System.out.println("삼각형 면적 : " + area);
	
			} else if (menuNum == 2) {
				System.out.println("색깔을 입력하세요");
				sc.nextLine(); // \n 날리기
	
				String color = sc.nextLine();
				tc.paintColor(color);
				System.out.println("색이 수정되었습니다.");
			}
			break;
		// 사각형일때
		case 4:
			if (menuNum == 1) {
				System.out.print("높이 : ");
				double height = sc.nextDouble();
	
				System.out.print("너비 : ");
				double width = sc.nextDouble();
	
				double perimeter = scr.calcPerimeter(height, width);
				System.out.println("사각형 둘레 : " + perimeter);
	
			} else if (menuNum == 2) {
				System.out.print("높이 : ");
				double height = sc.nextDouble();
	
				System.out.print("너비 : ");
				double width = sc.nextDouble();
	
				double area = scr.calcArea(height, width);
				System.out.println("사각형 면적 : " + area);
			} else if (menuNum == 3) {
				System.out.println("색깔을 입력하세요");
				sc.nextLine(); // \n 날리기
	
				String color = sc.nextLine();
				scr.paintColor(color);
				System.out.println("색이 수정되었습니다.");
			}
			break;
		default:
		}
	}
	
	public void printInformation(int type) {
		switch (type) {
		case 3:
			System.out.println(tc.print());
			break;
		case 4:
			System.out.println(scr.print());
			break;
		}
	}
	
	*/
	// [강사님 코드]

	public void inputMenu() {
		while (true) {
			System.out.println("===== 도형 프로그램 =====");
			System.out.println("3. 삼각형");
			System.out.println("4. 사각형");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			sc.nextLine();

			switch (num) {
			case 3:
				triangleMenu();
				break;
			case 4:
				squareMenu();
				break;
			case 9:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못 입력했습니다. 다시 입력해주세요");
			}
		}
	}

	public void triangleMenu() {
		while (true) {
			System.out.println("==== 삼각형 ====");
			System.out.println("1. 삼각형 면적");
			System.out.println("2. 삼각형 색칠");
			System.out.println("3. 삼각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			sc.nextLine();

			switch (num) {
			case 1:
				inputSize(3, num);
				break;
			case 2:
				inputSize(3, num);
				break;
			case 3:
				printInformation(3);
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			}
		}
	}

	public void squareMenu() {
		while (true) {
			System.out.println("==== 사각형 ====");
			System.out.println("1. 사각형 둘레");
			System.out.println("2. 사각형 면적");
			System.out.println("3. 사각형 색칠");
			System.out.println("4. 사각형 정보");
			System.out.println("9. 메인으로");
			System.out.print("메뉴 번호 : ");
			int num = sc.nextInt();
			sc.nextLine();

			switch (num) {
			case 1:
				inputSize(4, num);
				break;
			case 2:
				inputSize(4, num);
				break;
			case 3:
				inputSize(4, num);
				break;
			case 4:
				printInformation(4);
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못된 번호입니다. 다시 입력해주세요.");
			}
		}
	}

	public void inputSize(int type, int menuNum) {

		if (type == 3) {
			if (menuNum == 1) {
				System.out.print("높이 : ");
				double height = sc.nextDouble();

				System.out.print("너비 : ");
				double width = sc.nextDouble();
				sc.nextLine();

				double area = tc.calcArea(height, width);
				System.out.println("삼각형 면적 : " + area); // 출력문 형식이 다를 수 있다.
			} else {
				System.out.print("색깔을 입력하세요: ");
				String color = sc.nextLine();
				tc.paintColor(color);
				System.out.println("색이 변경되었습니다.");
			}
		} else {
			if (menuNum == 1 || menuNum == 2) {

				System.out.print("높이 : ");
				double height = sc.nextDouble();

				System.out.print("너비 : ");
				double width = sc.nextDouble();
				sc.nextLine();
				if (menuNum == 1) {
					System.out.println("사각형의 둘레 : " + scr.calcPerimeter(height, width));

				} else {
					System.out.println("사각형의 면적 : " + scr.calcArea(height, width));
				}
			} else {
				System.out.print("색깔을 입력하세요: ");
				String color = sc.nextLine();
				scr.paintColor(color);
				System.out.println("색이 변경되었습니다.");
			}
		}

	}

	public void printInformation(int type) {

		// 3항연산자 사용으로 코드를 간결하게 만들었다.
		System.out.println(type == 3 ? tc.print() : scr.print());
	}

}
