package com.kh.practice.file.view;

import java.util.Scanner;

import com.kh.practice.file.controller.FileController;

public class FileMenu {

	private Scanner sc = new Scanner(System.in);
	private FileController fc = new FileController();

	public void mainMenu() {

		while (true) {
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("9. 끝내기");
			System.out.print("메뉴번호 : ");
			int menuNum = parse(sc.nextLine());
			switch (menuNum) {
			case 1:
				fileSave();
				break;
			case 2:
				fileOpen();
				break;
			case 3:
				fileEdit();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}

	// nextInt는 개행문자가 남아서 번거로우니까 이런식으로
	// 문자열을 처리
	public int parse(String str) {
		return Integer.parseInt(str);
	}

	public void fileSave() {
		// 1) 사용자가 끝을 입력하기 전까지 sb에 데이터추가.
		StringBuilder sb = new StringBuilder();

		System.out.println("파일에 저장할 내용을 입력하세요.");
		System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
		System.out.println("내용 : ");
		while (true) {
			String str = sc.nextLine();
			if (str.equals("ex끝it")) {
				break;
			}
			sb.append(str + "\n"); // 개행문자를 삽입해서 한줄씩 출력하게 하자.

		}

		// 2) 사용자가 입력한 파일이 이밎 존재하는 파일인지 확인
		while (true) {
			System.out.print("저장할 파일 명을 입력해주세요(ex. myFile.txt) : ");
			String fileName = sc.nextLine();
			boolean isDuplicate = fc.checkName(fileName);

			if (isDuplicate) { // 존재하는 파일명이면?
				System.out.print("이미 존재하는 파일입니다. 덮어쓰시겠습니까? (y/n) ");
				char ch = sc.nextLine().toLowerCase().charAt(0);
				if (ch == 'n') { // 덮어쓰지 않음. 다시 파일명 입력받는다.
					continue; // 아래 내용을 수행하지 않는다.
				}
			}

			fc.fileSave(fileName, sb); //
			break;
		}

		// 저장할 파일 명을 사용자에게 받는데 이 때 이미 존재하는 파일 명이라면
		// “이미 존재하는 파일입니다. 덮어쓰시겠습니까?(y/n)”가 출력됨
		// y를 입력하면 FileController(fc)에 fileSave() 메소드로 파일 명과 StringBuilder 넘김
		// n를 입력하면 “저장할 파일 명을 입력해주세요 ~”가 다시 나오게끔 반복
		// 만일 저장할 파일 명이 존재하지 않는 파일 명이었다면
		// 파일 명과 내용을 fc에 fileSave 메소드로 넘김
	}

	public void fileOpen() {
		System.out.print("열 파일 명 :");
		String name = sc.nextLine();
		boolean isExist = fc.checkName(name);
		if (!isExist) {
			System.out.println("없는 파일입니다.");
			return;
		}
		StringBuilder sb = fc.fileOpen(name);
		System.out.println(sb);

		// 받은 파일 명을 fc에 checkName()의 매개변수로 넘겨 반환 값에 따라 나뉨
		// 반환 값이 true일 경우 fc의 fileOpen() 메소드의 매개변수로 넘겨 반환 값 출력
		// 반환 값이 false일 경우 “없는 파일입니다.” 출력 후 mainMenu()로 돌아감
	}

	public void fileEdit() {
		System.out.println("수정할 파일 명 : ");
		String fileName = sc.nextLine();
		StringBuilder sb = new StringBuilder();

		boolean isExist = fc.checkName(fileName);
		if (!isExist) {
			System.out.println("없는 파일입니다.");
			return;
		}

		System.out.println("파일에 저장할 내용을 입력하세요.");
		System.out.println("ex끝it 이라고 입력하면 종료됩니다.");
		System.out.println("내용 : ");
		while (true) {
			String str = sc.nextLine();
			if (str.equals("ex끝it")) {
				break;
			}
			sb.append(str + "\n");
		}
		fc.fileEdit(fileName, sb);
		System.out.println("파일이 수정되었습니다.");

	}

}
