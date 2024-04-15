package com.kh.practice.generics.view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
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

		while (true) {
			System.out.println("******* 고객 메뉴 *******");
			System.out.println("1. 농산물 사기");
			System.out.println("2. 농산물 빼기");
			System.out.println("3. 구입한 농산물 보기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 선택 : ");

			int menu = Integer.parseInt(sc.nextLine());
			switch (menu) {
			case 1:
				buyFarm();
				break;
			case 2:
				removeFarm();
				break;
			case 3:
				printBuyFarm();
				break;
			case 9:
				System.out.println("메인으로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");
			}
		}
	}

	// [관리자 메뉴]
	public void addNewKind() {

		Farm f = null;
		String name; // null
		int amount; // 0
		int kind;

		while (true) {

			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("추가할 종류 번호 : ");
			kind = Integer.parseInt(sc.nextLine());

			System.out.print("이름 : ");
			name = sc.nextLine();

			System.out.print("수량 : ");
			amount = Integer.parseInt(sc.nextLine());

			switch (kind) {
			case 1:
				f = new Fruit("과일", name);
				break;
			case 2:
				f = new Vegetable("채소", name);
				break;
			case 3:
				f = new Nut("견과", name);
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
		System.out.println("새 농산물 추가에 실패하였습니다. ");
	}

	public void removeKind() {

		Farm f = null;
		String name; // null
		int kind;

		while (true) {

			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("삭제할 종류 번호 : ");
			kind = Integer.parseInt(sc.nextLine());

			System.out.print("이름 : ");
			name = sc.nextLine();

			switch (kind) {
			case 1:
				f = new Fruit("과일", name);
				break;
			case 2:
				f = new Vegetable("채소", name);
				break;
			case 3:
				f = new Nut("견과", name);
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			break;
		}

		boolean result = fc.removeKind(f);
		if (result) {
			System.out.println("농산물 삭제에 성공하였습니다.");
			return;
		}
		System.out.println("농산물 삭제에 실패했습니다.");
	}

	public void changeAmount() {

		Farm f = null;
		String name; // null
		int kind;
		int amount;

		while (true) {

			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("수정할 종류 번호 : ");
			kind = Integer.parseInt(sc.nextLine());

			System.out.print("이름 : ");
			name = sc.nextLine();

			System.out.print("수정할 수량 : ");
			amount = Integer.parseInt(sc.nextLine());

			switch (kind) {
			case 1:
				f = new Fruit("과일", name);
				break;
			case 2:
				f = new Vegetable("채소", name);
				break;
			case 3:
				f = new Nut("견과", name);
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			break;
		}

		boolean result = fc.changeAmount(f, amount);
		if (result) {
			System.out.println("농산물 수량이 수정되었습니다.");
			return;
		}
		System.out.println("농산물 수정에 실패했습니다.");

	}

	public void printFarm() {

		HashMap<Farm, Integer> hMap = fc.printFarm();

		for (Entry<Farm, Integer> entry : hMap.entrySet()) {
			Farm farm = entry.getKey();
			Integer amount = entry.getValue();
			System.out.println(farm + "(" + amount + "개)");
		}
		System.out.println();

	}

	// [소비자 메뉴]

	public void buyFarm() {

		Farm f = null;
		String name; // null
		int kind;

		while (true) {

			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("구매 종류 번호 : ");
			kind = Integer.parseInt(sc.nextLine());

			System.out.print("구매할 것 : ");
			name = sc.nextLine();

			switch (kind) {
			case 1:
				f = new Fruit("과일", name);
				break;
			case 2:
				f = new Vegetable("채소", name);
				break;
			case 3:
				f = new Nut("견과", name);
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			break;
		}

		boolean result = fc.buyFarm(f);
		if (result) {
			System.out.println("구매에 성공하였습니다.");
			System.out.println("현재 KH마트 농산물 수량");
			printFarm();
			return;
		}
		System.out.println("구매에 실패하였습니다.");
	}

	public void removeFarm() {

		Farm f = null;
		String name; // null
		int kind;

		while (true) {

			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("취소 종류 번호 : ");
			kind = Integer.parseInt(sc.nextLine());

			System.out.print("구매 취소할 것 : ");
			name = sc.nextLine();

			switch (kind) {
			case 1:
				f = new Fruit("과일", name);
				break;
			case 2:
				f = new Vegetable("채소", name);
				break;
			case 3:
				f = new Nut("견과", name);
				break;
			default:
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			break;
		}

		boolean result = fc.removeFarm(f);
		if (result) {
			System.out.println("구매 취소에 성공하였습니다.");
			System.out.println("현재 KH마트 농산물 수량");
			printFarm();
			return;
		}
		System.out.println("구매 목록에 존재하지 않습니다.");
	}

	public void printBuyFarm() {
		/*
		ArrayList<Farm> list = fc.printBuyFarm();
		for (Farm f : list) {
			System.out.println(f);
		}
		*/
		// [강사님 코드] - fc의 printBuyFarm()의 반환 값을 이용하여 Iterator를 통해 출력
		ArrayList<Farm> list = fc.printBuyFarm();
		Iterator<Farm> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
