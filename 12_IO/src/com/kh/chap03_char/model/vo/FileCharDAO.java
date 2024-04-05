package com.kh.chap03_char.model.vo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDAO {

	// 저장기능
	public void fileSave() {
		// FileWriter : 파일로 데이털르 2byte단위로 출력하는 스트림

		// 자바 7 버전 이상부터 지원 -
		// try ~ with ~ resource 구문
		// try(스트림 객체 생성 ; 스트림 객체;)
		// 스트림 객체를 try()에 넣어버리면, 스트림 객체 생성후 블록구문 실행이 완료될때
		// 알아서 자원을 반납.
		try (FileWriter fw = new FileWriter("b_char.txt")) {
			fw.write(" 와 ! IO 재밌다! \n");
			fw.write('A');

			char[] cArr = { 'k', 'i', 'w', 'i' };
			fw.write(cArr);
			fw.write(cArr, 0, 3);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// 입력기능
	public void fileRead() {
		try (FileReader fr = new FileReader("b_char.txt")) {
			int value = 0;
			while ((value = fr.read()) != -1) {
				System.out.println((char) value);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
