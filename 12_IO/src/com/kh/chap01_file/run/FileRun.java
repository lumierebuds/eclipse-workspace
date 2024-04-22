package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class FileRun {

	public static void main(String[] args) {

		/*
		  스트림(Stream)
		  
		  프로그램 상의 데이터를 외부매체로 출력하거나, 입력장치로부터 
		  입력받는 과정을 진행하고자 한다면 반드시 프로그램과 외부매체와의
		  "통로"를 개설해야한다. 
		  
		  이 통로는 외부매체가 무엇이든, 일관성있게 데이터를 입력받을 수 있게 설계되었는데,
		  이 통로를 "Stream"이라고 부름
		  
		  스트림의 특징 
		  - 단방향 : 입력이면 입력스트림, 출력이면 출력스트림 별도로 존재함. 
		  			 즉, 동시에 입출력하고 싶다면 두개의 스트림을 개설해야함. 
		  - 선입선출(FIFO) : 먼저 전달한 데이터가 먼저 나오게된다. 
		  - 시간 지연 문제가 발생할 수 있다. 
		    => 데이터의 전송속도보다 수신속도가 느려서 발생하는 문제 
		  
		  스트림의 구분
		  - 스트림의 사이즈 :
		  			바이트 스트림(InputStream/OutputStream):
		  			     -  InputStream/OutputStream이 바이트스트림의 최상위 클래스로, 각 입력매체에
		  					맞는 입/출력 기능을 하위 클래스들에서 상속받아 구현하였음.
		  					일관성 있는 작동을 위해 최상위 클래스들에 추상메서드 (read/write) 들을 만든후
							각 함수를 자식 클래스에서 구현하였다. 
						 -  1byte짜리 데이터가 이동할 수 있을 정도의 사이즈를 가지고 있음. (좁은 사이즈) 
						 -  InputStream/OutputStream의 하위클래스들은 모두 xxxInputStream, xxxOutputStream
							xxx는 보통 외부매체명
						 -  동영상이나 음악파일 등을 읽고 쓸때 사용  
						 
		  			문자 스트림 :
		  				 - 2byte짜리 데이터가 이동할 수 있을 정도의 사이즈를 가지고 있음(큰 사이즈)   
		  				 - byte 단위로 표현 불가능한 문자를 읽고 쓸때 사용. 
		  
		  - 외부매체와의 직접적인 연결 여부 : 
		  
		  			기반 스트림: 외부 매체와 직접적으로 연결되는 통로개설 가능한 스트림
		  			보조 스트림: 기반 스트림만으로 부족한 성능을 향상시켜주는 용도의 스트림
		  					   (외부 매체와 직접 연결 불가x - 기반 스트림과 함께 씀)
		  					   ex) 속도성능, 문자열 변환, 객체단위 입출력, 자료형 변환 등
		  
		 */

		// java.io.File 클래스
		// 파일이라는 개념을 추상화한 클래스
		// 입출력 기능은 없고 파일의 속성, 용량, 이름, 경로, .... 을 얻을 수 있는 클래스

		try {
			// 1. 별도의 경로 지정을 하지 않고 파일명만 제시해서 파일생성하기
			File file1 = new File("test.txt"); // 현재 프로젝트 폴더 내에 파일 생성
			file1.createNewFile();

			// 2. 경로 지정하여 생성하기 => 단, 존재하는 경로를 제시해줘야함.
			File file2 = new File("C:/aaa/test.txt");
			file2.createNewFile();

			// 3. 폴더 생성하기. mkdir
			File folder1 = new File("C:/bbb");
			folder1.mkdir();

			// 4. 폴더 생성하기(여러개) mkdirs
			File folder2 = new File("C:/ccc/ddd/eee");
			folder2.mkdirs();

			// C 드라이브아래에 fff폴더 아래에 ggg 폴더가 있다면 파일추가.
			File dir = new File("C:/fff/ggg");
			if (!dir.exists()) {
				dir.mkdirs(); // 디렉토리가 존재하지 않는다면 디렉토리 생성
			}

			File newFile = new File("C:/fff/ggg/person.txt");
			newFile.createNewFile();
			// newFile.delete(); // 파일 삭제

			// 파일의 이름, 포함된 디렉토리 경로, 파일의 용량, 파일의 저장경로
			// file인지 directory인지 여부를 확인할 수 있고,

			File[] fileArrFiles = dir.listFiles(); // 디렉터리 내부의 모든 파일을 반환

			for (File f : fileArrFiles) {
				System.out.println("파일 이름: " + f.getName());
				System.out.println("상위 폴더: " + f.getParent());
				System.out.println("절대 경로: " + f.getAbsolutePath());

				if (f.getName().contains("person")) {
					f.delete();
				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
