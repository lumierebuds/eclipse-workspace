package com.kh.chap01_oneVsMany.run;

import java.util.Scanner;

import com.kh.chap01_oneVsMany.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 기본 생성자를 이용해서 객체를 생성후 setter를 통해 필드 초기화

		Book bk1 = new Book();
		bk1.setTitle("자바의 정석");
		bk1.setAuthor("자바신");
		bk1.setPublisher("자바");
		bk1.setPrice(20000);

		// 2. 매개변수가 있는 생성자로 객체 생성과 동시에 필드 초기화

		Book bk2 = new Book("자바프로그래밍", "박은종", "이지스퍼브리싱", 25000);

		// 3. 사용자가 입력한 값들로 객체를 생성
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("제목 : ");
		String title = sc.nextLine();
		
		System.out.print("저자 : ");
		String author = sc.nextLine();
		
		System.out.print("출판사 : ");
		String publisher = sc.nextLine();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		Book bk3 = new Book(title, author, publisher, price);
		
		System.out.println(bk1);
		System.out.println(bk2);
		System.out.println(bk3);
		
		 */

		// 책을 검색할 때

		/*
		if (bk1.getTitle().equals(searchTitle)) {
			System.out.println(bk1);
		}
		
		if (bk2.getTitle().equals(searchTitle)) {
			System.out.println(bk2);
		}
		if (bk3.getTitle().equals(searchTitle)) {
			System.out.println(bk3);
		}
		*/

		// 1000개의 도서 정보를 저장하는 Book 객체 배열

		Book[] arr = new Book[1000];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Book("도서" + i, "저자" + i, "출판사" + i, 20000);
		}

		// 사용자에게 검색할 도서 제목을 입력받아
		// 전체 도서들의 제목과 일일이 비교해 일치하는 도서의 가격을 출력
		// 만약, 일치하는 도서를 찾기 못한 경우 "검색한 도서가 없습니다" 를 출력

		Scanner sc = new Scanner(System.in);

		System.out.print("검색할 도서 제목 : ");
		String searchTitle = sc.nextLine();

		boolean isTrue = true;

		for (int i = 0; i < arr.length; i++) {
			Book bk = arr[i];
			String title = bk.getTitle();

			if (searchTitle.equals(arr[i].getTitle())) {
				isTrue = false;
				System.out.println(bk);
				break;
			}
		}

		if (isTrue) {
			System.out.println("검색된 도서가 없습니다.");
		}

	}

}
