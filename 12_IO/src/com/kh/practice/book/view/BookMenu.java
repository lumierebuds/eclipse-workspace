package com.kh.practice.book.view;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.vo.Book;

public class BookMenu {

	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();
	private Book[] bArr;

	public BookMenu() {
		bc.makeFile();
		bArr = bc.fileRead();
	}

	public int parse(String str) {
		return Integer.parseInt(str);
	}

	public void mainMenu() {

		while (true) {
			System.out.println("1. 도서 추가 저장");
			System.out.println("2. 저장 도서 출력");
			System.out.println("9. 프로그램 끝내기");
			System.out.print("메뉴 번호 :");
			int num = parse(sc.nextLine());

			// 잘못 입력했을 시 “잘못 입력하셨습니다. 다시 입력해주세요.” 출력 후 반복
			switch (num) {
			case 1:
				fileSave();
				break;
			case 2:
				fileRead();
				break;
			case 9:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주새요");
			}
		}
	}

	public void fileSave() {
		System.out.print("도서 명 :");
		String title = sc.nextLine();

		System.out.print("저자 명 :");
		String author = sc.nextLine();

		System.out.print("도서 가격 :");
		int price = parse(sc.nextLine());

		System.out.print("출판 날짜(yyyy-mm-dd) :");
		String[] date = sc.nextLine().split("-");
		int[] dateNum = new int[3];

		for (int i = 0; i < dateNum.length; i++) {
			dateNum[i] = Integer.parseInt(date[i]);
			// dateNum int 배열에는 0,1,2 인덱스에는
			// 각각 출판 년, 월, 일이 들어간다.
			// 이 데이터를 가지고 캘린더 객체를 만든다. (그레고리안 달력)
		}

		Calendar calendar = new GregorianCalendar(dateNum[0], dateNum[1], dateNum[2]); // Calendar 객체 생성

		System.out.print("할인율 :");
		double discount = sc.nextDouble();
		sc.nextLine();

		Book book = new Book(title, author, price, calendar, discount);

		for (int i = 0; i < bArr.length; i++) {
			if (bArr[i] == null) {
				bArr[i] = book;
				break;
			}
		}

		bc.fileSave(bArr);
		// 입력 받은 출판날짜를 split()를 통해 년, 월, 일로 나누고 Calendar에 담음
		// 각 요소와 새로 만든 Calendar를 Book 객체에 담고
		// 비어있는 Book객체 배열(bArr)에 담아 bc에 fileSave()에 매개변수로 전달
	}

	public void fileRead() {
		Book[] books = bc.fileRead();
		for (Book book : books) {
			if (book != null) {
				System.out.println(book);
			}

		}
	}
}
