package com.kh.practice.map.view;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import com.kh.practice.map.controller.MemberController;
import com.kh.practice.map.model.vo.Member;

public class MemberMenu {

	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();

	public void mainMenu() {
		System.out.println("========== KH 사이트 ==========");
		while (true) {
			System.out.print("메뉴 번호 선택: ");
			int menu = Integer.parseInt(sc.nextLine());

			switch (menu) {
			case 1:
				joinMemberMenu();
				break;
			case 2:
				logIn();
				break;
			case 3:
				sameName();
				break;
			case 9:
				return;
			default:

			}
		}
	}

	public void memberMenu() {
		// 메뉴 번호 선택 : >> 입력 받음
		// 메뉴 화면 반복 실행 처리
		// 잘 못 입력 하였을 경우 "잘못 입력하였습니다. 다시 입력해주세요" 출력 후 반복

		System.out.print("메뉴 번호 선택 : ");
		int menu = Integer.parseInt(sc.nextLine());

		switch (menu) {
		case 1:
			changePassword();
			break;
		case 2:
			changeName();
			break;
		case 3:
			return;
		default:
		}

	}

	public void joinMemberMenu() {
		// 회원가입하기 위해 아이디, 비밀번호, 이름을 받고 비밀번호와 이름은
		// Member객체에 담고 id와 객체는 MemberController(mc)의 joinMembership()로 보냄.
		// 받은 결과에 따라 true면 “성공적으로 회원가입 완료하였습니다.”,
		// false면 “중복된 아이디입니다. 다시 입력해주세요.” 출력

		while (true) {
			System.out.print("아이디 : ");
			String id = sc.nextLine();

			System.out.print("비밀번호 : ");
			String password = sc.nextLine();

			System.out.print("이름 : ");
			String name = sc.nextLine();
			Member m = new Member(password, name);
			boolean result = mc.joinMembership(id, m);
			if (result == true) {
				System.out.println("성공적으로 회원가입이 되었습니다.");
				return;
			}

			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
		}
	}

	public void logIn() {

		while (true) {
			System.out.print("아이디 : ");
			String id = sc.nextLine();

			System.out.print("비밀번호 : ");
			String password = sc.nextLine();

			// 아이디와 비밀번호를 사용자에게 받아 mc의 logIn()메소드로 넘겨 줌
			String name = mc.login(id, password);
			if (name != null) {
				// 반환 값 있으면 “OOO님, 환영합니다!” 출력 후 로그인 된 화면으로(memberMenu()),
				System.out.println(name + "님 환영합니다!");
				return;
			}
			// 없으면 “틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.” 출력 후 반복
			System.out.println("틀린 아이디 또는 비밀번호입니다. 다시 입력해주세요.");
		}

	}

	public void changePassword() {
		// 아이디와 비밀번호, 변경할 비밀번호를 받아 mc의 chagePassword()로 보냄.
		// 받은 결과 값이 true면 “비밀번호 변경에 성공했습니다.”,
		// false면 “비밀번호 변경에 실패했습니다. 다시 입력해주세요.” 출력 후 반복

		while (true) {
			System.out.print("아이디 : ");
			String id = sc.nextLine();

			System.out.print("비밀번호 : ");
			String oldPw = sc.nextLine();

			System.out.print("변경할 비밀번호 : ");
			String newPw = sc.nextLine();

			boolean result = mc.changePassword(id, oldPw, newPw);
			if (result == true) {
				System.out.println("비밀번호 변경에 성공했습니다.");
				return;
			}
			System.out.println("변경실패");
		}

	}

	public void changeName() {

		while (true) {
			// 아이디와 비밀번호를 받아 mc의 logIn()으로 넘겨 현재 저장되어 있는 이름을 받고
			// 사용자에게 현재 저장되어 있는 이름을 출력하여 보여줌.
			System.out.print("아이디 : ");
			String id = sc.nextLine();

			System.out.print("비밀번호 : ");
			String oldPw = sc.nextLine();

			String oldName = mc.login(id, oldPw);
			if (oldName == null) {
				System.out.println("이름 변경에 실패했습니다. 다시 입력해주세요.");
				continue;
			}
			System.out.println("내 이름 " + oldName);

			// 변경할 이름을 받아 mc의 chageName()로 id와 함께 넘기고
			// “이름 변경에 성공하였습니다.” 출력

			System.out.print("변경할 이름 : ");
			String newName = sc.nextLine();
			mc.changeName(id, newName);
			System.out.println("이름변경에 성공하였습니다.");
			return;

			// 만일 logIn()로부터 저장되어 있는 이름을 받지 못 했다면
			// “이름 변경에 실패했습니다. 다시 입력해주세요” 출력 후 반복
		}

	}

	public void sameName() {
		// 검색할 이름을 받고 mc의 sameName()메소드로 넘김.
		// 반환 값을 가지고 entrySet()을 이용하여 ‘이름-아이디’ 형식으로 출력

		System.out.print("이름 : ");
		String name = sc.nextLine();

		TreeMap<String, String> tm = mc.sameName(name);
		Set<Entry<String, String>> es = tm.entrySet();

		for (Entry<String, String> e : es) {
			System.out.println(e.getValue() + "-" + e.getKey());
			// 이름이 같은 동명이인이 검사가 될것이고,
			// 그리고 이름을 기준으로 오름차순 정렬이된다.
		}

	}
}
