package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book1 = new Book();
		book1.inform();

		Book book2 = new Book("어린왕자", "생능출판", "생택쥐페리");
		book2.inform();

		Book book3 = new Book("콩쥐팥쥐", "길벗", "미상", 2500, 10.0);
		book3.inform();

	}

}
