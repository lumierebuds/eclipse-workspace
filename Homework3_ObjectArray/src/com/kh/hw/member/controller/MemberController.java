package com.kh.hw.member.controller;

import java.util.Arrays;

import com.kh.hw.member.model.vo.Member;

public class MemberController {

	private Member[] m = new Member[SIZE];
	// [null, null, null, ..... null, null]
	public static final int SIZE = 10;

	public MemberController() {
		m[0] = new Member("aaaaa", "박신우", "aa", "aaa@aaa.aaa", 'F', 33);
		m[1] = new Member("bbbbb", "남나눔", "bb", "bbb@bbb.bbb", 'M', 28);
		m[2] = new Member("ccccc", "도대담", "cc", "ccc@ccc.ccc", 'M', 35);
	}

	public int existMemberNum() {
		// 현재 존재하는 멤버 수 반환
		int memberNum = 0;
		for (Member mem : m) {
			if (mem != null) { // 존재하는 값이 null이 아니면
				memberNum++;
			}
		}
		return memberNum;

	}

	public boolean checkId(String inputId) {
		boolean result = true;
		for (Member mem : m) {
			// 중복값이 존재하므로 사용불가.
			// [null, null, null ,null]
			// mem = null 일시 A && B 에서 A 조건을 통과 못하고 종료.
			if (mem != null && mem.getId().equals(inputId)) { // mem이 null이 아니면서 id가 동일할때
				result = !result;
				break;
			}
		}
		return result;
	}

	public void insertMember(String id, String name, String password, String email, String gender, int age) {
		// existMemberNum() 을 통해 현재 존재하는 멤버 수를 인덱스로 활용해서 초기화를 시킬 수 있다.
		Member member = new Member(id, name, password, email, gender.charAt(0), age);

		// 객체 배열 내부에 member 저장
		m[existMemberNum()] = member; // 0부터 시작해서 9까지의 인덱스

		/* for 문을 이용해서 member 저장 
		for (int i = 0; i < SIZE; i++) {
			if (m[i] == null) {
				m[i] = member;
				break;
			}
		}
		*/
	}

	public String searchId(String id) {
		String result = null;
		for (Member mem : m) {
			if (mem != null && mem.getId().equals(id)) {
				result = mem.toString();
			}
		}
		return result;
	}

	public Member[] searchName(String name) {

		Member[] temp = new Member[10];
		// [member, member, null, null...] //
		int index = 0;
		for (Member mem : m) {
			if (mem != null && mem.getName().equals(name)) {
				temp[index++] = mem; // 주소값 복사
			}
		}

		// 배열복사를 통해 초기화된 데이터만 전달.
		return Arrays.copyOf(temp, index);

	}

	// searchEmail 생략

	public boolean updatePassword(String id, String password) {

		boolean result = false;
		for (Member mem : m) {
			if (mem != null && mem.getId().equals(id)) {
				result = true;
				mem.setPassword(password);
			}
		}
		return result;
	}

	// updateName, updateEmail 생략

	public boolean delete(String id) {
		boolean result = false;

		int memberNum = existMemberNum(); // 현재 회원가입한 회원 수

		for (int i = 0; i < SIZE; i++) {

			if (m[i] != null && m[i].getId().equals(id)) {
				// 저장되어있던 주소값의 연결을 해제
				// 회원 가입 기능에 문제가 발생하게 된다.
				// m[i] = null; // i=2;
				// i 뒤쪽에 존재하는 데이터를 한칸씩 앞으로 땡겨오기
				// [m, m, null, m, null, null, null, null, null, null]
				for (int j = i; j < memberNum; j++) {
//					if (j == memberNum - 1) { // 마지막 반복이라면 null로 초기화
//						m[j] = null;
//					} else { // 마지막 반복이 아니라면 다음 인덱스의 값을 현재위치로 한칸 땡겨옴.
//						m[j] = m[i + 1];
//					}
					m[j] = (j == memberNum - 1) ? null : m[j + 1]; // 삼항 연산자로 표현
				}

				result = true;
				break;
			}
		}

// [문제가 발생하는 코드] : 배열의 주소값이 연결이 해제가 되지 않는다. 
//		for (Member mem : m) {
//			if (mem != null && mem.getId().equals(id)) {
//				mem = null;
//			}
//		}

		return result;
	}

	public void delete() {
		// 1) 새로운 빈배열 객체 생성
		m = new Member[SIZE];
		// 2) 반복문으로 모든 인덱스의 값 null로 초기화
//		for (int i = 0; i < SIZE; i++) {
//			m[i] = null;
//		}

	}

	public Member[] printAll() {
		return m;
	}

}
