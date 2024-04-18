package com.kh.chap01_innerClass.part01_instance;

// 외부클래스

/* 
 * 1) 인스턴스 내부 클래스
 * 
 * - 현재 클래스에서만 생성하여 사용하는 객체를 선언할때 주로 사용한다. 
 * - 필드( == 인스턴스 변수 == 멤버 변수)와 같은 위치에 선언하므로 내부 클래스
 * - 외부클래스의 보조적인 역할의 클래스를 정의할때나, 보안을 위해 캡슐화를 2중으로 적용시켜서 정보를 은닉시킬때 사용. 
 * 	 ex) ArrayList의 Iterator, HashMap의 Entry, KeySet, entrySet 컬렉션클래스에서만 사용되면서 보조적인
 *   역할만 수행하므로 각 컬렉션 클래스 내부에 추가해두었음.
 * - 인스턴스 내부 클래스를 생성하여 활용할때는 일반적으로 외부클래스의 생성자 안에서 객체를 생성하는 방식을 사용함.  
 * 
 * */

public class OuterClass {

	private String outStr = "외부 클래스 필드"; // 필드 == 인스턴스변수
	private static String staticOuterStr = "외부클래스 스태틱 변수";
	private Inner innerClass; // 내부클래스 객체를 저장할 필드

	// 외부클래스 안에서만 사용하는게 목적이므로(밀집도증가) 접근제한자를 private로 선언함.
	/*public*/ private class Inner {
		private int num; // 2중 캡슐화
		private static int sNum = 100; // 스태틱 변수나 스태틱 메서드는 클래스 생성없이 사용함.
										// 클래스명.변수명
										// 내부클래스는 외부클래스 생성전까지 메모리상에 읽히지 않음. 따라서
										// static영역으로의 할당이 불가능. (했었는데 지금은 되긴함)
										// 내부클래스에서 static 변수들을 사용하기 위해서는 외부클래스에 종속되지 않는
										// static 클래스로 생성하면 사용 가능함.

		private void privateInnertMethod() {
			System.out.println(num);
			System.out.println(outStr); // 외부 클래스의 일반필드 사용가능. private이지만 내무에 존재하기때문에.
			System.out.println(staticOuterStr);
		}
	}

	// 외부클래스 객체 생성후 내부클래스 객체가 생성된다.
	public OuterClass() {
		innerClass = new Inner();
	}

	public void outerMethod() {
		innerClass.privateInnertMethod(); // private 접근제한자가 걸려있는 인스턴스 내부 클래스의 메서드를 호출하기 위해선, 해당 객체를 이용해야한다.

	}

}
