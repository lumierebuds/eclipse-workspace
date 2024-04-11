package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {

	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();

	public int parse(String str) {
		return Integer.parseInt(str);
	}

	public void mainMenu() {

		while (true) {
			System.out.println("=====***** 메인 메뉴 *****=====");
			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 명 오름차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");
			int menu = parse(sc.nextLine());
			switch (menu) {
			case 1:
				insertBook();
				break;
			case 2:
				selectList();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				deleteBook();
				break;
			case 5:
				ascBook();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			}
		}
	}

	// 1. 새 도서 추가용 view 메서드
	public void insertBook() {
		System.out.println("===== 새 도서 추가 =====");
		System.out.print("도서 명 :");
		String title = sc.nextLine();

		System.out.print("저자 명 :");
		String author = sc.nextLine();

		System.out.print("장르(1. 인문 / 2. 과학 / 3. 외국어 / 4. 기타)");
		int genre = parse(sc.nextLine());
		String[] category = { "인문", "과학", "외국어", "기타" };

		System.out.print("가격 :");
		int price = parse(sc.nextLine());

		Book book = new Book(title, author, category[genre - 1], price); // 1-1 (0 , 인문), 2-1 (1, 과학), 3-1 (2, 외국어), 4-1
																			// (3,
		// 기타)
		bc.insertBook(book);
	}

	// 2. 도서 전체용 view 메서드
	public void selectList() {

		ArrayList<Book> bookList = bc.selectList();
		if (bookList.size() == 0) { // ArrayList 안에 아무것도 없을때 - isEmpty 함수도 가능
			System.out.println("존재하는 도서가 없습니다.");
			return; // 종료
		}

		System.out.println("===== 도서 전체 조회 =====");
		for (Book book : bookList) {
			System.out.println("\t\t" + book);
		}

	}

	// 3. 도서 검색용 view 메서드
	public void searchBook() {

		System.out.print("검색 키워드 ");
		String keyword = sc.nextLine();

		ArrayList<Book> searchList = bc.searchBook(keyword);

		if (searchList.size() == 0) { // searchList 안에 아무것도 없을때 즉, 검색된게 아무것도 없을때
			System.out.println("검색 결과가 없습니다.");
			return;
		}

		for (Book book : searchList) {
			System.out.println("\t\t" + book);
		}
	}

	// 4. 도서 삭제용 view 메서드

	public void deleteBook() {

		System.out.println("===== 도서 삭제 =====");
		System.out.println("삭제할 도서 명 : ");
		String title = sc.nextLine();

		System.out.println("삭제할 저자 명 : ");
		String author = sc.nextLine();

		Book remove = bc.deleteBook(title, author);

		if (remove == null) {
			System.out.println("삭제할 도서를 찾지 못했습니다.");
			return;
		}

		System.out.println("성공적으로 삭제되었습니다.");

	}

	// 5. 도서 명 오름차순 정렬용 view 메서드
	public void ascBook() {
		int result = bc.ascBook();
		if (result == 1) {
			System.out.println("정렬에 성공하였습니다.");
		} else {
			System.out.println("정렬에 실패하였습니다.");
		}

	}
}
