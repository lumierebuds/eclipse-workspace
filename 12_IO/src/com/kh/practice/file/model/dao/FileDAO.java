package com.kh.practice.file.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDAO {

	public boolean checkName(String file) {
		File newFile = new File(file);

		if (!newFile.exists()) { // 파일이 존재하지 않으면 false 반환
			return false;
		} else {
			return true; // 파일이 존재하면 true 반환
		}
	}

	public void fileSave(String file, String s) {
		// 매개변수로 들어온 file을 파일 명으로 이용하여 파일을 만들어주고
		// String에 써서 저장
		File newFile = new File(file);
		FileOutputStream fos = null;
		try {

			fos = new FileOutputStream(newFile);
			char[] cArr = s.toCharArray(); // String을 char로 변경
			for (char ch : cArr) { // char형태 값을 한개씩 꺼내 출력(write)해준다.
				fos.write(ch);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public StringBuilder fileOpen(String file) {
		FileInputStream fis = null;
		StringBuilder sb = new StringBuilder();
		int value = 0;
		try {
			fis = new FileInputStream(file);

			while ((value = fis.read()) != -1) {
				sb.append((char) value);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return sb;

	}

	public void fileEdit(String file, String s) {

		File editFile = new File(file);
		FileOutputStream fos = null;

		try {
			fos = new FileOutputStream(editFile, true); // 내용에 이어서 출력해주도록 한다.
			char[] cArr = s.toCharArray();
			for (char c : cArr) {
				fos.write(c);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
