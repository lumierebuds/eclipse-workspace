package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController {
	private HashMap<String, Member> map = new HashMap<>();

	public boolean joinMembership(String id, Member m) {
		// 전달받은 id로 회원가입중인지 확인.
		boolean result = map.containsKey(id);
		if (result == true) {
			// 있다면 false 값 반환
			return false;
		}

		// 전달받은 id가 없다면 id와 m을 map에 추가 후 true 반환
		map.put(id, m);
		return true;

	}

	public String login(String id, String password) {
		Member m = map.get(id); // id로 된 회원이 있는지 검색해서 객체로 반환(없으면 null)
		if (m != null && m.getPassword().equals(password)) { // id인 회원이 존재하고, 패스워드가 같으면 해당 회원객체의 이름을 반환
			return m.getName();
		} else {
			return null;
		}
	}

	public boolean changePassword(String id, String oldPw, String newPw) {
		// 아이디가 존재하면서 저장된 비밀번호와 사용자가 입력한 비밀번호(oldPw)가
		// 같을 때 새로운 비밀번호로 바꾸고 true 반환, 아니라면 false 반환

		// if (login(id, oldPw) != null) {
		if (map.containsKey(id) && map.get(id).getPassword().equals(oldPw)) {
			map.get(id).setPassword(newPw);
			return true;
		}
		return false;
	}

	public void changeName(String id, String newName) {
		map.replace(id, new Member(map.get(id).getPassword(), newName));
		// 전달 받은 id를 통해 Member의 이름을 새로 입력한 이름으로 변경
	}

	public TreeMap<String, String> sameName(String name) {
		// 전달 받은 name이 저장된 데이터의 이름과 같으면
		// key로 오름차순 해주는 객체에 해당 id와 이름 저장 후 객체 반환
		// 단, 엘리먼트 하나씩 뽑아내는 과정에서 keySet()을 쓸 것

		Set<String> ks = map.keySet(); // id값 가져오기

		Iterator<String> it = ks.iterator();

		TreeMap<String, String> tm = new TreeMap<>();
		while (it.hasNext()) {
			String id = it.next();
			String mName = map.get(id).getName(); // Member 객체 반환후 이름반환

			if (mName.equals(name)) {
				tm.put(id, mName);
			}
		}
		return tm;
	}
}
