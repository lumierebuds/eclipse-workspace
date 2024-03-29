package com.kh.chap02_override.run;

import com.kh.chap02_override.model.vo.Book;

public class Run {

	public static void main(String[] args) {

		Book bk = new Book("수학의 정석", "나수학", 12000);

		System.out.println(bk);
	}
}
