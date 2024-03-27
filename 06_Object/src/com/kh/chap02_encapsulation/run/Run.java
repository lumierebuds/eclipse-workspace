package com.kh.chap02_encapsulation.run;

import com.kh.chap02_encapsulation.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student hong = new Student();
		// hong.name = "홍길동";
		// hong.age = 20; // 필드에 대한 직접적인 접근 차단

		// 간접적으로 수정이 가능한 setter 함수 호출
		hong.setName("홍길동");
		hong.setAge(20);
		hong.setHeight(180);

		System.out.printf("%s님의 나이는 %d이고, 키는 %.1fcm입니다.\n", hong.getName(), hong.getAge(), hong.getHeight());

		// 김영희, 21, 180.3 학생 객체를 생성해
		// 학생의 정보를 출력

		Student kim = new Student();
		kim.setName("김영희");
		kim.setAge(21);
		kim.setHeight(180.3);

		System.out.println(kim.toString());

	}

}
