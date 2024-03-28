package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 기본 생성자 호출
		User u1 = new User();
		u1.setUserId("user01");
		u1.setUserPwd("pass01");
		u1.setUserName("김지훈");
		u1.setAge(26);
		u1.setGender('남');

		System.out.println(u1.toString());

		// 매개변수가 3개인 생성자 호출
		User u2 = new User("user02", "pass02", "아무개");
		System.out.println(u2.toString());

		// 전체 필드를 초기화 하는 생성자 호출
		User u3 = new User("user03", "pass03", "남도일", 19, '남');
		System.out.println(u3);

	}

}
