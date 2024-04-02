package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryMenu {

	private LibraryController lc = new LibraryController();
	private Scanner sc = new Scanner(System.in);

	public void mainMenu() {

		System.out.print("이름 : ");
		String name = sc.nextLine();

		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.print("성별 : ");

		char gender = sc.nextLine().charAt(0);

		lc.insertMember(new Member(name, age, gender));

		while (true) {
			System.out.println();
			System.out.println("==== 메뉴 ====");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print("메뉴 번호 : ");
			int menuNum = sc.nextInt();
			sc.nextLine();

			switch (menuNum) {
			case 1:
				System.out.println(lc.myInfo());
				break;
			case 2:
				selectAll();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				rentBook();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
			}
		}

	}

	public void selectAll() {
		System.out.println();
		Book[] bList = lc.selectAll();
		for (int i = 0; i < bList.length; i++) {
			System.out.println(i + "번 도서 : " + bList[i]);
		}
	}

	public void searchBook() {
		System.out.println();
		System.out.print("검색할 제목 키워드 : ");
		String keyword = sc.nextLine();
		Book[] bList = lc.searchBook(keyword);
		for (Book b : bList) {
			if (b != null)
				System.out.println(b);
		}
	}

	public void rentBook() {
		System.out.println();
		Book[] bList = lc.selectAll();
		for (Book b : bList) {
			System.out.println(b);
		}
		System.out.print("대여할 도서번호 : ");
		int num = sc.nextInt();
		sc.nextLine();

	}
}
