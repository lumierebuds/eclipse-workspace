package com.kh.chap04_field.run;

import com.kh.chap04_field.model.vo.FieldTest1;
import com.kh.chap04_field.model.vo.FieldTest2;
import com.kh.chap04_field.model.vo.FieldTest3;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FieldTest1 ft1 = new FieldTest1();
		ft1.test(3);

		FieldTest2 ft2 = new FieldTest2();
		System.out.println(ft2.pub);
		// System.out.println(ft2.pro); // 같은 패키지에서만, 다른 패키지만 상속을 통해 접근
		// System.out.println(ft2.df); // 같은 패키지에서만
		// System.out.println(ft2.pri); // ft2 클래스에서만 접근가능

		// FieldTest3 ft3 = new FieldTest3();
		// System.out.println(ft3.sta);
		// static 키워드가 붙은 변수에 접근할때
		// 클래스 자체를 통해 접근할 수 있다.

		System.out.println(FieldTest3.NUM); // static 한 접근방식
		System.out.println(FieldTest3.sta); // 클래스명.static변수명

		FieldTest3.sta = "FieldTest3.sta"; // static 만 붙여있다면 값이 변경될 수 있다.
		// FieldTest3.NUM = 30; final 키워드가 붙어있는 경우 수정이 불가능하다
		System.out.println(FieldTest3.sta);

		FieldTest3.test(); // static 메서드 호출방식
	}

}
