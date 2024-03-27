package com.kh.chap04_field.model.vo;

public class FieldTest2 {
	/*
	 * 접근제한자
	 * (+)public : 어디서든 접근 가능(같은 패키지, 다른 패키지 모두)
	 * (#)protected: 같은 패키지내부, 다른 패키지라면 상속구조의 클래스에서만 접근 가능.
	 * (~)default: 오로지 같은 패키지에서만 접근 가능, 생략시 default
	 * (-)private: 오직 현재 클래스에서만 접근 가능
	 * 
	 */

	public String pub = "public";
	protected String pro = "protected";
	String df = "default";
	private String pri = "private";

}
