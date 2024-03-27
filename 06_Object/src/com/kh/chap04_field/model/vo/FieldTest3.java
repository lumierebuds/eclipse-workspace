package com.kh.chap04_field.model.vo;

// static 변수와 상수 필드 
public class FieldTest3 {
	// 접근제한자 [예약어] [예약어] 자료형 변수명;

	public static String sta = "static";
	/* 
	 * static은 '정적인, 움직이지 않는' 이라는 의미를 가짐 
	 * 즉, static 키워드는 특정 변수나 메서드를 static 영역에 움직이지
	 * 않게 고정시켜둠. 
	 * 
	 * 이렇게 고정된 데이터나 메서드는 모든 객체에서 "공유"하면서 사용된다.
	 * 
	 *  따라서 보통 자주사용되는 변수 (PI값, E값), 메서드(random(), ...) 은 static
	 *  을 선언함으로써 메모리 영역에 미리 올려두고 모든 객체에 공유하면서 사용한다.
	 *  
	 *   생성시점 : 프로그램 시작과 동시에
	 *   소멸시점 : 프로그램 종료시 
	 * */

	/*
	 * 상수 필드 
	 * public static final 자료형 변수명 = 값; 
	 * 
	 * 한번 지정된 값을 "변경" 할 수 없음.
	 * 
	 * static의 특징) 
	 * 한번만 메모리에 올려두고 공유해서 사용한다. 
	 * 
	 * 값이 변경되서는 안되는 고정적인 값을 메모리 상에 올려두고, 공유하면서 사용할 목적으로
	 * static final을 사용함 
	 */

	// 상수를 선언할땐 "대문자로 선언하는게 관례"
	public static final int NUM = 10;

	public int num = 1;

	// static 변수와 지역변수는 생성시기가 달라서 함께 사용할 수 없다.
	public static void test() {
		System.out.println(NUM /*+ num*/);
	}

}
