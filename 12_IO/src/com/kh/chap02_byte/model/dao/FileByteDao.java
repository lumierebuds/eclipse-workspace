package com.kh.chap02_byte.model.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// dao(Data Access Object) : 데이터가 보관되어 있는 공간과 직접 접근해서 데이터를
//  						 입출력 하는 클래스 
public class FileByteDao {

	// 자바 프로그램 --> 외부 매체(파일)
	// 출력(OUT): 프로그램내의 데이터를 파일로 내보내기(파일에 기록)

	public void fileSave() {
		FileOutputStream fos = null; // 변수 선언 및 명시적초기화

		// 1. FileOutputStream 객체 생성
		// 객채생성 == 외부매체와의 스트림 연결.
		// FileOutputStream은 연결하고자 하는 파일이 존재하지 않으면
		// 파일을 생성후 연결한다.

		try {
			// [로그 처리를 할 수 있는 코드]
			String pathString = "C:/abc";
			File dir = new File(pathString);
			if (!dir.exists()) {
				dir.mkdir();
			}
			File p = new File(pathString + "/a_byte.txt");

			// fos = new FileOutputStream("a_byte.txt", true); // 매개변수로 연결하고싶은 파일이름을 직접
			// 적어준다.
			fos = new FileOutputStream(pathString + "/a_byte.txt", true);

			// 2. 연결 통로를 통해 데이터를 "출력" : write() 메서드 사용
			// 1byte 범위 내에서 문자 출력 가능(-128 ~ 127 까지의 숫자만 저장가능)
			// 파일에 기록시 '문자'로 기록되기 때문에 0~127까지의 숫자만 저장가능

			fos.write(97); // 97 == 'a'
			fos.write('b'); // 'b' == 98
			// fos.write('민'); // 문자열 깨짐 (바이트의 표현범위를 벗어나기 때문)

			byte[] bArr = { 'a', 'p', 'p', 'l', 'e' }; // apple
			fos.write(bArr); // write는 오버라이드되어서 byte 배열을 매개변수로 입력받을 수 있다.

			byte[] cArr = { 'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd' };
			fos.write(cArr, 0, 5); // 0~5번 인덱스의 값까지 추가된다.

		} catch (FileNotFoundException e) { // 파일이 존재하지 않으면
			e.printStackTrace();
		} catch (IOException e) { // 입출력 예외가 날때
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

	// 파일로 부터 내용을 입력(input, read)받아서
	// 자바 프로그램에서 확인하는 메서드
	public void fileRead() {

		// FileInputStream : 파일로부터 데이터를 1바이트 단위로 입력받는 스트림.
		FileInputStream fis = null;

		try {

			// 1. 객체생성 == 외부매체와 스트림을 연결

			fis = new FileInputStream("a_byte.txt"); // 연결하고자 하는 파일이 없는 경우 에러
			// 2. 스트림을 통해 데이터 읽어오기
			// 1byte 단위로 읽어온다.

			/*
			System.out.println(fis.read()); // 97
			System.out.println(fis.read()); // 112
			System.out.println(fis.read()); // 112
			System.out.println(fis.read()); // 108
			System.out.println(fis.read()); // 101
			System.out.println(fis.read()); // 파일 끝을 만난순간 -1반환
			*/

			int value = 0;
			while ((value = fis.read()) != -1) {
				System.out.print((char) value);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
