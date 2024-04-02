package com.kh.chap02_abstractAndInterface.part02_family.run;

import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Baby;
import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Basic;
import com.kh.chap02_abstractAndInterface.part02_family.model.vo.Mother;

public class Run {

	public static void main(String[] args) {
		// 인터페이스 적용전
//		Person p1 = new Mother("엄마", 50, 70, "출산");
//		Person p2 = new Baby("아기", 3.5, 70);
//
//		System.out.println(p1);
//		System.out.println(p2);
//
//		p1.eat();
//		p2.eat();
//
//		p1.sleep();
//		p2.sleep();
//
//		System.out.println("=== 다음날 ===");
//		System.out.println(p1);
//		System.out.println(p2);

		// 인터페이스 적용 후

		// Basic b = new Basic(); // 객체생성 불가, 참조변수로 사용가능.
		Basic b1 = new Mother("엄마", 50, 70, "출산");
		Basic b2 = new Baby("아기", 3.5, 70);

		System.out.println(b1);
		System.out.println(b2);

		b1.sleep();
		((Mother) b1).run();

		b2.sleep();
		b1.breating();
		b2.breating();

		System.out.println("=== 다음날 ===");

		System.out.println(b1);
		System.out.println(b2);
	}
}
