package com.kh.chap01_abstraction.model.vo;

public class Student {

	/*
	 * public class 클래스명{
	 *  // 필드부(변수) 
	 *  
	 *  // 생성자부 
	 *  
	 *  // 메서드부
	 *  
	 * }
	 * 
	 */

	// [필드부]
	// 접근제한자 자료형 필드명;

	// 접근제한자 : 이 필드에 접근할 수 있는 범위를 제한하는 용도
	// (public > protected > default > private)
	// 클래스 영역안에서 필드를 선언할 때 반드시 접근제한자를 써 줘야 함.

	public String name;
	public int age;
	public double height;

	// 생성자부
	/*public String toString() {
		return "해당 클래스 이름은 Student 클래스입니다.";
	}*/

}
