package com.kh.practice.generics.view;

import java.util.Scanner;

import com.kh.practice.generics.controller.FarmController;
import com.kh.practice.generics.model.vo.Farm;
import com.kh.practice.generics.model.vo.Fruit;
import com.kh.practice.generics.model.vo.Nut;
import com.kh.practice.generics.model.vo.Vegetable;

public class FarmMenu {

	private Scanner sc = new Scanner(System.in);

	private FarmController fc = new FarmController();

	public void mainMenu() {

		while (true) {

			System.out.println("========== KH 마트 ==========");
			System.out.println("******* 메인 메뉴 *******");
			System.out.println("1. 직원메뉴");
			System.out.println("2. 손님 메뉴");
			System.out.println("9. 종료");

			System.out.print("메뉴 번호 선택 : ");
			int menu = Integer.parseInt(sc.nextLine());
			switch (menu) {
			case 1:
				adminMenu();
				break;
			case 2:
				customerMenu();
				break;
			case 9:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}

	public void adminMenu() {

		while (true) {
			System.out.println("******* 직원 메뉴 *******");
			System.out.println("1. 새 농산물 추가");
			System.out.println("2. 종류 삭제");
			System.out.println("3. 수량 수정");
			System.out.println("4. 농산물 목록");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 선택 : ");

			int menu = Integer.parseInt(sc.nextLine());
			switch (menu) {
			case 1:
				addNewKind();
				break;
			case 2:
				removeKind();
				break;
			case 3:
				changeAmount();
				break;
			case 4:
				printFarm();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}

	public void customerMenu() {

	}

	public void addNewKind() {

		Farm f = null;
		String name; // null
		int amount; // 0

		while (true) {

			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("추가할 종류 번호 : ");
			int kind = Integer.parseInt(sc.nextLine());

			System.out.print("이름 : ");
			name = sc.nextLine();

			System.out.print("수량 : ");
			amount = Integer.parseInt(sc.nextLine());

			switch (kind) {
			case 1:
				f = new Fruit(name);
				f.setKind("과일");
				break;
			case 2:
				f = new Vegetable();
				f.setKind("채소");
				break;
			case 3:
				f = new Nut();
				f.setKind("견과");
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			break;
		}

		boolean result = fc.addNewKind(f, amount);
		if (result) {
			System.out.println("새 농산물이 추가되었습니다.");
			return;
		}
		System.out.println("새 농산물 추가에 실패하였습니다. 다시 입력해주세요.");
	}

	public void removeKind() {

	}

	public void changeAmount() {

	}

	public void printFarm() {

	}

	public void buyFarm() {

	}

	public void removeFarm() {

	}

	public void printBuyFarm() {

	}

}
