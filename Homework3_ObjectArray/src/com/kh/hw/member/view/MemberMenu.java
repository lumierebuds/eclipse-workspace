package com.kh.hw.member.view;

import java.util.Scanner;

import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class MemberMenu {

	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();

	public MemberMenu() { // 기본 생성자

	}

	public void mainMenu() {
		while (true) {
			System.out.println("최대 등록 가능한 회원 수는 " + MemberController.SIZE + "명입니다.");
			int memberNum = mc.existMemberNum();
			System.out.println("현재 등록된 회원 수는 " + memberNum + "명입니다.");

			// 현재 등록된 회원 수에 따라 메인 메뉴를 다르게 출력
			if (memberNum != 10) {
				// 현재 등록된 회원 수가 10명이 아닐 때
				System.out.println("1. 새 회원 등록");
			} else {
				// 현재 등록된 회원 수가 10명일 때
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
			}
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 삭제");
			System.out.println("5. 모두 출력");
			System.out.println("9. 끝내기");
			System.out.print("메뉴번호 : ");
			int menu = sc.nextInt();
			sc.nextLine(); // 개행문자 제거

			switch (menu) {

			case 2:
				searchMember();
				break;
			case 3:
				updateMember();
				break;
			case 4:
				deleteMember();
				break;
			case 5:
				printAll();
				break;
			case 9:
				System.out.println("시스템 종료");
				return;
			case 1:
				if (memberNum != 10) {
					insertMember();
					break;
				}
			default:
				System.out.println("다시 입력해주세요.");
			}
		}
	}

	public void insertMember() {

		System.out.println("새 회원을 등록합니다.");
		String id = ""; // 빈문자열로 미리 선언함. 지역변수가 아닌 전역변수로 사용하기 위해
		while (true) {
			System.out.print("아이디 : ");
			id = sc.nextLine();
			boolean result = mc.checkId(id);
			if (result) {
				break;
			}
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
		}

		System.out.print("이름 : ");
		String name = sc.nextLine();

		System.out.print("비밀번호: ");
		String password = sc.nextLine();

		System.out.print("이메일 : ");
		String email = sc.nextLine();

		String gender = ""; // 빈문자열로 미리 선언함. 지역변수가 아닌 전역변수로 사용하기 위해
		while (true) {
			System.out.print("성별(M/F) : ");
			gender = sc.nextLine();
			if (gender.equals("M") || gender.equals("F")) {
				break;
			}
			System.out.println("성별을 다시입력하세요.");
		}

		System.out.print("나이: ");
		int age = sc.nextInt(); // 개행문자발생
		sc.nextLine();

		mc.insertMember(id, name, password, email, gender, age);
	}

	public void searchMember() {
		while (true) {
			System.out.println("1. 아이디로 검색하기");
			System.out.println("2. 이름으로 검색하기");
			System.out.println("9. 메인으로 돌아가기");
			System.out.print("메뉴 번호 : ");
			int menu = sc.nextInt();
			sc.next();

			switch (menu) {
			case 1:
				searchId();
				break;
			case 2:
				searchName();
				break;
			case 9:
				System.out.println("메인으로..");
				return;
			default:
				System.out.println("다시입력해주새요...");
			}
		}

	}

	public void searchId() {

		System.out.println("검색할 회원의 아이디 : ");
		String id = sc.nextLine();

		String result = mc.searchId(id);
		if (result == null) {
			System.out.println("검색결과가 없습니다.");
			return; // searchMenu로 돌아감
		}
		System.out.println("찾으신 회원 조회 결과입니다.");
		System.out.println(result);
	}

	public void searchName() {

		System.out.println("검색할 회원의 이름 : ");
		String name = sc.nextLine();

		Member[] m = mc.searchName(name);
		if (m.length > 0) { // 검색한 회원이 존재
			for (Member mem : m) {
				System.out.println(mem);
			}
		} else { // 검색한 회원이 없음.

		}

	}

	// searchEmail() 생략

	public void updateMember() {
		System.out.println("1. 비밀번호 수정하기 ➔ updatePassword()");
		System.out.println("9. 메인으로 돌아기기");
		int menu = sc.nextInt();

		switch (menu) {
		case 1:
			updatePassword();
			break;
		case 9:
			System.out.println("메인으로");
			return;
		default:
			System.out.println("잘못 입력했습니다.");
			return;
		}

	}

	public void updatePassword() {

		System.out.print("수정할 회원 id : ");
		String id = sc.nextLine();

		System.out.print("수정할 비밀번호 : ");
		String password = sc.nextLine();

		boolean result = mc.updatePassword(id, password);

		if (result) {
			System.out.println("수정이 성공적으로 되었습니다.");
		} else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}

	// updateName, updateEmail 생략

	public void deleteMember() {
		System.out.println("1. 특정 회원 삭제하기");
		System.out.println("2. 모든 회원 삭제하기");
		System.out.println("9. 메인으로 돌아가기");
		System.out.print("메뉴 번호 : ");
		int menu = sc.nextInt();
		sc.nextLine();

		switch (menu) {
		case 1:
			deleteOne();
			break;
		case 2:
			deleteAll();
			break;
		default:
			System.out.println("메인으로");
		}

	}

	public void deleteOne() {

		System.out.print("삭제할 회원 id: ");
		String id = sc.nextLine();

		System.out.println("정말 삭제하겠습니까? (Y/N) ");
		char ch = sc.nextLine().charAt(0);

		if (!(ch == 'y' || ch == 'Y')) { // if 조건식 하나로 해결하는 방법
			return;
		}

		boolean result = mc.delete(id);

		if (result) {
			System.out.println("삭제성공");
		} else {
			System.out.println("삭제실패");
		}

	}

	public void deleteAll() {
		System.out.println("정말 삭제하시겠습니까?(Y/N) : ");
		char ch = sc.nextLine().charAt(0);

		if (ch == 'y' || ch == 'Y') {
			mc.delete();
			System.out.println("삭제성공했습니다.");
		}
	}

	public void printAll() {
		Member[] m = mc.printAll();

		if (mc.existMemberNum() == 0) {
			System.out.println("저장된 회원이 없습니다.");
			return;
		}

		for (int i = 0; i < mc.existMemberNum(); i++) {
			System.out.println(m[i]);
		}
	}
}
