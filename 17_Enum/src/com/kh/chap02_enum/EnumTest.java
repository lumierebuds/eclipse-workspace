package com.kh.chap02_enum;

import com.kh.chap02_enum.model._enum.CarColor;

public class EnumTest {
	/*
	 * enum? 
	 * 
	 * - Enumeration(열거)의 약자형. 클래스 내부에 상수값들을 열거햇다고 하여 enum이라고 명칭함.
	 * - 상수 열겨형 데이터를 간결하게 다룰수 있게 도와주는 enum 클래스
	 * 
	 */
	public static void main(String[] args) {
		System.out.println(CarColor.BLUE);
		System.out.println(CarColor.BLACK.getColor());
		System.out.println(CarColor.valueOf(3));
		CarColor.BLACK.printTest();
	}

	/*
	 * enum 장점 
	 * 
	 * 1) 컴파일 단계에서 타입을 검증 
	 * 2) 동일한 의미를 가진 상수값들을 모아서 관리할 수 있다. 
	 * 3) 상수값마다 고유한 메서드를 부여할 수 있다. 
	 * 4) 반복문을 통해 원하는 상수값을 찾을 수 있다.
	 */
}
