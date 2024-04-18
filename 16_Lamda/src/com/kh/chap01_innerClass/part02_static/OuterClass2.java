package com.kh.chap01_innerClass.part02_static;

// 정적 내부 클래스

/*
 * 2) 정적 내부 클래스 
 *  - 인스턴스 내부 클래스에서 사용할 수 없는 static필드나 메서드를 사용할 수 있는 클래스. 
 *  - 외부클래스가 로드되는 시점에 정적 내부 클래스는 static 영역에 저장공간을 할당받음. 
 *    즉, 외부클래스와 종속적이지 않음
 *  - 하나의 클래스파일을 통해 각종 클래스를 설계하고 객체를 생성할 수 있음. 
 *  - 외부클래스와 무관하게 다른 클래스에서도 객체를 생성해야한다면 정적 내부 클래스를 이용.
 *  ex) 빌더패턴구현시, DTO 클래스 구현시 자주 사용됨.
 * 
 */

public class OuterClass2 {

	private String outerStr = "외부클래스 필드";
	private static String staticOuterStr = "외부클래스 정적필드"; // static 변수 == 정적 변수
	// 클래스명.필드명;

	// 정적 내부 클래스 - 정적 내부 클래스에 접근하려면 외부클래스명.내부클래스명
	public static class StaticInnerClass {
		int num = 100;
		static int num2 = 200;

		public static void staticMethod() {
			// System.out.println(outerStr);
			System.out.println(staticOuterStr); // 사용가능(생성시점이 같음)
			// System.out.println(num); // 사용불가 (생성시점이 다름)
			System.out.println(num2);

		}

		public void method() {
			System.out.println(staticOuterStr);
			// System.out.println(outerStr); // 생성시점이 다름. (heap 메모리)
		}

	}

}
