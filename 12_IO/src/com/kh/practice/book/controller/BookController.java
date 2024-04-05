package com.kh.practice.book.controller;

import java.io.File;
import java.io.IOException;

import com.kh.practice.book.model.dao.BookDAO;
import com.kh.practice.book.model.vo.Book;

public class BookController {

	private BookDAO bDao = new BookDAO();

	public void makeFile() {
		File book = new File("book.txt");
		if (!book.exists()) {
			try {
				book.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 파일이 존재하지 않으면 파일을 생성한다. 만약 해주지 않으면 계속 생긴다.
		}
	}

	public void fileSave(Book[] bArr) {
		bDao.fileSave(bArr);
	}

	public Book[] fileRead() {
		return bDao.fileRead();
	}

}
