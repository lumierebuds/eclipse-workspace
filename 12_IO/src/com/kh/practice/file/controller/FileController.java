package com.kh.practice.file.controller;

import com.kh.practice.file.model.dao.FileDAO;

public class FileController {

	private FileDAO fd = new FileDAO();

	public boolean checkName(String file) {
		// File 객체를 생성하는 매개변수 있는 생성자에 file을 매개변수로 넘겨줌
		// 해당 파일이 있는지 없는지에 대한 boolean 값을 반환
		return fd.checkName(file);
	}

	public void fileSave(String file, StringBuilder sb) {
		String str = sb.toString(); // toString으로 StringBuilder로 String으로 변환
		fd.fileSave(file, str);
	}

	public StringBuilder fileOpen(String file) {
		return fd.fileOpen(file);
	}

	public void fileEdit(String file, StringBuilder sb) {
		String str = sb.toString(); // toString으로 StringBuilder로 String으로 변환
		fd.fileEdit(file, str);
	}
}
